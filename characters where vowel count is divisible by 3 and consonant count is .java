package assign_7;

import java.util.Scanner;

public class evaluation_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int v_count=0;
        int c_count=0;
    
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                v_count+=1;
            }
            else{
                c_count+=1;
            }
        } 
        if(v_count%3==0 && c_count%5==0 ){
            System.out.println("aarr! me plunder!!");
        }
        else{
            System.out.println("blimey! NO plunder");
        }
    }
    
}
