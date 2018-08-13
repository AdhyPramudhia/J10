
package jobsheet10;
import java.util.Scanner;
public class tp2 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int[] kintil = new int[6];
        
        for(int i=0; i < kintil.length; i++)
        {
            System.out.print("masukan angka: ");
            kintil[i] = baca.nextInt();
        }
            System.out.print("Bilangan Genap  : ");
        for (int i = 0; i < kintil.length; i++)
        {
            if (kintil [i] % 2 == 0) 
        {
            System.out.print(kintil[i] + " ");
        }
        }
        System.out.println("");
        System.out.print("Bilangan Ganjil : ");
        for (int i = 0; i < kintil.length; i++)
        {
            if(kintil[i] % 2== 1)
        {
            System.out.print(kintil[i] + " ");
        }
        }
        System.out.println("");
    }
}


