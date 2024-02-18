class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int hgt : array) {
            if (hgt > height) answer++;
        }
        
        return answer;
    }
}