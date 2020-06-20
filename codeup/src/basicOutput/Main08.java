package basicOutput;
/*	특수문자를 출력하는 연습을 해보자.
 * 	[참고] 유니코드로 특수문자를 표현한다고 하자.
 * 	(운영체제 또는 컴파일러에 따라 사용되는 문자의 코드표가 다르다.)
 * 	
 * 	유니코드 특수문자를 출력하는 방법,
 * 	...
 * 	System.out.println("\u250C\u252C\u2510\n");
 * 	...
 */
public class Main08 {
	public static void main(String[] args) {
		System.out.println("\u250C\u252C\u2510\n");
		System.out.println("\u251C\u253C\u2524\n");
		System.out.println("\u2514\u2534\u2518\n");
	}
}
