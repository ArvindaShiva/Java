import java.util.Scanner;

public class evenpos{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int Arr[]=new int[num];
    for(int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
   }
    System.out.println("Elements at even position:");
    for(int j=0;j<num;j=j+2){
       System.out.println(Arr[j]);
   }

 }
}