class Solution {
    public int[] solution(int[] num_list, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(num_list[i]);
        }

        int[] answer = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            answer[i] = Character.getNumericValue(sb.charAt(i));
        }
        return answer;
    }
}