import java.util.Scanner;

public class AddNumbers{

          public void add(int a,int b){
             c=a+b;
           System.out.println("Addition"+c);
         }
        
        public static void main(String[] args){

               Scanner scn=new Scanner(System.in);
               AddNumbers num=new AddNumbers();
               System.out.println("Add first Number);
               int a=scn.nextInt();
               System.out.println("Add Second Number);
               int b=scn.nextInt();

               num.add(a,b);
             
       }
}