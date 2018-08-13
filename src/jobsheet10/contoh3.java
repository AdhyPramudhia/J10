
package jobsheet10;
import java.util.Scanner;
public class contoh3 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int[] emboh = new int[5];
        double total = 0;
        double max;
        double min;
        
        for(int i=0; i < emboh.length; i++)
        {
            System.out.print("masukan angka: ");
            emboh[i] = baca.nextInt();
        }
        for (int i = 0; i < emboh.length; i++) 
        {
            total += emboh[i];
        }
        max = emboh[0];
        
        for (int i = 1; i < emboh.length; i++) {
            if (emboh[i] > max)
            { max = emboh[i];}
        }
        min = emboh[0];
        
        for (int i = 1; i < emboh.length; i++) {
            if (emboh[i] < min)
            { min = emboh[i];}
        }
        System.out.println("Nilai total: " + total);
        System.out.println("RATA RATA : " + total/emboh.length);
        System.out.println("Nilai MAX: " + max);
        System.out.println("Nilai MIN: " + min);
        }
    }

