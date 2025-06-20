package step03_Class;

import java.io.PrintStream;

import test.auto.Car;
import test.util.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//c1은 null이다. 
		Car c1 = MyUtil.car;//Car 타입
		
		//Car라는 객체를 생성해서 MUtil 클래스의 car라는 필드에 담기
		MyUtil.car = new Car();
		//c1은 위에서 생성한 Car객체의 참조값이 들어있다.
		Car c2 =MyUtil.car;
		c2.drive();
		
		//MyUtil클래스의 car는 필드를 직접 참조해서 drive() 메소드를 호출 할 수도 있다.
		MyUtil.car.drive(); 
		//MyUtil :class /MyUtil.car : Car type 
		
	
		//System a =null;
		PrintStream p = System.out;
		p.println("xxx");
	}

}
