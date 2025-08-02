import java.util.Scanner;

public class largestofarr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int Arr[]=new int[num];
    for(int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
   }
   int max=Arr[0];
   for(int i=0;i<num;i++){
      if(Arr[i]>max){
        max=Arr[i];
    }
  }
  System.out.println("Largest element of array is: "+ max);
 }
}