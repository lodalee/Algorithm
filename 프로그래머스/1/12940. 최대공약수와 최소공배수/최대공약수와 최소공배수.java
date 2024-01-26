class Solution {
    public static int gcd(int n, int m) {
        while (m != 0){
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }

    public static int lcm(int n, int m){
        return n * (m / gcd(n,m));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = lcm(n, m);
        return answer;
    }
}