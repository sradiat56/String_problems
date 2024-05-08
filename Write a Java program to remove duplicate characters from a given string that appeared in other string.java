package assign_7;

import java.util.Scanner;

public class assign_7_hw5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String s="";
        int len1=str1.length();
        int len2=str2.length();
        for(int i=0;i<len1;i++){
            char c1=str1.charAt(i);
            boolean found=false;
            for (int j=0;j<len2;j++){
                char c2=str2.charAt(j);
                if(c1==c2 || c1==(char)(c2-32)){
                    found=true;
                    break;
                }
            }
            if(c1==' '){
                s+=c1;
            }
            else if(found ==false){
                s+=c1;
            }
        }
        System.out.println(s);
    }
}
