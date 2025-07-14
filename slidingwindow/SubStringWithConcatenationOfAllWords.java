import java.util.ArrayList;
import java.util.List;

public class SubStringWithConcatenationOfAllWords {

    public static void main(String[] args){

        System.out.println("30. Substring with Concatenation of All Words  - hard problem");

        String s = "ababaab" ;
        String[] words = new String[]{"ab","ba","ba"};
        System.out.println(findSubstring(s, words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {

        int left = 0 ;

        int wf = 0;

        for(int i = 0 ; i < words.length ; i++){

            wf += words[i].length();
        }

        int right = wf ;

        List<Integer> result = new ArrayList<>();

        while( right <= s.length()){

            String subStr = s.substring(left, right);
            int i = 0;
            for(i = 0 ; i < words.length ; i++){

                if(subStr.contains(words[i])){

                    subStr =  subStr.replaceFirst(words[i],"");
                    System.out.println(subStr);
                    continue;

                }
                else{

                    break;
                }

            }

            if( i == words.length && subStr.equals("")){

                result.add(left);

            }

            left++;
            right++;
        }

        return result;
    }
}
