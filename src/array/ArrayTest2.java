package array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ArrayTest2 {

	public static void main(String[] args) throws IOException {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] = "+ args[i]);
			System.out.println("args["+i+"] 문자열 크기 = " + args[i].length());
			System.out.println("args["+i+"] 첫번째 문자 = " + args[i].charAt(0));
			System.out.println();
		}
		System.out.println();
		
		System.out.println("확장형 for"); //배열에 데이터 입력은 힘들지만 출력하기엔 편하다.
		for(String data : args) {
			System.out.println(data);
			System.out.println("문자열 크기 = "+data.length());
			System.out.println("첫번째 문자 = "+data.charAt(0));
			System.out.println();
		}
		System.out.println();
		/*
		 * 문자열을 입력받아서 가운데 위치한 문자를 출력하시오
		 * [실행결과]
		 * 문자열 입력 : 코끼리
		 * 가운데 문자 = 끼
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력 : ");
		String a = br.readLine();
		int b = a.length()/2;
		System.out.println("가운데 문자 = "+ a.charAt(b));
		
		
	}

}
