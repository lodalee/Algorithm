class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        String lowerMyStr = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();

        if (lowerMyStr.contains(lowerPat)){
            answer = 1;
        } else {
            return answer;
        }
        return answer;
    }
}