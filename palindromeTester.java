import java.util.*;
//This program is designed to take an input and determine if it is a plaindrome
class Main {
  public static void main(String[] args) {


    Scanner get = new Scanner (System.in);

    System.out.println("What string would you like to tesy today?: ");

    String input = get.next();

    System.out.println("Is " + input + " a palindrome? Using recursion: " + isAPalindrome(input) + " and using a For loop: " + isAPalindrome2(input));


  }

  public static boolean isAPalindrome(String input){

    String reverse = reverse(input);
    if (input.equals(reverse)){
      return true;
    }

    else return false;
  }

  public static String reverse (String input){
    if (input == null || input.isEmpty()){

      return input;

    }
    else {
      return input.charAt(input.length()-1)+reverse(input.substring(0, input.length()-1));
    }
  }

  public static boolean isAPalindrome2(String input){
    String value = "";
    for (int i = input.length()-1; i >= 0;i--){
      value += input.charAt(i);
    }
    if (input.equals(value)){
      return true;
    }

    else return false;

  }
}
