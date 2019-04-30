import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);;
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    int s1_len= s1.length();
    int s2_len = s2.length();
    int occur_count = 0;
    for(int i=0; i<(s1_len - s2_len+1); i++)
    {
      boolean is_matching = true;
      for(int j=0; j<s2_len; j++)
      {
        if(s1.charAt(i+j)!=s2.charAt(j))
        {
          is_matching = false;
        }
      }
      if(is_matching == true)
      {
        occur_count++;
      }
    }
    System.out.println(occur_count);
    
  } 
}