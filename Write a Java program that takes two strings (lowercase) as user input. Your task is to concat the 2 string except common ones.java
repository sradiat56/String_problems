package assign_7;

import java.util.Scanner;

public class assign_7_hw3 {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    String res="";
    int len1= str1.length();
    int len2= str2.length();
        boolean found;
    for(int i=0;i<len1;i++){
        char c1=str1.charAt(i);
         found=false;
        for(int j=0;j<len2;j++){
            if(c1==str2.charAt(j)){
                found=true;
                break;
            }
            
            
        }
        if(found==false){
            res+=(char)(c1-32);

        }
    }
    for(int i=0;i<len2;i++){
        char c2=str2.charAt(i);
         found =false;
        for(int j=0;j<len1;j++){
            if(c2==str1.charAt(j)){
                found=true;
                break;
            }
            
         }
        if(found==false){
            res+=(char)(c2-32);

        }
    }
    System.out.println(res);
}
}