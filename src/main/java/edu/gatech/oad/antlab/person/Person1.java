package edu.gatech.oad.antlab.person;
import java.util.ArrayList;
import java.util.List;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
 *  @author Rafael Shinsato
 *  @version 1.2
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
          if (input.length() < 2) {
            return input;
          }
          else {
	    List<Character> list = new ArrayList<Character>();
            char[] arr= input.toCharArray();
            for(char a: arr) {
              list.add(a);
            }
	    char firstChar = arr[0];
            char secChar = arr[1];
            arr[0] = arr[arr.length - 2];
            arr[1] = arr[arr.length - 1];
            for (int x = arr.length - 2 ; x > 2; x--) {
                   arr[x] = arr[x - 2]; 
                }
		
	    return arr.toString();
          }
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
