import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];


        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];

                if (val == '.') continue;


                if (rows[i].contains(val)) return false;
                rows[i].add(val);


                if (cols[j].contains(val)) return false;
                cols[j].add(val);


                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxes[boxIndex].contains(val)) return false;
                boxes[boxIndex].add(val);
            }
        }

        return true;

    }
}
