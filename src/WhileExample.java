/*
 * 반복문 while
 */
public class WhileExample {

	public static void main(String[] args) {
		int index = 0;
		while (index <= 100) {
			System.out.println("김기정 바보!!!");
			index++;
		}
		
		
//		system.out.println(1+2+3+4+5+6+7+8+9+10);
		
/*		int result = 0;
		index = 1;
		while (index <= 100) {
			result = result + index;
			result += index;
			index++;
		}
		System.out.println("누적합 :" + result);
*/		
		int oddSum = 0, evenSum = 0;
		index = 1;
		while (index <= 100) {
			
			if(index % 2 == 0) {
				evenSum += index;
		}else {
			oddSum += index;
		}
		index++;
		
		}	
	System.out.println("누적합 : " + (oddSum + evenSum));
	System.out.println("홀수합 : " + oddSum);
	System.out.println("짝수합 : " + evenSum);
	
	index = 0;
	do {
		System.out.println("풀스택 웹 개발자과정 화이팅!!!");
		index++;
	} while (index < 100);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
