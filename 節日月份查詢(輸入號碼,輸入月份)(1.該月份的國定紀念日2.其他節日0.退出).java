import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("節日月份查詢: 1.月份國定紀念日與節日 2.其他節日 0.退出");
        System.out.print("請輸入號碼: ");
        int n=scn.nextInt();
        System.out.print("輸入月份(如退出再按一次0): ");
        int month=scn.nextInt();
        switch (n){
            case 0:
                if(month==0){
                    System.out.println("退出成功");
                }else {
                    System.out.println("輸入錯誤!已返回大廳介面!");
                }
                break;
            case 1:
                if(month==1){
                    System.out.println("1/1日: 元旦");
                    System.out.println("農曆正月初一前日: 農曆除夕");
                    System.out.println("農曆正月初一至初三: 春節");
                }else if(month==2){
                    System.out.println("2/28日: 和平紀念日");
                }else if(month==3){
                    System.out.println("3/8日: 婦女節");
                    System.out.println("3/29日: 青年節");
                }else if(month==4){
                    System.out.println("4/4日: 兒童節");
                    System.out.println("農曆清明,即4/4或4/5日: 清明節");
                }else if(month==5){
                    System.out.println("5/1日: 勞動節");
                }else if(month==6){
                    System.out.println("農曆五月初五: 端午節");
                }else if(month==7){
                    System.out.println("無特殊紀念日");
                }else if(month==8){
                    System.out.println("農曆八月十五日: 中秋節");
                }else if(month==9){
                    System.out.println("9/28日: 教師節");
                }else if(month==10){
                    System.out.println("10/30日: 萬聖節");
                }else if(month==11){
                    System.out.println("11/12日: 國父紀念日");
                }else if(month==12){
                    System.out.println("12/25日: 聖誕節and行憲紀念日");
                }else if(month==0){
                    System.out.println("退出成功!");
                }else {
                    System.out.println("輸入月份錯誤!");
                }
                break;
            case 2:
                if(month==1){
                    System.out.println("農曆 正月二十: 天穿日/全國客家日");
                }else if(month==2){
                    System.out.println("無特殊其他節日");
                }else if(month==3){
                    System.out.println("3/5日: 童軍節");
                    System.out.println("3/25日: 美術節");
                }else if(month==4){
                    System.out.println("4/1日: 聯勤節");
                }else if(month==5){
                    System.out.println("5月第二個星期日: 母親節");
                }else if(month==6){
                    System.out.println("6/23日: 公共服務日");
                }else if(month==7){
                    System.out.println("7/7日: 陸軍節");
                }else if(month==8){
                    System.out.println("8/1日: 原住民族日");
                    System.out.println("8/8日: 父親節");
                }else if(month==9){
                    System.out.println("9/2日: 海軍節");
                }else if(month==10){
                    System.out.println("10/21日: 中華民國華僑節");
                }else if(month==11){
                    System.out.println("無特殊其他節日");
                }else if(month==12){
                    System.out.println("12/1日: 世界愛滋病日");
                    System.out.println("12/12日: 憲兵節");
                }else if(month==0){
                    System.out.println("退出成功!");
                }else {
                    System.out.println("輸入月份錯誤!");
                }
                break;
            default:
                System.out.println("查詢號碼輸入錯誤!");
                break;
        }
    }
}
/*
題目:節日月份查詢(輸入號碼,輸入月份)(1.該月份國定紀念日2.其他節日0.退出)
 */
