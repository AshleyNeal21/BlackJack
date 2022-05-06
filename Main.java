import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) throws FileNotFoundException{
    System.out.println("I am Main!");

    new Player("me", 100, "ledger");

    new Player("you", 1300, "ledger");
  }
}