package heist;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** Runs the heist story.
 *
 * @author Douglas Luman
 */
public class RunHeist {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Safe safe = new Safe();
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/keys.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    Key key;
    boolean isCracked;
    File bonanza = new File("outputs/the.bonanza");
    do {
      key = new Key(input.nextLine());
      isCracked = safe.crackSafe(key);
      /*
       * TODO Implement FileWriter from instructions in README,
       *       use Wednesday's class activity for guidance
       */
    } 
    while (input.hasNext() && !isCracked);
  }
}