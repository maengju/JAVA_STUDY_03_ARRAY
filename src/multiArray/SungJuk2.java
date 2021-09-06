/*
 인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
----------------------
이름입력 : 이기자 (name)
과목수 입력 : 3   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
과목명 입력 : 자바
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
자바 점수 입력 : 100

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름      국어  영어   자바    총점      평균
이기자     95  100  100     xxx      xx.xx
 */
package multiArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SungJuk2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("인원수 : ");
		int cnt = Integer.parseInt(br.readLine());
		int i,j;
		int sum=0;
		double avg=0;
		
		String[]name = new String[cnt];
		String[][]subject = new String[cnt][];
		int subjectCnt;
		String[] sumavg = {"총점","평균"};
		int[][] jumsu = new int[cnt][];
		int[] sum1 =new int[cnt];
		double[] avg1=new double[cnt];
		
		//입력,처리
		for(i=0; i<cnt; i++) {
			sum=0;
			System.out.print("이름 입력 : ");
			name[i] = br.readLine();
			System.out.print("과목수 입력 : ");
			subjectCnt = Integer.parseInt(br.readLine());
			subject[i] = new String[subjectCnt];
			
			for(j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = br.readLine();
			}
			jumsu[i] = new int[subjectCnt];
			for(j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+"점수 입력 : ");
				jumsu[i][j] = Integer.parseInt(br.readLine());
				sum+=jumsu[i][j];
			}
			sum1[i]=sum;
			avg=(double)sum/subjectCnt;
			avg1[i]=avg;
			System.out.println();
			System.out.println("---------------------------------------------------");
			System.out.println();
	
		}//입력 for
		
		//출력
		
		System.out.println("===================================================");
		System.out.println();
		for(i=0; i<cnt; i++) {
			System.out.print("이름\t");
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
		}//출력 for
		
	}

}
