    class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            StringBuilder strAB = new StringBuilder();
            strAB.append(a).append(b);
            String str = strAB.toString();

            int strToInt = Integer.parseInt(str);

            if (strToInt > 2*a*b || strToInt == 2*a*b){
                answer = Integer.parseInt(str);
            } else {
                answer = 2*a*b;
            }
            return answer;
        }
    }