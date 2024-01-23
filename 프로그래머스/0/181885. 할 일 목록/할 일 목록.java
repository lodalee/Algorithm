class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        //fasle인 항목의 개수 파악
        int count = 0;
        for (boolean isFinished : finished){
            if(!isFinished){
                count++;
            }
        }
        
        //false인 항목을 담을 String 배열 생성
        String[] answer = new String[count];
        
        //false인 항목을 String 배열에 담기
        int index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]){
                answer[index] = todo_list[i];
                index++;
            }
        }
        return answer;
    }
}