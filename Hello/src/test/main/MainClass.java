package test.main;

public class MainClass {//MainClass 라는 이름의 클래스 만들기
	
	public static void main(String[] args) {//Main이라는 이름의 메소를 클래스 안에 만들기
		//main() 메소드 안에 있는 코드를 실핼하려면 run버튼 누르기
		System.out.println("hello world");
		System.out.println("정나영");
		
		//변수 타입을 맞춰주기 
		int num = 10;
		num = 20;
		//num = 10.1 //실수는 안들어감, 타입이 고정되지 않음:동적
		double num2 = 10.2;
		num2 = 10.9;
		
		boolean isRun = true;
		isRun = false;
		
		String myName = "안녕";//키값 들어있음
		myName = "바보";
		
	}
}

