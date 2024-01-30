class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[][] newSizes = new int[sizes.length][2];

        // 배열 순회하기
        for (int i = 0; i < sizes.length; i++) {
            int firstElement = sizes[i][0];
            int secondElement = sizes[i][1];

            // [0]번째의 요소가 [1]번째의 요소보다 크면 서로 값을 바꿔주기
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            // 변경된 배열을 newSizes에 저장
            newSizes[i][0] = sizes[i][0];
            newSizes[i][1] = sizes[i][1];
        }

        // 가장 큰 수 찾기
        int maxFirstElement = newSizes[0][0];
        int maxSecondElement = newSizes[0][1];

        for (int i = 0; i < sizes.length; i++) {
            if (newSizes[i][0] > maxFirstElement) {
                maxFirstElement = newSizes[i][0];
            }
            if (newSizes[i][1] > maxSecondElement) {
                maxSecondElement = newSizes[i][1];
            }
        }

        // [0]번째의 요소중 가장 큰 값과 [1]번째의 요소중 가장 큰 값을 곱하기
        answer = maxFirstElement * maxSecondElement;

        return answer;
    }
}