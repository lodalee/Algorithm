class Solution {
    public String solution(String code) {
        boolean mood = false;
        StringBuilder ret = new StringBuilder();
        String[] strArr = code.split("");

        //code for 문으로 순회
        for (int i = 0; i < code.length(); i++) {
            //code[i]가 0이면 mood == false; /code[i] 가 1이면 mood = true;
            if (strArr[i].equals("1")){
                mood = !mood;
            }

            if (!(strArr[i].equals("1"))){
                // (false) 짝수면 ret.append(code[i]);
                if (mood == false && i % 2 == 0){
                    ret.append(strArr[i]);
                // (true) 홀수면 ret.append(code[i]);
                } else if (mood == true && i % 2 == 1) {
                    ret.append(strArr[i]);
                }
            }
        }

        String answer = "";
        if (ret.length() == 0){
            return "EMPTY";
        } else {
           return ret.toString();
        }
    }
}