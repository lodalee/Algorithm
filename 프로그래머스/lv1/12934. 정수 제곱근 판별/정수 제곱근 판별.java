class Solution {
    public long solution(long n) {
        long answer = -1;
        long x = (long)Math.pow(n,0.5);
        
        if (x*x ==n){
            answer = (x+1)*(x+1);
        }
        
        // for (int i = 0; i <= Math.pow(n, 0.5); i++) {
        //     if (n == i*i){
        //         answer = (i+1)*(i+1);
        //     } 
        // }
        
        return answer;
    }
}