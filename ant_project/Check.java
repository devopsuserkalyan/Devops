import java.io.*;

public class Check
{

  private String giveSentence(String name)
  {
    String sentence="Employee "+name+" is working in CDKGLobal";
    return sentence;
  }

  public static void main(String[] args) throws IOException
  {
    Check check = new Check();
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println(check.giveSentence(br.readLine()));
  }
}
