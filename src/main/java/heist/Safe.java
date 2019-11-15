package heist;

import java.util.Random;

/** Creates a Safe object.
 *
 * @author Douglas Luman
 */
public class Safe {

  public final Lock lock;
  private final int riches;
  private Random jackpot = new Random();
  private boolean cracked;

  /** Constructor.
   *
   */
  public Safe() {
    this.lock = new Lock();
    this.riches = jackpot.nextInt(1000) + 1;
  }
  
  /** Attempts to crack the safe.
   *
   * @param key A key object.
   */
  /*
   * TODO Implement "crackSafe" method from instructions in README
   */
  
  /** Creates a string representation of the safe's contents.
   *
   */
  public String toString() {
    String fortune = new String();
    if (this.cracked) {
      for (int i = 0; i < this.riches; i++) {
        fortune += "$";
      }
    } else {
      fortune = "Nice try.";
    }
    return fortune;
  }
}