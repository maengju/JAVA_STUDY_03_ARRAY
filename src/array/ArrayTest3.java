/*
*/

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		int max,min;
		
		System.out.print("배열크기 입력 : ");
		int size = Integer.parseInt(br.readLine());
		int[] ar = new int[size];
		
		for(int i =0; i<ar.length; i++) {
			System.out.printf("ar[%d]의 값을 입력해주세요",i);
			ar[i] = Integer.parseInt(br.readLine());
			
			sum+=ar[i];
		}//for
		
		max = min =ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];
		}//최대값,최소값
		
			
		for(int data : ar) {
			System.out.print(data+" ");			
		}//확장형 for
		System.out.println();
		System.out.println("합은 : "+sum);
		System.out.println("최대값은 : "+max);
		System.out.println("최소값은 : "+min);
	}

}
