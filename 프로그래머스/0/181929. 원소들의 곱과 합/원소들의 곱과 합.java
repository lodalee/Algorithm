class Solution {
    public int solution(int[] num_list) {
        int squ = 0;
        int mul = 1;
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            squ += num_list[i];
            mul *= num_list[i];
        }

        answer = Math.pow(squ,2) > mul ? 1 : 0;

        return answer;
    }
}