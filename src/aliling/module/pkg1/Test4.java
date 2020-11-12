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
public class Test4 {
    
public boolean endsNg (String str) {
        int Leo = str.length();
        String ml = "mords";
        if (Leo < 3)
        {    
            return false;
        } else if (ml.equals(str.substring( Leo - 3, Leo))){
            return true;
        } 
         return false;
    }
    public static void main(String[] args){
        Test4 m = new Test4();
        String leo = "Leomord";
        System.out.println("The given strings is: " + leo);
        System.out.println("The string containing mords at last: " + m.endsNg(leo));
    }
    
    

}
