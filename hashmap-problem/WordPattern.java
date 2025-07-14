import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

    public static void main(String[] str){

        System.out.println(" Word Pattern Related Problem - ");

        String pattern = "abba";
        String s ="dog dog dog dog";

        System.out.println(checkWordPattern(pattern,s));


    }

    public static boolean checkWordPattern(String pattern, String s){
        int pL = pattern.length();

        String[] splitS = s.split(" ");
        int sL = splitS.length;

        if(pL != sL)
            return false;

        Map<Character,String> mapping1 = new HashMap<>();
        Map<String,Character> mapping2 = new HashMap();



        for(int i = 0; i< sL ; i++){

            char pChar = pattern.charAt(i);

            String str = splitS[i];

            if(mapping1.containsKey(pChar) || mapping2.containsKey(str)) {
                if(!str.equals(mapping1.get(pChar)) || !Objects.equals(mapping2.get(str), pChar)) {
                    return false;
                }
            } else {
                mapping1.put(pChar, str);
                mapping2.put(str, pChar);
            }


        }

        return true;

    }
}
