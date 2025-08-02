public class countarr{
  public static void main(String[] args){
    int arr[]=new int{1,2,3,4,5};
    int count=0;
    for(int i=0;i<arr.length;i++){
       count+=1; 
   }
   System.out.println("Number of elements in array: "+ count);
  }
}