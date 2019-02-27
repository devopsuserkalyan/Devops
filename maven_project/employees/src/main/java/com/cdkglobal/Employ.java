package com.cdkglobal.Check;
import java.io.*;
  
public class Employ
{

  private String giveSentence(String name)
  {
    String sentence="Employee "+name+" is working in CDKGLobal";
    return sentence;
  }

  public static void main(String[] args) throws IOException
  {
    Employ check = new Employ();
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println(check.giveSentence(br.readLine()));
  }
}
