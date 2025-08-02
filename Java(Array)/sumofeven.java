import java.util.Scanner;

public class sumofeven{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int Arr[]= new int[num];
    for(int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
  }
    int sum=0;
    for(int i=0;i<num;i=i+2){
       sum+=Arr[i];
   }
   System.out.println("Sum of elements present in even place: "+ sum)
 }
}