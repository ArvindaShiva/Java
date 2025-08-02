import java.util.Scanner;

public class smallestofarr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int Arr[]=new int[num];
    for(int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
   }
   int min=Arr[0];
   for(int i=0;i<num;i++){
      if(Arr[i]<min){
        min=Arr[i];
    }
  }
  System.out.println("Smallest element of array is: "+ min);
 }
}