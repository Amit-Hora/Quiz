package com.codefriend.quiz;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadLastCharacters {
    public static void main(String[] args) throws IOException {
        //
        // Defines the path to the log file and creates a ByteBuffer.
        //
/*        Path logPath = 
                Paths.get("C:\\gitRepo1\\CodeFriend\\src\\com\\codefriend\\quiz\\namefile.txt");
*/        
        try {

            // create a new RandomAccessFile with filename test
            RandomAccessFile raf = new RandomAccessFile("C:\\gitRepo1\\CodeFriend\\src\\com\\codefriend\\quiz\\namefile.txt", "r");
            
            int len = (int) raf.length();
            int split = len / 2;
            int trail = 0;
            int lead = 0;
     
            for (int i = 0; i < split; i++)

            {
                   raf.seek(i);
                   lead = raf.readChar();
                   System.out.println("X " + lead);

                   if (i == 0) {
                         raf.seek(len - 1);
                         trail = raf.read();
                         //System.out.println("a " + trail);
                   

                   } else {
                         raf.seek(len - 1 - i);
                         trail = raf.read();
                         // System.out.println("b " + trail);
                         

                   }

                   if (lead == trail) {

                         if (i == split - 1) {
                                System.out.println("is palindrome");
                         }
                   } else {

                         System.out.println("is not palindrome");

                         break;
                   }

            }
            // System.out.println(len);

     } catch (IOException ex) {
            ex.printStackTrace();
     }

  /*      ByteBuffer buffer = ByteBuffer.allocate(14);
   * 
   * 
        ByteBuffer buffer1 = ByteBuffer.allocate(1);

        try {
            //
            // Creates FileChannel and open the file channel for read access.
            //
            FileChannel channel = FileChannel.open(logPath, StandardOpenOption.READ);
            FileChannel channel1 = FileChannel.open(logPath, StandardOpenOption.READ);

            //
            // Read a sequence of bytes from the channel into the buffer starting
            // at given file position, which is the channel size - 1000. Because
            // we are going to read the last 1000 characters from the file.
            //
            channel.read(buffer, channel.size() - 1);
            System.out.println("Characters = " + new String(buffer.array()));
            channel1.read(buffer1, channel1.size());
            System.out.println("Characters = " + new String(buffer1.array()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    	
//    	File target= new File("C:\\gitRepo1\\CodeFriend\\src\\com\\codefriend\\quiz\\namefile.txt");
    	 try {
    	      
  
             
//             char c = 'H';
             
             // create a new RandomAccessFile with filename test
             RandomAccessFile raf = new RandomAccessFile("C:\\gitRepo1\\CodeFriend\\src\\com\\codefriend\\quiz\\namefile.txt", "rw");

             // write something in the file
//              	.writeChar('C');

             // set the file pointer at 0 position
             raf.seek(1);
             raf.writeChar('i');
             raf.seek(1);
             
             // read char
             System.out.println("" + raf.readChar());
//             raf.seek(2);
             raf.writeChar('a');
             raf.writeChar('m');
             raf.writeChar('i');
             raf.writeChar('t');
             raf.seek(2);
             
             System.out.println("" + raf.readChar());
//             raf.seek(1);

             // print the string
//             System.out.println("" + raf.readUTF());

             // set the file pointer at 5 position
//             raf.seek(5);
             
             
          } catch (IOException ex) {
             ex.printStackTrace();
          }*/
    }
}