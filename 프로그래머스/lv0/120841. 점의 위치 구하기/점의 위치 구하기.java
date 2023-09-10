class Solution {
    public int solution(int[] dot) {
        if(dot[0] > 0) { // x 양수
            return dot[1] > 0 ? 1 : 4;
        } else { // x 음수
            return dot[1] > 0 ? 2 : 3;
        }
    }
}