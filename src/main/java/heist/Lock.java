package heist;

import java.util.Random;

/** Creates a Lock object.
 *
 * @author {Your Name Here}
 */
public class Lock {
  
  private final String core;
  private Random keymaster = new Random();
  
  /** Constructor.
   *
   */
  public Lock() {
    int key = this.keymaster.nextInt(1000) + 1001;
    this.core = Integer.toString(key,16);
  }
  
  /** Picks the lock.
   *
   * @param key A key object
   */
  /*
   * TODO Implement "pick" method from instructions in README
   */
}