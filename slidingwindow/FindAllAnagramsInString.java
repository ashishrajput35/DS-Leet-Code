import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllAnagramsInString {

    public static void main(String[] args){

        System.out.println("find all anagrams in the given string - ");
        String s = "abab";
        String p = "ab";

        System.out.println(findAnagrams(s,p));
    }





    public static List<Integer> findAnagrams(String s,String p){

        int pLength = p.length();
        int sLength = s.length();

        if(pLength> sLength)
            return Collections.emptyList();

        List<Integer> resList = new ArrayList<>();

        int[] countP = new int[26];

        int[] countS = new int[26];

        for(int i = 0; i < pLength ; i++){

            countP[p.charAt(i)-'a']++;
            countS[s.charAt(i)-'a']++;

        }

        if(Arrays.equals(countP,countS)){
            resList.add(0);
        }

        for(int right = pLength; right < sLength ; right++){

            countS[s.charAt(right)-'a']++;
            countS[s.charAt(right-pLength) -'a']--;

            if(Arrays.equals(countP,countS))
                resList.add(right-pLength+1);

        }

      return resList;
    }







}
