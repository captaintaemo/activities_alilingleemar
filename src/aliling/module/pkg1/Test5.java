/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aliling.module.pkg1;

/**
 *
 * @author User
 */
public class Test5 {
  
public static void main(String[] args){
        String first = "i love you";
        String second = "i love";
        System.out.println("The given string is: " + first);
        System.out.println("The given mask string is: " + second);
        char arr[] = new char[first.length()];
        char[] mask = new char[256];
        for (int i = 0; i < second.length(); i++){
        mask[second.charAt(i)]++;
        }
        System.out.print("\nThe new string is: ");
        for (int i = 0; i <first.length(); i++) {
            if (mask[first.charAt(i)] == 0){
                System.out.print(first.charAt(i));
            }
        }
        System.out.println();
      }    
    
}
