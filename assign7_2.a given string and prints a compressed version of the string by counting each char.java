package assign_7;

import java.util.Scanner;

public class assig_7_hw2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String w=sc.next();
        String r1="";
        int count=1;
        char c=w.charAt(0);

        for (int i=0;i<w.length();i++){
            if(w.charAt(i)==c){
                count++;
            }
            else{
                r1+=c;
                if(count>1){
                    r1+=count;
                }
                count=1;
                c=w.charAt(i);
            }
            
        }
        r1+=c;
        r1+=count;
        System.out.print(r1);
    }
}
