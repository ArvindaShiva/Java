import java.util.Scanner;

public class revarr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int Arr[]=new int[num];
    for(int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
   }
   System.out.println("Elements of original array: ");
   for(int i=0;i<num;i++){
      System.out.println(Arr[i]+" ");
  }
  System.out.println("Array in reverse order: ");  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
  }
 }
}