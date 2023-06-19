class Solution {
    public String solution(int n) {
        String answer = "";
        
        if (n%2 == 0) {
                answer = "수박".repeat(n / 2);
            } else if (n%2 == 1){
                answer = "수박".repeat(n/2) + "수";
            }
        return answer;
    }
}