class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        boolean answer;
        String[] sChar = new String[s.length()];

        for (int i = 0; i <s.length() ; i++) {
            sChar[i] = String.valueOf(s.charAt(i));
            if(sChar[i].contains("p") || sChar[i].contains("P")){
                pCount++;
            } else if (sChar[i].contains("y") || sChar[i].contains("Y")){
                yCount++;
            }
        }
        if (pCount == yCount){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}