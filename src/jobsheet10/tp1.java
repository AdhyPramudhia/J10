/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;
import java.util.*;

public class tp1 {
     public static void main(String[] args) 
    {
        String[] nama = {"adhy", "lian", "jessy", "ryanda", "rifqi","okky"};
        String x,y ="";
        
        System.out.print("Masukan Nama: ");
        Scanner emboh = new Scanner(System.in);
        x = emboh.nextLine();
        
        for (int i = 0; i < nama.length; i++) 
        {
             if(x.equals(nama[i]))
            {
               y = nama[i];
            }
             
        }
        if(y.equals(x))
        {
            System.out.println("Data Ditemukan");
        }
        else
        {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
