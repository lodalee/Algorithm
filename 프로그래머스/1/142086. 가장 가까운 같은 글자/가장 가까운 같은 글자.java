import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> last = new HashMap<>();
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (last.containsKey(ch)){
                answer[i] = i - last.get(ch);
            } else {
                answer[i] = -1;
            }
            last.put(ch,i);

        }
        return answer;
    }
}