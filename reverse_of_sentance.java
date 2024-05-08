package assign_7;

import java.util.Scanner;

public class assig_7_hw1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String w=sc.nextLine();
        String r1="";
        String r2="";
        for (int i=0;i<w.length();i++){
            char c=w.charAt(i);
            if(c==' ' || c==w.charAt(w.length()-1)){
                r2=r1+" "+r2;
                r1="";
            }
            else{
                r1=r1+c;
            }
        }
        System.out.print(r2);
    }
}
