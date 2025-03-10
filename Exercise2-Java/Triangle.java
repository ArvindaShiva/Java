import java.util.Scanner;
class Triangle{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the triangle base value: ");
    float base=sc.nextFloat();
    System.out.print("Enter the triangle height value: ");
    float height=sc.nextFloat();
    float Area = (0.5f * base * height);
    System.out.println("Area of triangle: "+Area+" sq units");
  }
}