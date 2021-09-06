/*
 3명의 총점과 평균, 학점을 구하시오
 단 평균은 소수이하 2째자리까지 출력
 
 총점 = 국어+영어+수학
 평균 = 총점/3
 학점 = 평균이 90점 이상 A  80이상 B 70이상 C 60이상 D 그외 F
 [실행결과]
 */
package multiArray;

public class SungJuk {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("이름	국어	영어	수학	총점	 평균	 학점");
		System.out.println("-----------------------------------------------------");
		
		int i,j;

		String[] name = {"홍길동","라이언","어피치"};
		int[][] jumsu = {{90,96,100,0},{100,90,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(i=0; i<jumsu.length; i++) {
			for(j=0; j<jumsu[i].length-1; j++) {
				jumsu[i][3] += jumsu[i][j];//총점
				
				avg[i] = ((double)jumsu[i][3]/3);//평균
				
				if(avg[i]>=90) {grade[i]='A';
				}else if(avg[i]>=80){grade[i]='B';
				}else if(avg[i]>=70){grade[i]='C';
				}else if(avg[i]>=60){grade[i]='D';
				}else {grade[i]='F';}// 학점
			}
		}//for
				
		//출력
		for(i=0; i<name.length; i++) {
			System.out.print(name[i]+"\t");
			for(j=0; j<jumsu[i].length; j++) {
				System.out.print(String.format("%d\t", jumsu[i][j]));
			}
			System.out.print(String.format("%.2f\t", avg[i]));
			System.out.print(String.format("  %c\t", grade[i]));
			System.out.println();
		}//출력 for
		System.out.println("-----------------------------------------------------");
		
		
		
		
		

	}

}
