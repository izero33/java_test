package step03_Class;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 타입의 객체의 참조값을 담을 수 있는 c1이라는 이름의 비어있는 변수 만들기
		Car c1 = null;
		//Car class로 객체를 생성하고 할당된 참조값을 c1에 대입하기
		c1 = new Car(); 
		//c1에 들어있는 참조값을 이용하여 drive() 메소드 호출하기
		c1.drive();//참조값이 없으면 실핼x
		
		//Car 클래스로 객체를 하나 더 생성하고 찰당된 참조값을 c2에 담기
		Car c2 = new Car();
		//c2에 들어있는 참조값을 이요해서 drive() 메소드 호출하기
		c2.drive();
		
		System.out.println("main 메소드가 종료");
	}
}
