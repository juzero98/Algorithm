class Solution {
    public int solution(String s) {
        int result = 0;
        String[] numberStrs = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < 10; i++)
			s = s.replace(numberStrs[i], Integer.toString(i));
		
		result = Integer.parseInt(s);
        
        return result;
    }
}