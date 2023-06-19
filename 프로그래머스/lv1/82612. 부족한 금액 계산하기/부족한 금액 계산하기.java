class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        long answer =0;
        
        for (int i = 0; i <count ; i++) {
            sum += price*(i+1); //30
            System.out.println(sum);
        }
        if (sum > money){
            answer = sum - money;
        }
        
        return answer;
    }
}