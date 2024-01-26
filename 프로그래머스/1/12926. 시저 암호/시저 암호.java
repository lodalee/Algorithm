class Solution {
    public String solution(String s, int n) {
        String result = "";

        // 문자열 순회
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 알파벳 대문자인 경우
            if (Character.isUpperCase(ch)) {
                char shifted = (char) ((ch - 'A' + n) % 26 + 'A');
                result += shifted;
            }
            // 알파벳 소문자인 경우
            else if (Character.isLowerCase(ch)) {
                char shifted = (char) ((ch - 'a' + n) % 26 + 'a');
                result += shifted;
            }
            // 알파벳이 아닌 경우
            else {
                result += ch;
            }
        }

        return result;
    }
}