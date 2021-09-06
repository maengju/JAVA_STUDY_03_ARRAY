/*
10진수를 입력하여 2진수로 변환하시오
- 0이 입력되면 프로그램을 종료하시오
- 음수가 입력되면 재입력하시오
- 4개씩 끊어서 보여주기
- Integer.toBinaryString() 사용 X

10진수 입력 : -5

10진수 입력 : 12
1100

10진수 입력 : 250
1111 1010

10진수 입력 : -8

10진수 입력 : 0
프로그램을 종료합니다
 */
package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Binary_re {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int i,j,dec;
		int count=0;
		int count2=0;
		while(true) {
			count=0;
			System.out.print("10진수 입력 : ");
			dec = Integer.parseInt(br.readLine());
			if(dec==0)break;
			if(dec<0)continue;
			
			for(i=0; i<binary.length; i++) {
				binary[i] = dec%2;
				dec = dec/2;
				count++;
				if(dec==0) break;
			}//for i
			
			for(j=count-1; j>=0; j--) {count2++;
				System.out.print(binary[j]);
				if(count2%4==0)System.out.print(" ");
			}//for j 
			System.out.println();
		}//while
		System.out.println("프로그램이 종료되었습니다.");
	
	}

}
