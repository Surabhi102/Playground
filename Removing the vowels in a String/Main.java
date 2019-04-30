import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String r = removeVowels(str);
    System.out.print(r);
  }
  public static String removeVowels(String s)
  {
    String finalS = "";
    int i;
    for(i=0; i<s.length(); i++)
    {
      if(!isVowel(Character.toLowerCase(s.charAt(i))))
      {
        finalS = finalS+ s.charAt(i);
      }
    }
    return finalS;
  }
  public static boolean isVowel(char c)
  {
    String vowels = "aeiou";
    for(int i=0; i<5; i++)
    {
      if(c==vowels.charAt(i))
      {
        return true;
      }
    
    }
    return false;
  }
        
}