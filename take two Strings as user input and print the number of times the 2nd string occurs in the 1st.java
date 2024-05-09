package assign_7;

import java.util.Scanner;

public class assign_7_hw7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String s="";
        int len1=str1.length();
        int len2=str2.length();
        int count=0;
        for(int i=0;i<=len1-len2;i++){
            boolean f=true;
            for(int j=0;j<len2;j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    f=false;
                    break;
                }
            }
            if(f){
                count++;
            }
        }
        System.out.println(count);
    }
}
