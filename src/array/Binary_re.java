/*
10������ �Է��Ͽ� 2������ ��ȯ�Ͻÿ�
- 0�� �ԷµǸ� ���α׷��� �����Ͻÿ�
- ������ �ԷµǸ� ���Է��Ͻÿ�
- 4���� ��� �����ֱ�
- Integer.toBinaryString() ��� X

10���� �Է� : -5

10���� �Է� : 12
1100

10���� �Է� : 250
1111 1010

10���� �Է� : -8

10���� �Է� : 0
���α׷��� �����մϴ�
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
			System.out.print("10���� �Է� : ");
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
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	
	}

}
