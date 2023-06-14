import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("成績上傳登入 請選擇號碼!->"+"1.國文(共50題) 2.數學(共30題)");
        System.out.print("請選擇要上傳的科目號碼!:");
        int subject=scn.nextInt();
        System.out.print("請輸入該科目答對題數!:");
        int answer=scn.nextInt();
        float score=0;
        if(subject==1){
            if(answer==0){
                score=0;
                System.out.println("分級:"+" 0");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=1 && answer<=20){
                score=answer*2;
                System.out.println("分級:"+" C");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=21 && answer<=29){
                score=answer*2;
                System.out.println("分級:"+" B");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=30 && answer<=38){
                score=answer*2;
                System.out.println("分級:"+" B+");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=39 && answer<=46){
                score=answer*2;
                System.out.println("分級:"+" A");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=47 && answer<=50){
                score=answer*2;
                System.out.println("分級:"+" A+");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else {
                System.out.println("輸入錯誤!");
            }
        }else if(subject==2){
            if(answer==0){
                score=0;
                System.out.println("分級: "+" 0");
                System.out.println("轉換該科分數: "+Math.round(score*10)/10+" 分");
            }else if(answer>=1 && answer<=12){
                score=answer*3.33f;
                System.out.println("分級: "+" C");
                System.out.format("轉換該科分數: %.0f 分\n",score);
            }else if(answer>=13 && answer<=18){
                score=answer*3.33f;
                System.out.println("分級: "+" B");
                System.out.format("轉換該科分數: %.0f 分\n",score);
            }else if(answer>=19 && answer<=23){
                score=answer*3.33f;
                System.out.println("分級: "+" B+");
                System.out.format("轉換該科分數: %.0f 分\n",score);
            }else if(answer>=24 && answer<=27){
                score=answer*3.33f;
                System.out.println("分級: "+" A");
                System.out.format("轉換該科分數: %.0f 分\n",score);
            }else if(answer>=28 && answer<=30){
                score=answer*3.33f;
                System.out.println("分級: "+" A+");
                System.out.format("轉換該科分數: %.0f 分\n",score);
            }else {
                System.out.println("輸入錯誤!");
            }
        }else {
            System.out.println("查無此科目代碼!");
        }
    }
}
/*
題目: 成績上傳登入含該科目代碼分級及該科目成績換算(1.國文(共50題)2.數學(共30題))
 */
