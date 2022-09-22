/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
    * created by 21343083_Mubarakh Hayatna Khairy
*/
package jobsheet_5;
/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;

public class Tugas_2 {

    public static void main (String[] args){
	//input OptionPane1
	String name = "";
	name = JOptionPane.showInputDialog("Please enter your words 1#");
	
	//input OptionPane2
	String nama = "";
	nama = JOptionPane.showInputDialog("Please enter your words 2#");
	
	//input OptionPane3
	String namo = "";
	namo = JOptionPane.showInputDialog("Please enter your words 3#");
	
	String msg = name +" "+ nama +" "+ namo ;
	JOptionPane.showMessageDialog(null, msg);
        
        System.out.println (name +" "+ nama +" "+ namo);
    }	
}
