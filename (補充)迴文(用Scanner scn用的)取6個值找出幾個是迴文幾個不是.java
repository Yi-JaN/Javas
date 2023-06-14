import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str;
        String str2;
        int count=0 ,count1=0;
        for(int i=0;i<6;i++){
            str=scn.nextLine();
            str2="";
            for(int j=str.length();j>0;j--){
                char ch=str.charAt(j-1);
                str2=str2+ch;
            }
            if(str.equals(str2)){
                count++;
            }else {
                count1++;
            }
        }
        System.out.println("YES="+count);
        System.out.println("NO="+count1);
    }
}
/*
取6個值算出幾個是迴文幾個不是迴文
題目:
101a101
A101A101
AstUtsA
875L578
ABCDDcBA
tesl7z7lset
 YES=4
 NO=2
 */
