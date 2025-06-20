package test.util;
import test.auto.Car;


public class MyUtil {
	//none static 필드
	public String owner;
	
	//Car type을 담을 수 있는 static필드
	public static Car car;//null이 들어감, 선언만 하면
	
	
	//data type 앞에 static 예약어를 붙여서 static 필드를 만들 수있다
	//필드는 선언시에 초기값을 넣어줄 수 있다.
	public static String version = "1.0";//필드
	
	//method의 리턴 타입앞에 static 예약어를 붙여서 static 메소드를 만들 수 있다.
	
	public static void send() {//메서드
		System.out.println("전송합니다.");
	}
}
