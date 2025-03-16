public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String[] strs){

        String result = strs[0];

        for(int i = 1 ; i < strs.length; i++){

            String str = strs[i];
             int smallStrLength = result.length()>str.length() ? str.length():result.length();
            int  j= 0;
            while(j < smallStrLength && result.charAt(j) == str.charAt(j))
                j++;

            result = result.substring(0,j);
        }

        return result;
    }

    public static void main(String[] str){

        System.out.println("Print Longest common prefix");

//        String sts = "rahul".substring(0,1);
        String[] strs = new String[]{"dog","racecar","car"};
      String result =   getLongestCommonPrefix(strs);
        System.out.println( "result- " + result);

    }
}
