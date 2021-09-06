/*
 *주차장 관리 프로그램

[실행결과]
**************
1. 입차      
2. 출차      
3. 리스트      
4. 종료
**************
메뉴 : 8
1~4번까지만 입력하세요.

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지 않습니다

3번인 경우
1위치 : false
2위치 : false
3위치 : false
4위치 : false
5위치 : false
 */

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int num;
      boolean[] ar = new boolean[5];
      int index;
      
      while(true) {
         System.out.println();
         System.out.println("*************");
         System.out.println("   1. 입차");
         System.out.println("   2. 출차");
         System.out.println("   3. 리스트");
         System.out.println("   4. 종료");
         System.out.println("*************");
         System.out.print(" 메뉴 : ");
         num = Integer.parseInt(br.readLine());
         if(num==4) break;
         
         if(num==1) {
            System.out.print("위치 입력 : ");
            index = Integer.parseInt(br.readLine());
            
            //if(ar[index-1] == true)
            if(ar[index-1])
               System.out.println("이미 주차되어있습니다");
            else {
               System.out.println(index + "위치에 입차");
               ar[index-1] = true;
            }   
            
         }else if(num==2) {
            System.out.print("위치 입력 : ");
            index = Integer.parseInt(br.readLine());
         
            if(ar[index-1]) {
               System.out.println(index + "위치에 출차");
               ar[index-1] = false;
            }else {
               System.out.println("주차되어 있지 않습니다");
            }
            
         }else if(num==3) {
            for(int i=0; i< ar.length; i++) {
               System.out.println((i+1) +"위치 : " + ar[i]);
            }//for
            
         }else 
            System.out.println("1~4번까지만 입력하세요.");
         
      }//while
      System.out.println("프로그램 종료합니다.");
   }
}
