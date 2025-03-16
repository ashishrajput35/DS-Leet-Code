public class LengthOfLastWord {

    public static int getLengthOfLastWord(String s){

        StringBuilder lastWord = new StringBuilder();

        for(int i = s.length()-1; i >= 0; i--){

            if(!lastWord.isEmpty() && s.charAt(i) == ' ') break;

            if(s.charAt(i) != ' '){
                lastWord.append(s.charAt(i));
            }

        }

       return lastWord.toString().length();
    }

    public static void main(String[] args){

        System.out.println("Length of last word");

        int lastWordLength = getLengthOfLastWord("   fly me  to  the moond a   ");

        System.out.println( "last word length - "+lastWordLength );

    }
}
