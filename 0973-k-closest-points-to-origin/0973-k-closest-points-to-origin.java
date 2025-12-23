class Solution {

    public class Triplet implements Comparable<Triplet> {
        int dist;
        int x;
        int y;

        Triplet(int dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Triplet t) {
            return Integer.compare(this.dist, t.dist);
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Triplet> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int dist = x * x + y * y;

            pq.add(new Triplet(dist, x, y));
            if (pq.size() > k) pq.remove();
        }

        int[][] ans = new int[k][2];
        int idx = 0;

        while (!pq.isEmpty()) {
            Triplet t = pq.remove();
            ans[idx][0] = t.x;
            ans[idx][1] = t.y;
            idx++;
        }

        return ans;
    }
}
