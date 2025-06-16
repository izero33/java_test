package test.main;

/*
 * [java 참조 데이터 타입]
 * string type
 * 
 * - 문자열을 다룰 때 사용하는 타입이다.*/
public class MainClass05 {
public static void main(String[] args) {
	//"개구리"라는 스트링 타입 객체를  heap 영역(사물함)에 만들고 그 참조값을 변수에 담기
	String name ="개구리";
	//name안에 있는 참조값을 tmp변수에 복사하기
	String tmp=name;
	//"원숭이"라는 스트링 타입 객체를 heap영역에 만들고 그 참조값을 name에 덮어쓰기
	name="원숭이";
	//name 변수 비우기 ,null은 빈상태, 참조데이터 타입을 담을 수 있는 빈공간
	name=null;		
	
	//변수안에 실제 값이 들어가는 기본타입
	int num = 10;
	double num2 = 10.1;
	boolean isRun = true;
	//변수안에 참조값이 들어가는 참조데이터 타입//id가 들어있음
	String yourName = "강아지";
	
	
	//참조데이터는 기능 목록이 나옴 ,yourName.기능~
	

}
}
