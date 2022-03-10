
package gradleproject2;

/**
 *
 * @author Riyadh54
 */

//Create a class named "ClassesAndObjects" with a variable x:
public class ClassesAndObjects {
    
    int x = 120;
    
    public static void main(String[] args) {
        //Create an object called "myObj" and print the value of x:
        ClassesAndObjects myObj = new ClassesAndObjects();
        System.out.println(myObj.x);
        
        //Multiple Objects
         ClassesAndObjects myObj1 = new ClassesAndObjects();  // Object 1
         ClassesAndObjects myObj2 = new ClassesAndObjects();  // Object 2
         System.out.println(myObj1.x);
         System.out.println(myObj2.x);
    
    
    
    }
    
}
