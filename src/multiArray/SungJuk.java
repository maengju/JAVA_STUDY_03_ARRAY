/*
 3���� ������ ���, ������ ���Ͻÿ�
 �� ����� �Ҽ����� 2°�ڸ����� ���
 
 ���� = ����+����+����
 ��� = ����/3
 ���� = ����� 90�� �̻� A  80�̻� B 70�̻� C 60�̻� D �׿� F
 [������]
 */
package multiArray;

public class SungJuk {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("�̸�	����	����	����	����	 ���	 ����");
		System.out.println("-----------------------------------------------------");
		
		int i,j;

		String[] name = {"ȫ�浿","���̾�","����ġ"};
		int[][] jumsu = {{90,96,100,0},{100,90,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(i=0; i<jumsu.length; i++) {
			for(j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];//����
				
				avg[i] = ((double)jumsu[i][3]/3);//���
				
				if(avg[i]>=90) {grade[i]='A';
				}else if(avg[i]>=80){grade[i]='B';
				}else if(avg[i]>=70){grade[i]='C';
				}else if(avg[i]>=60){grade[i]='D';
				}else {grade[i]='F';}// ����
			}
		}//for
				
		//���
		for(i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(j=0; j<jumsu[i].length; j++) {
				System.out.print(String.format("%d\t", jumsu[i][j]));
			}
			System.out.print(String.format("%.2f\t", avg[i]));
			System.out.print(String.format("  %c\t", grade[i]));
			System.out.println();
		}//��� for
		System.out.println("-----------------------------------------------------");
		
		
		
		
		

	}

}
