package array;

import java.util.Scanner;

/**
 *This class +++ Insert class description here +++
 *
 * @author Harpuneet
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word");
        String word = input.nextLine();
            
        char[] wordArray = new char[word.length()];
        
        for (int i= 0; i < word.length() ;i++)
            wordArray[i]= word.charAt(i);
        
        char[] newArray = new char[word.length()];
        
        for(int i=0, j=word.length()-1 ; i< word.length(); i++, j--){
            newArray[i]= wordArray[j];
        }
        
        for(int i=0; i< word.length(); i++)
            System.out.print(newArray[i]);
        
        System.out.println();
    }

}
