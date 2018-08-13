/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
import java.util.Scanner;
/**
 *
 * @author SKIPPER
 */
public class contoh2 {
    public static void main(String[] args)
    {
        
        Scanner baca = new Scanner(System.in);
        String[] nama = new String[5];
        
        for(int i=0; i<=4; i++)
        {
            System.out.print("siswa ke-" + (i+1) + ": ");
            nama[i]= baca.nextLine();
        }
        System.out.println();
        for (int i = 0; i < nama.length; i++) {  
        {
            System.out.println("siswa ke - " + (i+1)+ ": " + nama[i]);
        }
            
        }
    }
    
}
