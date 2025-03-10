import java.util.Scanner;
class Arithmetic{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number1: ");
    int num1=sc.nextInt();
    System.out.print("Enter number2: ");
    int num2=sc.nextInt();
    System.out.print("Enter choice: ");
    int ch=sc.nextInt();
    switch (ch){
    case 1:
    int Add=num1+num2;
    System.out.print("Addition of "+" "+num1+" "+"and"+" "+num2+" is "+Add);
    break;
    case 2:
    int Sub=num1-num2;
    System.out.print("Subtraction of "+" "+num1+" "+"and"+" "+num2+" is "+Sub);
    break;
    case 3:
    int Mul=num1*num2;
    System.out.print("Multiplication of "+" "+num1+" "+"and"+" "+num2+" is "+Mul);
    break;
    case 4:
    float Div=num1/num2;
    System.out.print("Division of "+" "+num1+" "+"and"+" "+num2+" is "+Div);
    break;
    case 5:
    float Mod = num1%num2;
    System.out.print("Remainder of "+" "+num1+" "+"and"+" "+num2+" is "+Mod);
    break;

    default:
    System.out.print("Invalid choice");
    }
  }
}
