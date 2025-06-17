package test.main;
//논리연산자
public class MainClass05 {
	public static void main(String[] args) {
		boolean result1 =false || false; //f
		boolean result2 =false || true; //t
		boolean result3 =true || false; //t
		boolean result4 =true || true; //t
		
		boolean result5 =false && false; //f
		boolean result6 =false && true; //f
		boolean result7 =true && false; //f
		boolean result8 =true && true; //t
		
		boolean result9 =!true;//f
		boolean result10 =!false;//t
	}
}
