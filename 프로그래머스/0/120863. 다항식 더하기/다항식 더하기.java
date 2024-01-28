class Solution {
    public String solution(String polynomial) {
            String[] str_arr = polynomial.split(" ");
            int sumX = 0;
            int sum = 0;
            String add = "+";

            for (int i = 0; i < str_arr.length; i++) {
                if (str_arr[i].contains("x")){
                    if (str_arr[i].equals("x")){
                        sumX += 1;
                    } else if (str_arr[i].endsWith("x")){
                        int xSum = Integer.parseInt(str_arr[i].substring(0, str_arr[i].indexOf("x")));
                        sumX += xSum;
                    }
                } else if (!str_arr[i].contains("+")) {
                    sum += Integer.parseInt(str_arr[i]);
                }
            }

            String answer = "";
            if (sum == 0 && sumX == 1) {
                answer = "x";
            } else if (sum == 0) {
                answer = sumX + "x";
            } else if (sumX == 0){
                answer = sum + "";
            } else if (sum != 0 && sumX == 1) {
                answer = "x" + " " + add + " " + sum;
            } else {
                answer = sumX + "x" + " " + add + " " + sum;
            }
            return answer;
    }
}