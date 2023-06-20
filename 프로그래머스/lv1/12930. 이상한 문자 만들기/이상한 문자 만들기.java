class Solution {
    public String solution(String s) {
        //문자열을 공백까지 하나씩 쪼개어준다.
        StringBuilder answer = new StringBuilder();
        String[] splitWords = s.split("");
        //{"t","r","y"," ","h","e","l","l","o","" ~~~}
        //s를 index 0부터 돌면서 index가 짝수이면 대문자, index가 홀수이면 소문자
        int index = 0;

        for (int i = 0; i < splitWords.length; i++) {
            if (splitWords[i].equals(" ")) {
                index = 0;
            } else if (index % 2 == 0) {
                splitWords[i] = splitWords[i].toUpperCase();
                index++;
            } else {
                splitWords[i] = splitWords[i].toLowerCase();
                index++;
            }
            //answer에 하나씩 붙여준다.
            answer.append(splitWords[i]);
        }
        return answer.toString();
    }
}