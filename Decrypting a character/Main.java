import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code heret 
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch>='a'&& ch<='z')
      {
      int offset = ch;
      offset = offset+(26-key);
      ch = (char)(offset);
    }
       else if(ch>='A' && ch<='Z')
      {
        int offset = ch- key;
         offset = offset-'A';
         ch = (char)(offset+'A');
      }
      System.out.print(ch);
      
    }
}