class Solution {
    public int solution(int[][] dots) {
        //조합될 수 있는 경우
        //1,2 3,4
        //1,3 2,4
        //1,4 2,3

        //기울기를 이용하여 같은지 비교
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        int answer = 0;

        double slope1 = (double)(y2 - y1) / (x2 - x1);
        double slope2 = (double)(y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;

        slope1 = (double)(y3 - y1) / (x3 - x1);
        slope2 = (double)(y2 - y4) / (x2 - x4);
        if (slope1 == slope2) answer = 1;

        slope1 = (double)(y4 - y1) / (x4 - x1);
        slope2 = (double)(y3 - y2) / (x3 - x2);
        if (slope1 == slope2) answer = 1;

        return answer;
    }
}