public class MinArrowShots {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 0;
        long arrowPos = Long.MIN_VALUE;

        for (int[] balloon : points) {
            int start = balloon[0];
            int end = balloon[1];


            if (start > arrowPos) {
                arrows++;
                arrowPos = end;
            }
        }

        return arrows;
    }


}
