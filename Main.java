 import java.util.Scanner;
/**
 * This program puts 10 numbers into an array and finds which one is the largest
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in); 

    //ask user user for 10 integers 
    System.out.println("Please enter 10 integers to put into array"); 
     

    //create an array with 10 spots 
    int[] integers = new int[10]; 

    //putting their numbers into array using a loop  
    for(int i = 0; i < 10; i++){
      integers[i] = input.nextInt(); 
    }     

     int biggest = integers[0]; 

  
    //use loop to find out what the largest number is 
    for(int i = 0; i < 10; i++){
      if(integers[i] > biggest){
        biggest = integers[i]; 
      }
    } 
    //tell user what the biggest number is
     System.out.println("The largest number is " + biggest);
    
  }
}
