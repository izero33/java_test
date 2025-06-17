package test.main;
//산술연산자 테스트
public class MainClass01 {
public static void main(String[] args) {
	int num1 = 5;
	int num2 = 2;
	//+연산하기
	int sum = 10+1;
	int sum2 = num1+num2;
	int sum3 = 10+ num2;
	
	//정수끼리 연산>정수
	int result = 5/3;
	int result2 =num1/num2;
	
	//연산의 결과로 실수 > 적어도 하나는 실수
	double result3 = 5/ 3.0;
	
	
	byte a =10;
	//a는 byte 타입이다. a에 저장된 값을 int 타입 b에 대입하는건 문제 없을까?
	int b = a;
	//b는 int 타입인데 b에 저장된 값을 byte 타입 c에 대입하는건 문제 발생? 
	//문제가 있을 수도 있고 없을 수도 있음
	//byte c = b;
	byte c = (byte)b; //강제로 byte 타입으로 
	//b자체는 int 타입이지만 (byte)연산자로 casting 하면
	//대입연산자 우측에는 byte 타입이 있다고 간주되어 오류 없음
	// 대신 b 안에 들어있는 값이 byte범위 안에 있다는 것이 확실할때만 casting
}
}
