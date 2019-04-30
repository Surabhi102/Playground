import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code hereInt();
      
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int a[]= new int[n];
      for(int i=0; i<=(n-1); i++)
      {
        a[i]=in.nextInt();
      }
       int temp = a[0];
      for(int i= 1; i<=(n-1); i++)
      {
        if(temp<a[i])
        {
         temp = a[i];
        }
      }
      System.out.print(temp);
    }
}