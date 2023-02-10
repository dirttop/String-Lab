//Gleb Syomichev and Dilan Leon

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scob = new Scanner(System.in);
    System.out.println("\nHi Dr. Morgan! We put all 3 tasks in one file because we are that cool. Moby dick something something something Ishmael something something.");
    //task 1
    System.out.println("\n'HI' counter!");
    String hi = scob.nextLine();
    int counter = 0;
    for (int i = 0; hi.length() > i + 1; i++) { 
      String check = hi.substring(i,i+2);
        if (check.equals("hi") || check.equals("Hi") || check.equals("HI") || check.equals("hI")) {
          counter += 1;
      }
      
        }
    System.out.println("heres how many times you said hi: " + counter + ". Wow that's a lot of hi's. goodbye earthling.┬┴┬┴┤(･_├┬┴┬┴");

    //task 2
    System.out.println("\nTask 2 baby. Duplicate single letters");
    String doubleword = scob.nextLine();
    doubleword = doubleword.concat(" ");
    String space = (" ");
    doubleword = space.concat(doubleword);
    String result = "";
    for (int i = 1; doubleword.length() > i+1; i++) { 
      String single = doubleword.substring(i,i+1);
      if ((single.equals(doubleword.substring(i+1, i+2))) || single.equals(doubleword.substring(i-1,i))) {
        result = result.concat(single);
      }
      else {
        result = result.concat(single);
        result = result.concat(single);
      }
    }
    System.out.println("Here's ya word, any tip? 15%? : " + result);

    //task 3
    System.out.println("\nTask 3! Returns true if letters split by * are the same");
    String textinput = scob.nextLine();
    textinput = textinput.concat(" "); //stupid fix to a stupid problem
    boolean check = false;
    for (int i = 0; textinput.length() > i + 1; i++) {
      int starIndex = (textinput.substring(i)).indexOf("*"); 
      if (starIndex != 0 && starIndex != -1){ 
        if (((textinput.substring(i)).substring(starIndex-1, starIndex)).equals((textinput.substring(i)).substring(starIndex+1, starIndex+2)))  { 
        
          check = true;
        } 
      }
    }
    System.out.println("Are they the same??? 0u0 : " + check);
  
  }
      
}
/*doesnt it need every letter to be true tho, maybe we should make lists? because aa != a oh its for every single instance of the asterisk? yeah that was the issue with the last method, its flupping stupid
"*pmn*n*nmr” -> true"
whiskey tango foxtrot dr morgan this makes no sense
wait what, how is that true, pmn != nmr “abc*cde” -> true
 Write a program that accepts a String from the user and prints true only if the String has identical characters before and after every asterisk in the String
i see, all he wants is that the character before and after the asterix are true, ie a*ab*ba = true
thats what is implied in the examples but not what is said in the instructions
i think we follow the examples because its easier yeah agreed
i guess we just call it a day because if we run the code with the examples it returns correctly*/