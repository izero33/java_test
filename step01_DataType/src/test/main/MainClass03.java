package test.main;
/*
 * [java 기본 데이터 타입]
 * 2. 논리형
 * 
 * true, false 두가지 값중 하나다
 * true, false 를 직접 쓰거나 혹은 논리 연산의 결과로 얻어낼 수 있다
 * 참과 거짓을 나타내는 데이터 타입
 */
public class MainClass03 {
public static void main(String[] args) {
	//논리혈 변수 선언과 동시에 값 대입하기
	boolean isRun = false;
	
	if (isRun) {
		System.out.println("달려요");
	}
	// 비교연산의 결과로 얻어진 boolean 값 담기
	boolean isGreater =10>1;
	// 논리연산의 결과로 얻어진 boolean 값 담기
	boolean result = true || false;
	//한번 선언한 변수는 다시 선언할 수 없다
	//boolean result = false;
	result=false;//변수에 값을 대일할 수 있다(동일한탕비일 경우)
}
}
