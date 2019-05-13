package com.game;

import java.util.Scanner;

public class 정민 {
   /****
    * 보물 2개를 찾아 끝지점을 가면 끝
    * ai : 이동후 좌우 좌표
    * aj : 이동후 상하 좌표
    * bi : 이동전 좌우 좌표
    * bj : 이동전 상하 좌표
    */
Boolean blue5 = false;//파란 벽돌 구분
Boolean blue6 = false;//파란 벽돌 구분

   public boolean g1(int ai, int aj, int bi, int bj) {
      boolean result = false; //1로는 못 움직여서 구분할 변수


      //게임판 초기화
      int[][] array = {
            {1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,1,1,0,0,0,1,1,5,1},
            {1,0,0,0,0,0,1,0,0,0,0,1},
            {1,1,1,0,1,0,1,1,1,0,1,1},
            {1,5,1,0,1,0,1,0,1,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,1},
            {1,0,0,0,0,0,1,0,0,0,1,1},
            {1,1,0,1,1,0,1,1,1,0,1,1},
            {1,1,0,1,0,0,0,1,0,0,0,1},
            {1,1,0,1,0,1,0,0,0,0,1,1},
            {1,1,0,0,0,1,1,1,1,0,3,1},
            {1,1,1,1,1,1,1,1,1,1,1,1}
      };
      //파란 벽돌 위치 정보
      int[][] array2 = {
            {1,10},{4,1}
      };
      
      // 보석을 먹으면 사라져야함
   
      for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[i].length; j++) {
            //1일때 이동 불가 지역 return true
            if(array[ai][aj] == 1) {
               ai = bi;
               aj = bj;
               result = true;
            }
//파란 벽돌일 때
                    if (i == ai && j == aj)
                    {
                        // 벽돌 위치 정보와 현재 들어온 값 비교
                        if (ai == array2[0][0] && aj == array2[0][1])
                        {
                            blue5 = !blue5;//현재 벽돌을 밟았다는 구분
                        }
                        if (ai == array2[1][0] && aj == array2[1][1])
                        {
                            blue6 = !blue6;
                        }
                    }
            //현재 나의 위치 표현
            if(i == ai && j == aj) {
               System.out.print(" ● ");
            } else if(array[i][j] == 1) {//주황 벽돌 표현
               System.out.print(" ■ ");
            } else if(array[i][j] == 0) {//하얀 벽돌 표현
               System.out.print(" □ ");
             }    else if (array[i][j] == 5)
                    {//파란벽돌 표현
                        if(array2[0][0] == i && array2[0][1] == j)
                        { 
                            if (blue5)
                            {//위에서 정의한 값으로 벽돌을 어떻게 그릴지 구분
                                System.out.print(" X  ");
                            }
                            else
                            {
                                System.out.print(" ＠ ");
                            }
                        }
                        else if (array2[1][0] == i && array2[1][1] == j)
                        { 
                            if (blue6)//밟았다
                            {
                               System.out.print(" X  ");
                            }
                            else//다시 밟았을 경우를 대비
                            {
                               System.out.print(" ＠ ");
                            }
                        }
                        else
                            System.out.print(" ＠ ");
                    }else
                System.out.print(" ○ ");
         }
         System.out.println();
      }
      return result;
   }
   
   public void g2() {
      Scanner scan = new Scanner(System.in);//키 입력
      int ai = 1;//상하
      int aj = 1;//좌우
      int bi = 1;//이동된 상하
      int bj = 1;//이동된 좌우
      g1(ai,aj,bi,bj);
      while(true) { 
         String input = scan.next();
         switch (input.toUpperCase()) {
         case "W"://위로 키 press
            ai--;//상하 좌표 -
            break;
         case "S"://아래 키 press
            ai++;//상하 좌표 +
            break;
         case "A":// 왼쪽 키 press
            aj--;//좌우 좌표 -
            break;
         case "D"://오른쪽 키 press
            aj++;//좌우 좌표 +
            break;

         default:
      
            break;
         }
         
         if(g1(ai,aj,bi,bj)) { //1일때 true 반환
            ai = bi;//원위치로
            aj = bj;//원위치로        
 } else //1이 아니면 이동 가능
            bi = ai; //좌표 업데이트
            bj = aj; //좌표 업데이트
            
      
      
      }

   }
}
