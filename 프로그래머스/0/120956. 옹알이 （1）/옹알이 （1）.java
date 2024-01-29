class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        // 네 가지 발음
        String[] 옹알이 = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String temp = babbling[i];
            for (int j = 0; j < 옹알이.length; j++) {
                temp = temp.replace(옹알이[j], " ");
            }
            temp = temp.replace(" ","");
            if (temp.length() == 0){
                answer++;
            }
        }

        return answer;
    }
}