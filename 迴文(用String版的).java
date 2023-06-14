import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader scn=new BufferedReader(new InputStreamReader(System.in));
        String str=scn.readLine();
        String str2="";
        for(int i=str.length();i>0;i--){
            char ch=str.charAt(i-1);
            str2=str2+ch;
        }
        if(str.equals(str2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
/*
題目: 迴文(你輸入的String str=scn.readLine)
throw IOException -> throws是方法可能丟擲異常的宣告。(用在宣告方法時，表示該方法可能要丟擲異常)
BufferedReader scn=new BufferedReader(new InputSteamReader(System.in)) ->BufferedReader由Reader類擴充套件而來，提供通用的緩衝方
式文字讀取，而且提供了很實用的readLine，讀取一個文字行，從字元輸入流中讀取文字，緩衝各個字元，從而提供字元、陣列和行的高效讀取。
建立一個String str=scn.readLine();之後在建立一個str2,意思就是待會要用來迴文的字串,之後用for迴圈來把str轉變成str.length()例如你輸入123321
轉變str.length就有6位數,之後6>0,算完底標返回i--繼續丟,然後迴圈裡第一個是char ch=str.charAt(i-1),先把你要丟的i值位於的str單字串丟入char ch之後
str2=str2+ch,就是你所丟進去ch裡的str值,以此類推丟到迴圈算完,結果出來-> 例如輸入123321 依照迴圈慣性來看就從最後一個1開始丟給str2 變成123321
那因為str2是字串所以她相加不是真的相加起來總和,這邊要特別注意! (這邊也可參照筆記 char ch=str.charAt(0)意思 ,邊看邊複習)
迴圈算完後往下把原本的str跟迴圈算完的str2丟進if做對比,str.equal(str2)就是你的str跟你所要對比的也就是str2做對比看有沒有一樣,一樣就true沒有就
false,所以用if迴圈做判斷之對比,有的話丟進去之後顯示YES沒有的話丟進else裡然後顯示NO!
答案:123321 YES (你的str2是123321所以是有)
    124321 NO  (你的str2是123421所以是沒有)
    ABCCBA YES (你的str2是ABCCBA所以是有)
    AABBCC NO  (你的str2是CCBBAA所以沒有)
 */
