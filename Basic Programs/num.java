import java.util.Scanner;
public class num{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.input();
    if (num!=0){
      if(num%2==0){
        System.out.println(num+" is an even number");
      }else{
        System.out.println(num+" is an odd number");
      }
   }else{
   System.out.println("Entered number is 0");
  }
 }
}