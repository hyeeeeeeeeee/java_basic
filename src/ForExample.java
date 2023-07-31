/*
 * for 반복문
 */
public class ForExample {

	public static void main(String[] args) {
		for (int index = 0; index < 100; index++) {
			System.out.println("김기정 바보");
		}
		
		int result = 0;
		for (int index = 1; index < 100; index++) {
			result += index;
			
		}
		System.out.println(result);
		
		
		
		
//		중첩 for문을 이용한 사각형 출력
/*		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
*/
		for (int i = 0; i <5 ; i++) { // 행반복
			for (int j = 0; j < 5; j++) { // 열반복
				System.out.print('*'); 
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i <10 ; i++) { // 행반복
			for (int j = 0; j <= i; j++) { // 열반복
				System.out.print(j+1 + " "); 
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i <10 ; i++) { // 행반복
			for (int j = 9; j >= i; j--) { // 열반복
				System.out.print(j + " "); 
			}
			System.out.println();
		}
		
		
//		중첩 for문을 활용한 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <10; j++) {
				System.out.print(i+ "*" +j+ "=" +(i*j)+ "\t");
			}
			System.out.println();
		}
	}

}
