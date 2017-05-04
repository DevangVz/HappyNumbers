/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happynumbers;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Devang
 */
public class HappyNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HappyNumbers hn= new HappyNumbers();
        try {
            System.out.println(hn.areUHappy(20));
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    } 
    
    public ArrayList<Integer> array= new ArrayList<>();
    
    public Integer areUHappy(Integer number) throws Exception{
        System.out.println("Number:"+number);
        String value=number.toString();
        if(number==1){
            return number;
        }
        if(array.contains(number)){
            throw new Exception("It seems you cicle on "+number+ " value");
        }
        array.add(number);
        Double so=0d;
        for(int i=0;i<value.length();i++){
            so+=Math.pow(Double.parseDouble(value.charAt(i)+""),2);
            System.out.println(value.charAt(i)+"^2="+Math.pow(Double.parseDouble(value.charAt(i)+""),2));
        }
       return areUHappy(so.intValue());
    }
     
}
