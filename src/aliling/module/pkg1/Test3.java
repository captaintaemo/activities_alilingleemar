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
public class Test3 {
   
    
 public static void main(String[] args){
      int[] saber = new int[] {69, 69, 69, 69, 69, 69, 6969};
      double sum = 0;
  
      for (int i=0; i < saber.length ; i++) {
          sum = sum + saber[i];
      }
      double average = sum / saber.length;
      System.out.println("Average value of the array elements is : " + average);
     }
}
