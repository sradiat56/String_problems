package assign_7;

import java.util.Scanner;

public class assign_7_hw4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";

        boolean nupper=false;
        int len=str.length();
        for(int i=0;i<len;i++){
            char c=str.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                if(nupper){
                    if(c>='a' && c<='z'){
                        c=(char)(c-32);
                    }
                }
                else{
                    if(c>='A' && c<='Z'){
                        c=(char)(c+32);
                    }
                    
                }
                nupper= !nupper;
            }
            s+=c;
        }
        System.out.println(s);

    }
}
