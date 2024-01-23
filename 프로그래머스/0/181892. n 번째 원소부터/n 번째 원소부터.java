import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = n-1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}