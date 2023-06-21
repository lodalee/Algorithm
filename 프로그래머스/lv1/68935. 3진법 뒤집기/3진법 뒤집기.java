class Solution {
    public int solution(int n) {
        int answer = 0;
        
         String ternary = "";
        while (n > 0){
            ternary = (n % 3) + ternary;
            n /= 3;
        }
        String reverseTernary = new StringBuilder(ternary).reverse().toString();
        answer = Integer.parseInt(reverseTernary,3);
        return answer;
        
    }
}