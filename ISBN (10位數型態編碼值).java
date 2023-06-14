import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine(); //str為輸入的字串
        int count=0; //count為算幾位數型態編碼值
        int summ1=0; //summ1為第一次累加值
        int summ2=0; //summ2為第二次累加值
        for(int i=0;i<str.length();i+=2) { //for i從0開始循環,取str的單字串值,i+=2意思是因為輸入的字串中間有隔閡,所以1次循環for就i+=2
            String str2=str.substring(i,i+1); //用字串參數取單字串,然後取字串參數單字串要用另一個字串的資料型態(str2)去汰舊換新取值
            if(str2.equals("X") && i==18){ //如果我拿到的字串是"X"然後i==18就進去,18意思是因為有空白隔閡,所以18算起來是該碼第10個位數
                count+=1;    //算幾位數代碼值+1
                int nnn=10; //X為10
                summ1+=nnn; //第一次累加先加nnn
                summ2+=summ1; //第二次累加在+第一次累加
            }else if (str2.equals("0") || str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4")){
                count+=1;   //算幾位數代碼值+1                //如果我拿到的字串是"0"到"4"就進來
                int nn=Integer.parseInt(str2); //然後單字串轉int值給nn汰舊換新
                summ1+=nn; //第一次累加先加nn
                summ2+=summ1; //第二次累加在+第一次累加
            }else if(str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9")){
                count+=1;  //算幾位數代碼值+1                 //如果我拿到的字串是"5"到"9"就進來
                int mm=Integer.parseInt(str2);  //然後單字串轉int值給mm汰舊換新
                summ1+=mm;  //第一次累加先加mm
                summ2+=summ1; //第二次累加在+第一次累加
            }else { //如果我拿到字串不是X和i==18<-(18算起來是該碼第10個位數),或者拿到的字串不是"0"到"9"就進入
                break; //然後下break(停頓)
            }
        }
        System.out.println("第一次累加值為: "+summ1);
        System.out.println("第二次累加值為: "+summ2);
        if(summ2%11==0 && count==10) { //如果我的第二次累加最終總和值%11餘數是0 和 count是10位數型態編碼值就進去
            System.out.println("YES");
        }else { //如果缺一就來到這邊,所以就為不是
            System.out.println("NO");
        }
    }
}
/*
題目:ISBN驗證 (10位數型態編碼值)
問題描述:是一種世界共通的書籍編碼方法，世界上任何一本書籍之出版，皆有著唯一的一組 ISBN 碼。此碼由十個位數組成，每一位數可
以為 0~9 的任何一個數字，或者為 X，代表此位數為 10

ISBN碼        0    1    3   1   6   2   9   5   9   10(X)
第一次累加和    0    1    4   5   11  13  22  27  36  46
第二次累加和    0    1    5   10  21  34  56  83  119 165
經由計算可得識別碼編碼值為165,是11之倍數,所以為合格的ISBN碼

輸入說明:輸入一串ISBN碼,以空格隔閡

輸入->0 1 3 1 6 2 9 5 9 X         0 1 3 1 6 2 9 X 5 9       9 8 6 1 3 3 0 1 6 X
輸出->第一次累加值為: 46             第一次累加值為: 22           第一次累加值為: 47
輸出->第二次累加值為: 165            第二次累加值為: 56           第二次累加值為: 275
輸出->YES                         NO                         YES
 */
