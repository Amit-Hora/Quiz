import java.util.HashMap;
import java.util.Map;

public class Q205_Isomorphic_Strings {

    public static void main(String args[]){
        Q205_Isomorphic_Strings obj = new Q205_Isomorphic_Strings();
        System.out.println(obj.isIsomorphic("badc","baba"));
    }


    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> st_rule = new HashMap<>();
        Map<Character,Character> ts_rule = new HashMap<>();
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        for(int i=0;i<sarray.length;i++){

            st_rule.putIfAbsent(sarray[i],tarray[i]);
            ts_rule.putIfAbsent(tarray[i],sarray[i]);
            if(st_rule.get(sarray[i])!=tarray[i] || ts_rule.get(tarray[i])!=sarray[i]){
                return false;
            }


        }




        return true;
    }
}
