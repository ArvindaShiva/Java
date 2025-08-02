import java.util.Scanner;

public class arr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of elements");
    int num=sc.nextInt();
    int[] Arr = new int[num];
    for (int i=0;i<num;i++){
       Arr[i]=sc.nextInt();
  }
    System.out.println("The elements of the array are:");
        for (int i = 0; i < num; i++) {
            System.out.println("Element at index " + i + ": " + Arr[i]);
  }
    
 } 
}