class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        if (myString.length() > pat.length()){
            for (int i = 0; i < pat.length(); i++) {
                String pre = myString.substring(0,i+1);
                if (pat.contains(pre)){
                    answer = 1;
                } else {
                    answer = 0;
                    break;
                }
            }
        } else {
            if (myString.equals(pat)){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}
