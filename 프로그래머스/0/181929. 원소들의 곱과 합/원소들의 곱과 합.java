class Solution {
    public int solution(int[] num_list) {
        double squ = 0;
        int mul = 1;
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            squ += num_list[i];
            mul *= num_list[i];
        }

        squ = Math.pow(squ, 2);

        if (mul < (int)squ) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}