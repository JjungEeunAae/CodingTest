import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = 0;			// 결과 값
		
		if(A == B && B == C && A == C) {
			
			result = 10000 + A * 1000;
			
		} else if(A == B || A == C) {
			
			result = 1000 + A * 100;
			
		} else if(B == C) {
			
			result = 1000 + B * 100;
			
		} else {
			
			result = Math.max(Math.max(A, B), C) * 100;
		}
		
		System.out.println(result);
		
	}
}