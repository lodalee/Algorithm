class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        String[] digits = num.split("");
        int[] answer = new int[digits.length];
        
        for (int i = digits.length - 1; i >= 0; i--) {
            answer[(digits.length - 1) - i] = Integer.parseInt(digits[i]);
        }
        
        return answer;
    }
}