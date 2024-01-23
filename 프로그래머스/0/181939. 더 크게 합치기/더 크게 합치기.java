class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String strAB = String.valueOf(a) + String.valueOf(b);
        String strBA = String.valueOf(b) + String.valueOf(a);

        if (strAB.compareTo(strBA) > 0) {
            answer = Integer.parseInt(strAB);
        } else {
            answer = Integer.parseInt(strBA);
        }

        return answer;
    }
}