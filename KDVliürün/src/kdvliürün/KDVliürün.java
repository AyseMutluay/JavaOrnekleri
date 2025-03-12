/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kdvliürün;

import java.util.Scanner;
public class KDVliürün {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("Urunun KDVsiz fiyatini giriniz:");
       double fiyat=input.nextDouble();
       final double KDVyüzdesi=0.18;
       double KDVlifiyat=fiyat+fiyat*KDVyüzdesi;
       System.out.println("Urunun KDV'li fiyati:"+KDVlifiyat);
    }
    
}
