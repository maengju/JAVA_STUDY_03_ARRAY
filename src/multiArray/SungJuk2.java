/*
 �ο����� �Է��Ͽ� �ο�����ŭ �����͸� �Է¹ް� ������ ����� ���Ͻÿ�
����� �Ҽ����� 2°�ڸ����� ���

[������]
�ο��� : 2 (cnt)

�̸��Է� : ȫ�浿 (name)
����� �Է� : 2   (subjectCnt)
����� �Է� : ���� (subject)
����� �Է� : ����
���� ���� �Է� : 95 (jumsu)
���� ���� �Է� : 100
----------------------
�̸��Է� : �̱��� (name)
����� �Է� : 3   (subjectCnt)
����� �Է� : ���� (subject)
����� �Է� : ����
����� �Է� : �ڹ�
���� ���� �Է� : 95 (jumsu)
���� ���� �Է� : 100
�ڹ� ���� �Է� : 100

�̸�     ����     ����   ����     ���
ȫ�浿    95     100   xxx     xx.xx

�̸�      ����  ����   �ڹ�    ����      ���
�̱���     95  100  100     xxx      xx.xx
 */
package multiArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ο��� : ");
		int cnt = Integer.parseInt(br.readLine());
		int i,j;
		int sum=0;
		double avg=0;
		
		String[]name = new String[cnt];
		String[][]subject = new String[cnt][];
		int subjectCnt;
		String[] sumavg = {"����","���"};
		int[][] jumsu = new int[cnt][];
		int[] sum1 =new int[cnt];
		double[] avg1=new double[cnt];
		
		//�Է�,ó��
		for(i=0; i<cnt; i++) {
			sum=0;
			System.out.print("�̸� �Է� : ");
			name[i] = br.readLine();
			System.out.print("����� �Է� : ");
			subjectCnt = Integer.parseInt(br.readLine());
			subject[i] = new String[subjectCnt];
			
			for(j=0; j<subjectCnt; j++) {
				System.out.print("����� �Է� : ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[subjectCnt];
			for(j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+"���� �Է� : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				sum+=jumsu[i][j];
			}
			sum1[i]=sum;
			avg=(double)sum/subjectCnt;
			avg1[i]=avg;
			System.out.println();
			System.out.println("---------------------------------------------------");
			System.out.println();
	
		}//�Է� for
		
		//���
		
		System.out.println("===================================================");
		System.out.println();
		for(i=0; i<cnt; i++) {
			System.out.print("�̸�\t");
			for(j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
				
			}System.out.print(sumavg[0]+"\t"+sumavg[1]);
			System.out.println();
			System.out.print(name[i]+"\t");
			for(j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
				
			}
			System.out.print(sum1[i]+"\t");
			System.out.printf("%.2f\t",avg1[i]);
			
			System.out.println("\n");
			System.out.println("===================================================");
			System.out.println();
		}//��� for
		
	}

}
