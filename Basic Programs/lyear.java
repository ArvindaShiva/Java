import java.util.Scanner;
public class lyear{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of the year");
    year=sc.input();
    if (year%4==0 || year % 100 ==0){
      System.out.println(year+" is a leap year");
    }else{
      System.out.println(year+" is not a leap year");
    }  
  }
}