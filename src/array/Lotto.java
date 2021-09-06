/*
�ζ� - �ڵ�
1~45������ ������ 6�� �߻��Ͻÿ�
- �ߺ��� ���� ����� �Ѵ�.
- ��������
- 5�پ� ��� ���

[������]
 7 12 25 36 37 42
 
ù��° ����� �� ������ �ι�°�� �����Ͻÿ�

�� �Է� : 7000

    9   10   14   19   22   30
    1   17   21   31   34   36
   10   20   22   27   33   39
   20   23   28   31   36   38
    1   11   12   26   27   31

   11   13   20   33   37   40
    5   15   17   23   35   38
 */

package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] lotto = new int[6];
      int money;
      
      System.out.print("�� �Է� : ");
      money = Integer.parseInt(br.readLine());
      
      for(int k=1; k<=money/1000; k++) {
         for(int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45) + 1; //���� �߻�
            
            //�ߺ� ��
            for(int j=0; j<i; j++){
               if(lotto[i] == lotto[j]) {
                  i--;//4
                  break; //for j�� �����
               }
            }//for j
         }//for i
      
         int temp;
         for(int i=0; i<lotto.length-1; i++) {
            for(int j=i+1; j<lotto.length; j++) {
               if(lotto[i] > lotto[j]) {
                  temp = lotto[i];
                  lotto[i] =  lotto[j];
                  lotto[j] = temp;
               }
            }
         }
      
         //���
         for(int data : lotto){
            System.out.print(String.format("%5d", data));
         }
         System.out.println();
         
         if(k%5==0) System.out.println();
      }//for k

   }

}
