class Solution {
    public int solution(int angle) {
        switch(angle) {
            case 90 : return 2;
            case 180 : return 4;
            default : 
                if(angle > 90) return 3;
                else return 1;
        }
    }
}