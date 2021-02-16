import javax.swing.*;

import java.awt.*;
/**
 * 
 * @author Tommaso Coraci
 * @since 10/06/20
 * @version 1
 * @description uses the GUI feature to display the the arrays of total words, valid words, and invalid words
 *
 */
public class WordGUI extends Frame { // uses inheritance 

    public WordGUI(){
        this(null, null, null); // the constructor is set to null incase any other array wants to be used 
    }
   /**
    * 
    * @param allWordsArr passes in all of the words into this array 
    * @param validWordsArr passes in all of the valid words into this array
    * @param invalidWordsArr passes in all of the invalid words into this array 
    * 
    * 
    **/
    public WordGUI(String[] allWordsArr, String[] validWordsArr, String[] invalidWordsArr){
        JFrame frame = new JFrame("WordGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); 
        GridLayout gridLayout = new GridLayout(1, 3); 

        frame.getContentPane().setLayout(gridLayout);

        List allWordsList = new List(); // creates the list of words
        allWordsList.add("*** ALL WORDS ***"); //created a title for all words 
        allWordsList.add("                 "); // created a space to see all of the words neatly 
        for(String s : allWordsArr){ // use for loop to go through array 
            allWordsList.add(s); // use add method to input the strings into the list
        }

        List validWordsList = new List(); // creates list of valid words
        validWordsList.add("*** ALL VALID WORDS ***"); // created a title for all valid words
        validWordsList.add("                       "); // created a space to see all of the valid words neatly 
        for(String s : validWordsArr){ // use for loop to go through valid array 
            validWordsList.add(s); // use add method to input the strings into the list
        }

        List invalidWordsList = new List(); // creates list of invalid words
        invalidWordsList.add("*** ALL INVALID WORDS ***"); // created a title of invalid words
        invalidWordsList.add("                 "); // created a space to see all of the invalid words neatly 
        for(String s : invalidWordsArr){ // use for loop to go through invalid array
            invalidWordsList.add(s); // use add method to input the strings into the list
        }
        frame.getContentPane().add(allWordsList);  // uses the getContentPane method to add the list object and display the array 
        frame.getContentPane().add(validWordsList); // same for 52 
        frame.getContentPane().add(invalidWordsList); // same for 52 and 53
        frame.setVisible(true); // set the screen visible to true
    }
    public static void main(String[] args){
        new WordGUI();
    }

}



