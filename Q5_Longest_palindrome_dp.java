public class Q5_Longest_palindrome_dp {

    public static void main(String args[]){
        Q5_Longest_palindrome_dp obj = new Q5_Longest_palindrome_dp();
        System.out.println(obj.longestPalindrome("cbbd"));

    }
    public String longestPalindrome(String s) {



        int start = 0;
        int end =0 ;
        for(int i= 0; i< s.length();i++){

            int len1 = expand(s,i,i); //"racecar"
            int len2 = expand(s,i,i+1);  //abba

            int len = Math.max(len1,len2);
            if(len > end - start){

                start = i - ((len-1)/2);
                end = i+len/2;

            }

        }
        return s.substring(start,end+1);
    }

    public int expand(String s, int left,int right){

        if(s==null || left>right) return  0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;


        }
        return right-left -1;

    }
}
