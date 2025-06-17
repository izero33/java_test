package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//String type의 기능(메소드) 사용해 보기
		String str = "abcd1234";
		//문자열 길이를 리턴하는 length() 메소드 사용해 보기
		int length = str.length();//자바는 어떤 데이터도 리턴해주지 않는 void 타입이 있음
		//문자열을 대문자로 변경해서 리턴라는 메소드
		String upper =str.toUpperCase();
		
		//str.indexOf(length)
		
		//특정 문자열이 포함되어 있는지 여부를 리턴하는 메소드 함수 
		boolean contains= str.contains("cd");
		
	}
}
