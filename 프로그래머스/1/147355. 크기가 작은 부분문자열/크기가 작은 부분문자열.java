class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - (p.length()-1);

        for (int i = 0; i < length; i++) {
            String substring = t.substring(i, i + p.length());
            if (substring.compareTo(p) <= 0) {
                answer++;
            }
        }

        return answer;
    }
}