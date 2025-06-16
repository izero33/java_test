package test.main;
//정수끼리 연산하면 결과는 정수만 나온다(소숫점 무시됨)
//정수와 실수를 연산하면 결과는 실수가 나온다.(소숫점 무시되지 않음)

public class MainClass02 {
public static void main(String[] args) {
	//1. 콘솔창에 "main메소드가 시작되었습니다." 출력
	System.out.println("main메소드가 시작되었습니다.");
	//2. 국어 점수 95를 kor이라는 변수에 담아봐	
	int kor = 95;
	//3. 영어 점수 100를 eng이라는 변수에 담아봐	
	int eng = 100;
	//4. 평균을 구한 다음 avg라는 변수에 담아
	double sum = kor+eng;
	double avg = sum/2;
	double avg2=(kor+eng)/2d;
	//5. 콘솔창에 avg변수안에 담긴 내용을 출력
	System.out.println(avg);
	
	//원하는 format 의 문자열 만들기
	String info = "평균:"+avg;
	String info2 = "국어:"+kor+" 영어:"+eng+" 평균:"+avg;
	System.out.println(info);
	System.out.println(info2);
			
}
}
