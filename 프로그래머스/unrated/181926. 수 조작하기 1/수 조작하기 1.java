class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] arrArr = control.toCharArray();
        for(char i :  arrArr) {
	        switch (i) {
			case 'w':
				n += 1;
				break;
			case 's':
				n -= 1;
				break;
			case 'd':
				n += 10;
				break;
			case 'a':
				n -= 10;
				break;
			}
        };
        answer = n;
        return answer;
    }
}