import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] arr) {
        int num = arr[0];
        int a = arr.length;
        //요소가 1개일때
        if (arr.length == 1){
           return new int[]{-1};
        }

        //최솟값 구하기
        for (int i = 0; i < a; i++) {
            if (num > arr[i]){
                num = arr[i];
            }
        }
        //최솟값 없는 배열 만들기
        int count = 0;
        int[] newArr = new int[a-1];
        for (int i = 0; i < a; i++) {
            if (arr[i] != num) {
                newArr[count] = arr[i];
                count++;
            }
        }
       return newArr;
    }
}