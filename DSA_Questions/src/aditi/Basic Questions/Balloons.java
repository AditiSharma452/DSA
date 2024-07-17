//Minimum Number of Arrows to Burst Balloons
//Example 1:
//
//Input: points = [[10,16],[2,8],[1,6],[7,12]]
//Output: 2
//Explanation: The balloons can be burst by 2 arrows:
//- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
//- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
class Balloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int preEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > preEnd) {
                count++;
                preEnd = points[i][1];
            }
        }

        return count;
    }
}