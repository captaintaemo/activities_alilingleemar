/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alilingmodule2;
import java.io.File;
/**
 *
 * @author User
 */
public class test3 {
public static void main(String[] arg){
    test();
}
public static void test(){    
File data = new File ("C:\\Users\\User\\Desktop\\RAQUEL\\XMASSMPARTY2018");

String[] fileList = data.list();

for (String beef : fileList){
System.out.println(beef);
}
}
}
