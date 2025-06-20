package step03_Class;
import java.io.File;
import java.io.IOException;
//java.util 페키지 안에 있는 Random 클래스를 Import
import java.util.Random;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		int num;//선언만 하면 변수가 만들어지지 않는다
		num = 10; //값을 넣는 시점에 변수가 만들어진다. 
		//기본데이터는 변수를 빈상태로 둘 수가 없다.
		
		//문자열을 다룰때는 String 
		String name = "kim";
		
		//랜덤한 숫자를 얻어내고 싶다면?//랜덤한 숫자를 만들어주는 기능을 가진 객체가 필요
		Random ran = null;//ran이라는 공간에 Random값의 참조값만 담을 수 있음, 다른 데이터 타입은 담을 수 없음
		ran = new Random(); //랜덤 객체를 생성, 키값이 들어가고 키값을 통해서 사물함의 내용을 알 수 았다
		//ran.
		boolean result1 = ran.nextBoolean();
		System.out.println(result1);
		
		int result2 = ran.nextInt();
		System.out.println(result2);
		
		
		//콘솔창에 문자열을 출력하고 싶다면?//콘솔창에 문자열을 출력해주는 기능ㅇ을 가지고 있는 객체 필요
	
		
		
		//파일 시스템에 memo.text 파일을 만들고 싶다면? 파일을 만들 수 있는 기능을 가지고 있는 객체가 필요
		File f = null;//빈공간을 미리 만들었다
		f = new File("C:\\playground/memo.txt");
		f.createNewFile();//f가 비어있으면 에러 
				
		
		//콘솔창에 입력한 숫자나 문자열을 읽어들이고 싶다면? 콘솔창에서 입력한 내용을 이용해서 int나 string을 만들어내느 기능을 가지고 있는 객체가 필요
		Scanner scan = null;
		scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.println("main 메소드가 종료");
		
	}
}
