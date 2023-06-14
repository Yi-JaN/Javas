import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scntest=new Scanner(System.in); //此Scanner 拿來取int 正整數數字型態的值
       Scanner scn=new Scanner(System.in);  //此Scanner 拿來取str 也就是字串型態的值
       int n=scntest.nextInt();
       String str;
       String str2;
       for(int k=0;k<n;k++) {
            str = scn.nextLine();
            str2 = "";
           for (int i = str.length(); i >= 1; i--) {
               char ch = str.charAt(i - 1);
               str2 = str2 + ch;
           }
           char[] ch1 = str2.toCharArray();
           for (int j = 0; j < ch1.length; j++) {
               if (Character.isUpperCase(ch1[j])) {
                   ch1[j] = Character.toLowerCase(ch1[j]);
               } else {
                   ch1[j] = Character.toUpperCase(ch1[j]);
               }
           }
           System.out.println(ch1);
       }
    }
}
/*
A:
6 <-(n值給的)
abC123 -> 321cBA
AAbBCd -> DcbBaa
123321 -> 123321
Bc414cB -> bC414Cb
ZxyyxZ -> zXYYXz
42c11C24 -> 42c11C24

 */
/*
這題也可參照筆記 char ch=str.charAt(0)意思 ,邊看邊複習
這程式跑法是先取該字串由後往前取,取完後往下做,把你取完的成品丟給ch1做1維陣列單字串長度,再從第1個值1個1個大小寫轉換!
然後再列印出來,在底圈回去大for迴圈循環,之後以此類推!
 */