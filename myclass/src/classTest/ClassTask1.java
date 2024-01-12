package classTest;

import java.util.Scanner;

class SuperCar {
//   브랜드
   String brand;
//   색상
   String color;
//   가격
   long price;
//   엔진
   boolean engine;
//   비밀번호
   String password;
//   비밀번호 오류 횟수
   int errorCount;

//   static 블록
   static {
      System.out.println("출고 축하드립니다.");
   }

//   초기화 블록
   {
      this.password = "0000";
   }

//   기본 생성자
   public SuperCar() {
      ;
   }

//   초기화 생성자
   public SuperCar(String brand, String color, long price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }

   public SuperCar(String brand, String color, long price, String password) {
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.password = password;
   }

//   시동 켜기
//   "ABC".equals("ABC");
//   사용자가 입력한 비밀번호가 맞을 때에만 시동 켜기
//   연속 3회 실패 시 경찰 출동
   void engineStart() {
      engine = true;
   }

//   시동 끄기
   void engineStop() {
      engine = false;
   }
   
//   비밀번호 검사
   public boolean checkPassword(String password) {
      return this.password.equals(password);
   }

}

public class ClassTask1 {
   public static void main(String[] args) {
      SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "7777");
            
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      String password = null;
      while(true) {
         System.out.println("1. 시동켜기\n2. 시동끄기");
         choice = sc.nextInt();
         
         if(choice == 1) { // 시동 켜기
            if(!ferrari.engine) {
               System.out.print("비밀번호 : ");
               password = sc.next();
               if(ferrari.checkPassword(password)) {
                  ferrari.errorCount = 0;
                  ferrari.engineStart();
                  System.out.println(ferrari.brand + " 시동 켜짐");
                  
               }else {
                  ferrari.errorCount++;
                  if(ferrari.errorCount > 2) {
                     System.out.println("경찰 출동");
                     break;
                  }
               }
            }else {
               System.out.println(ferrari.brand + "시동이 이미 켜져있습니다.");
            }
            
         }else if(choice == 2) { // 시동 끄기
            if(ferrari.engine) {
               ferrari.engineStop();
               System.out.println(ferrari.brand + " 시동 꺼짐");
            }else {
               System.out.println(ferrari.brand + " 시동이 이미 꺼져있습니다.");
            }
            
         }else {
            System.out.println("다시 해");
         }
      }
      
   }
}
