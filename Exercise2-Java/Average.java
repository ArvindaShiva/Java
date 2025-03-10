import java.util.Scanner;
class Average{
  public static void  main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter num1: ");
    float num1=sc.nextFloat();
    System.out.print("Enter num2: ");
    float num2=sc.nextFloat();
    System.out.print("Enter num3: ");
    float num3=sc.nextFloat();
    float avg=(num1+num2+num3)/3;
    System.out.println("Average = "+avg);
  }
}