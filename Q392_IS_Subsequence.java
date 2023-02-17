public class Q392_IS_Subsequence {

    public static void main(String args[]){

        Q392_IS_Subsequence obj = new Q392_IS_Subsequence();
        System.out.println(obj.isSubsequence("axc","ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {

        char sarray[] = s.toCharArray();
        char tarray[]=t.toCharArray();
        int i=0,j=0;
        while(i< sarray.length && j< tarray.length){

            if(sarray[i] == tarray[j]){
                j++;i++;
            }
            else{
                j++;
            }
        }


        if(i==sarray.length)
            return true;
        return false;


    }
}
