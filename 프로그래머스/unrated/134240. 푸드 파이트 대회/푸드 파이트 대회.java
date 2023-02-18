import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 1; i <= food.length; i++) {
            int n = food[i-1];
            sb.append(Integer.toString(i-1).repeat(n/2));
        }
        sb2.append(sb + "0");
        sb2.append(sb.reverse().toString());
        
        return sb2.toString();
    }
}