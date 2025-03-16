import java.util.Scanner;

public class ReverseWordsInAString {

    public static String reverseWords(String s){

        StringBuilder resultStr = new StringBuilder();

        if(s != null && !s.isEmpty()) {

            s = s.trim();

            String[] sArr = s.split(" ");

            for (int i = sArr.length - 1; i > 0; i--) {

                if(sArr[i].isEmpty()) continue;
                resultStr.append(sArr[i]);
                resultStr.append(" ");
            }

            resultStr.append(sArr[0]);

        }

       return resultStr.toString();
    }

    public static String reverseWords2(String s){

        StringBuilder resultStr = new StringBuilder();

        if(s != null && !s.isEmpty()) {

            s = s.trim();


            for (int i = s.length() - 1; i >= 0; i--) {



            }



        }

        return resultStr.toString();
    }

    public static void main(String[] args){
        System.out.println("Reverse Words in A String");

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a String --");

        while(true){

            String s = sc.nextLine();

          String result =   reverseWords(s);

          System.out.println("result ->"+result);
        }



    }
}
