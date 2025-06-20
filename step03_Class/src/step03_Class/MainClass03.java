package step03_Class;

import test.auto.Car;

public class MainClass03 {
	public static void main(String[] args) {
		Car c1 = new Car();
		String name = c1.name;//null
		int price = c1.price; //0
		//Car 객체의 필드에 값을 대입해보기
		c1.name="소나타";
		c1.price=3000;
				
		String name2 = c1.name;//소나타
		int price3 = c1.price; //3000
		
	}
}
