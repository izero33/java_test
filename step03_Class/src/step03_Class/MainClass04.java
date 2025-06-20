package step03_Class;

import test.auto.Car;

public class MainClass04 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "소나타";

		Car c2 = new Car();
		c2.name = "그랜저";
		
		c1.drive();
		c2.drive();
		
		//필드에 어떤 값이 들어있냐에 따라 객체의 동작이 달라진다. 
		//필드를 공갸할지 유무를 클래스를 만들때 정할 수 있다.
		//public : 공개 
	}
}
