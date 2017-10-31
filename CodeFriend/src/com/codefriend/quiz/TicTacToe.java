package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class PointsAndScores {

    int score;
    Point point;

    PointsAndScores(int score, Point point) {
        this.score = score;
        this.point = point;
    }
}


public class TicTacToe {
	/**
	 * Each cell can be X 0 or empty
	 * @param args
	 */
	public enum Cell{E,X,O}
	List<Point> availablePoints;
	List<PointsAndScores> rootsChildrenScores;
	Scanner scan;
	private Cell[][] board;
	
	public TicTacToe() {
		scan=new Scanner(System.in);
		board=new Cell[3][3];
		// initialize them to empty O
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				board[i][j]=Cell.E;
			}
		}
		
	}
	public boolean isGameOver() {
        //Game is over is someone has won, or board is full (draw)
        return (hasXWon() || hasOWon() || getAvailableStates().isEmpty());
    }
	 public boolean hasXWon() {
	        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == Cell.X) || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == Cell.X)) {
	            //System.out.println("X Diagonal Win");
	            return true;
	        }
	        for (int i = 0; i < 3; ++i) {
	            if (((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == Cell.X)
	                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == Cell.X))) {
	                // System.out.println("X Row or Column win");
	                return true;
	            }
	        }
	        return false;
	    }
	 
	 
	 public boolean hasOWon() {
	        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == Cell.O) || (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] == Cell.O)) {
	            // System.out.println("O Diagonal Win");
	            return true;
	        }
	        for (int i = 0; i < 3; ++i) {
	            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] == Cell.O)
	                    || (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] == Cell.O)) {
	                //  System.out.println("O Row or Column win");
	                return true;
	            }
	        }
	        return false;
	 }
	
	 
	 public void placeAMove(Point point, Cell value) {
	        board[point.x][point.y] = value;   //player = 1 for X, 2 for O
	    }

	@Override
	public String toString() {
		
		String result="";
		for (Cell[] cells : board) {
			for(Cell value:cells){
				result=result+value+"	";
			}
			result=result+"\n";
		}
		return result;
	}
	
	
	  public List<Point> getAvailableStates() {
	        availablePoints = new ArrayList<>();
	        for (int i = 0; i < board.length; ++i) {
	            for (int j = 0; j < board[i].length; ++j) {
	                if (board[i][j] == Cell.E) {
	                    availablePoints.add(new Point(i, j));
	                }
	            }
	        }
	        return availablePoints;
	    }
	  
	  
	  public Point returnBestMove() {
	        int MAX = -100000;
	        int best = -1;

	        for (int i = 0; i < rootsChildrenScores.size(); ++i) { 
	            if (MAX < rootsChildrenScores.get(i).score) {
	                MAX = rootsChildrenScores.get(i).score;
	                best = i;
	            }
	        }

	        return rootsChildrenScores.get(best).point;
	    }
	  
	  void takeHumanInput() {
	        System.out.println("Your move: ");
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        Point point = new Point(x, y);
	        placeAMove(point, Cell.O); 
	    }
	  
	  public int returnMin(List<Integer> list) {
	        int min = Integer.MAX_VALUE;
	        int index = -1;
	        for (int i = 0; i < list.size(); ++i) {
	            if (list.get(i) < min) {
	                min = list.get(i);
	                index = i;
	            }
	        }
	        return list.get(index);
	    }
	  
	  public int returnMax(List<Integer> list) {
	        int max = Integer.MIN_VALUE;
	        int index = -1;
	        for (int i = 0; i < list.size(); ++i) {
	            if (list.get(i) > max) {
	                max = list.get(i);
	                index = i;
	            }
	        }
	        return list.get(index);
	    }
	  
	  
	  public void callMinimax(int depth, int turn){
	        rootsChildrenScores = new ArrayList<>();
	        minimax(depth, turn);
	    }
	  
	  public int minimax(int depth, int turn) {

	        if (hasXWon()) return +1;
	        if (hasOWon()) return -1;

	        List<Point> pointsAvailable = getAvailableStates();
	        if (pointsAvailable.isEmpty()) return 0; 

	        List<Integer> scores = new ArrayList<>(); 

	        for (int i = 0; i < pointsAvailable.size(); ++i) {
	            Point point = pointsAvailable.get(i);  

	            if (turn == 1) { //X's turn select the highest from below minimax() call
	                placeAMove(point, Cell.E); 
	                int currentScore = minimax(depth + 1, 2);
	                scores.add(currentScore);

	                if (depth == 0) 
	                    rootsChildrenScores.add(new PointsAndScores(currentScore, point));
	                
	            } else if (turn == 2) {//O's turn select the lowest from below minimax() call
	                placeAMove(point, Cell.O); 
	                scores.add(minimax(depth + 1, 1));
	            }
	            board[point.x][point.y] = Cell.E; //Reset this point
	        }
	        return turn == 1 ? returnMax(scores) : returnMin(scores);
	    }
	  
	  

	  
	  

	  
	public static void main(String[] args) throws Exception{
		
		System.out.println("Initiliazing board ....");
		TicTacToe ticTacToe=new TicTacToe();
		
		System.out.println(ticTacToe);
		
		System.out.println("Computer Thinking..");
		while (!ticTacToe.isGameOver()) {
            System.out.println("Your move: ");
            Point userMove = new Point(ticTacToe.scan.nextInt(), ticTacToe.scan.nextInt());

            ticTacToe.placeAMove(userMove, Cell.O); //2 for O and O is the user
            ticTacToe.displayBoard();
            if (ticTacToe.isGameOver()) {
                break;
            } 
            ticTacToe.callMinimax(0, 1);
           /* for (PointsAndScores pas : ticTacToe.rootsChildrenScores) {
                System.out.println("Point: " + pas.point + " Score: " + pas.score);
            }*/
            ticTacToe.placeAMove(ticTacToe.returnBestMove(), Cell.X);
            ticTacToe.displayBoard();
        }
        if (ticTacToe.hasXWon()) {
            System.out.println("Unfortunately, you lost!");
        } else if (ticTacToe.hasOWon()) {
            System.out.println("You win! This is not going to get printed.");
        } else {
            System.out.println("It's a draw!");
        }
    }
	private void displayBoard() {
		System.out.println(this.toString());
		
	}		
		
		
	}


