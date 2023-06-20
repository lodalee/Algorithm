class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String num = Long.toString(x);
        String[] digits = num.split("");
        int sumDigit = 0;

        for (int i = 0; i <num.length() ; i++) {
            sumDigit += Integer.parseInt(digits[i]);
        }

        if(x % sumDigit==0 ){
            answer= true;
        } else{
            answer = false;
        }
        
        return answer;
    }
}