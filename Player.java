import java.io.*;
import java.util.*;

public class Player{
  
  private String       name;
  private double       cash;
  private UUID         id = UUID.randomUUID();
  private File         f;
  private PrintStream  p;
  
  public Player(String name, double cash, String ledger) throws FileNotFoundException{
    this.f    = new File(ledger + ".cvs");
    this.p    = new PrintStream(f);
    this.name = name;
    this.cash = cash;

    write(this.name + ", " + this.id + ", " + this.cash);
  }

  public void addToLedger(){
    //read the existing file
    //find out if the olayer already exists
    //if the player does not exist, add it 
    //re-write the file.
  }

  public void write(String message){
    this.p.println(message);
  }
  
  public double bet(double amount){
    this.cash -= amount;
    return amount;
  }
  public String getName() {
	  return name;
  }
  public double getCash() {
	  return cash;
  }
}