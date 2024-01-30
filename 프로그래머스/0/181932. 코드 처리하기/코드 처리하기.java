class Solution {
    public String solution(String code) {
        boolean mood = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (ch == '1'){
                mood = !mood;
                continue;
            }

            if (mood == false && i % 2 == 0){
                sb.append(ch);
            } else if (mood == true && i % 2 == 1){
                sb.append(ch);
            }
        }
        return sb.length() == 0? "EMPTY" : sb.toString();
    }
}