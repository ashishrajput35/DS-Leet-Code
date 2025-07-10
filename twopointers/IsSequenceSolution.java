

public class IsSequenceSolution {

    public static void main(String[] args){

        System.out.println("Is subSequence - easy problem");
//        String s = "abc";
//        String t = "ahbgdc";

        String s = "axc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s,t));

    }



    public static boolean isSubsequence(String s, String t) {

        int count = 0;

        if(s.isEmpty())
            return true;

        if(t.isEmpty())
            return false;

        if(s.length() > t.length())
            return false;

        for(int i = 0 ; i < t.length() ; i++){


            if( t.charAt(i) == s.charAt(count) )
                count++;

            if(count == s.length())
                return true;


        }

        return false;

    }
}
