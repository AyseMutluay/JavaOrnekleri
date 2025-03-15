
package taskagıtmakas;
import java.util.Scanner;
public class TasKagıtMakas {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Tas Kagit Makas Oyununa Hosgeldiniz!!!");
        System.out.println("1-Tas");
        System.out.println("2-Kagit");
        System.out.println("3-Makas");
        System.out.print("Seciminizi yapiniz:");
        int secim=input.nextInt();
        int bilgisayarinsecimi=(1+(int)(Math.random()*3));
        if(secim==bilgisayarinsecimi){
            System.out.println("Berabere");
        }else if(secim==3 && bilgisayarinsecimi==2){
            System.out.println("Kaybettiniz :(");
        }else if(secim==2 && bilgisayarinsecimi==3){
            System.out.println("Kazandiniz :)");
        }else if(secim>bilgisayarinsecimi){
            System.out.println("Kazandiniz :)");
        }else if(secim<bilgisayarinsecimi){
            System.out.println("Kaybettiniz :(");
        }System.out.println("Sectiginiz: "+secim+" ve "+"Bilgisayarin sectigi: "+bilgisayarinsecimi);
    }
    
}
