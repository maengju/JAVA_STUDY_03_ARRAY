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
		
		System.out.print("�迭ũ�� �Է� : ");
		int size = Integer.parseInt(br.readLine());
		int[] ar = new int[size];
		
		for(int i =0; i<ar.length; i++) {
			System.out.printf("ar[%d]�� ���� �Է����ּ���",i);
			ar[i] = Integer.parseInt(br.readLine());
			
			sum+=ar[i];
		}//for
		
		max = min =ar[0];
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];
		}//�ִ밪,�ּҰ�
		
			
		for(int data : ar) {
			System.out.print(data+" ");			
		}//Ȯ���� for
		System.out.println();
		System.out.println("���� : "+sum);
		System.out.println("�ִ밪�� : "+max);
		System.out.println("�ּҰ��� : "+min);
	}

}
