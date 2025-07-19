public class IsomorphiString {

    public static void main(String[] args){

        System.out.println("This is Ransome Note problems");

        String s = "egg";
        String t= "add";
        int RansomeNote = 0;

        System.out.println("result - "+isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // Mapping from s to t
        int[] mapT = new int[256]; // Mapping from t to s

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Use i + 1 to differentiate from default 0 value
            if (mapS[chS] != mapT[chT]) {
                return false;
            }

            mapS[chS] = i + 1;
            mapT[chT] = i + 1;
        }

        return true;
    }
}
