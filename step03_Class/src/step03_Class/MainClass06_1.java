package step03_Class;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06_1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "소나타";
		c1.price= 3000;
		
		Car c2 = MyUtil.car;
		c2.name ="ㅂㅂ";
		c2.drive();
	}
}
