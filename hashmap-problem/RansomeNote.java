public class RansomeNote {

    public static void main(String[] args){

        System.out.println("This is Ransome Note problems");

        String ransomeNoteStr = "aa";
        String magazine = "ab";
        int RansomeNote = 0;

        System.out.println("result - "+canConstruct(ransomeNoteStr,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];

        // Count each character in the magazine
        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) {
                return false; // character not available
            }
            letters[c - 'a']--;
        }

        return true; // all characters found
    }
}
