
package gradleproject2;
// Import the File class
import java.io.File;  
// Import the IOException class to handle errors
import java.io.IOException;  
/**
 *
 * @author Riyadh54
 */
public class CreateAndWriteFiles {
    public static void main(String[] args) {
        
      try {
      File myObj = new File("myfile.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created successfully: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      //File created: myfile.txt
      // If we want to create a file within a specific path
       // File myObj = new File("C:\\Users\\MyName\\myfile.txt");

  }
}
