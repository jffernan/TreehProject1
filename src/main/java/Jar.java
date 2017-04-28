import java.util.Random;

public class Jar {
  private String mItem;
  private int mMaxItem;
  private int mNumberToGuess; 
  
  public Jar(String item, int maxItem) {
    mItem = item;
    mMaxItem = maxItem;
  }
  
  public int fill() {
    Random random = new Random();
    mNumberToGuess = random.nextInt(mMaxItem) + 1;
    return mNumberToGuess;
  }
  
  public int getNumberToGuess() {
    return mNumberToGuess;
  }
}