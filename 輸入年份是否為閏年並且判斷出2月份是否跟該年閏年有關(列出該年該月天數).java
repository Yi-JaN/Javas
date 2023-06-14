import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       int year=scn.nextInt();
       int month=scn.nextInt();
       if(year%400==0){
           System.out.println("YES"+" 366 days");
       }else if(year%100==0){
           System.out.println("NO"+" 365 days");
       }else if(year%4==0){
           System.out.println("YES"+" 366 days");
       }else {
           System.out.println("NO"+" 365 days");
       }
       switch (month){
           case 1:
            System.out.println("1月有31days");
            break;
           case 2:
               if (year%400==0){
                   System.out.println("2月有29days");
                   break;
               }else if(year%100==0){
                   System.out.println("2月有28days");
                   break;
               }else if(year%4==0){
                   System.out.println("2月有29days");
                   break;
               }else {
                   System.out.println("2月有28days");
                   break;
               }
           case 3:
               System.out.println("3月有31days");
               break;
           case 4:
               System.out.println("4月有30days");
               break;
           case 5:
               System.out.println("5月有31days");
               break;
           case 6:
               System.out.println("6月有30days");
               break;
           case 7:
               System.out.println("7月有31days");
               break;
           case 8:
               System.out.println("8月有31days");
               break;
           case 9:
               System.out.println("9月有30days");
               break;
           case 10:
               System.out.println("10月有31days");
               break;
           case 11:
               System.out.println("11月有30days");
               break;
           case 12:
               System.out.println("12月31days");
               break;
           default:
               System.out.println("輸入月份錯誤!");
       }
    }
}
/*
題目:輸入年份和月份 並且輸出該年月份天數
1.需要判斷此年份是否為閏年 2月份天數是否跟年份閏年有關?
2.每個月天數需此用switch-case去操作!
我switch-case case2:中用if帶入year去判斷是否是不是閏年,如果是的話那該月份(case2)會顯示閏年的2月天數然後在break跳出
如果year判斷出不是閏年的話,那該月份(case2)會顯示非閏年的2月天數然後在break跳出
A:
1.2020 2        2. 2003 2        3. 2100 2       4.2000 2
YES 366 days     NO 365 days     NO 365 days      YES 366 days
2月有29days       2月有28days      2月有28days        2月有29days
 */

