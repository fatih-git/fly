import java.util.Scanner;

/**
 * @author fatih-git
 */

public class Fly {

    public static void main(String[] args) {

        double yas, select, km, tutar;
        Scanner input=new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi giriniz (km): ");
        km=input.nextDouble();

        System.out.print("Yaşınızı giriniz :");
        yas=input.nextDouble();

        System.out.print("Tek yön bilet ise 1, gidiş-dönüş ise 2 tuşlayınız: ");
        select=input.nextDouble();

        tutar=km*0.10;

        if(yas<12){
            tutar-=tutar*50/100;
        }
        else if(yas>=12 && yas<24){
            tutar-=tutar*10/100;
        }
        else if(yas>65){
            tutar-=tutar*30/100;
        }

        if(select==2){
            tutar-=tutar*20/100;
            tutar*=2;
        }

        if(yas<0 || km<1 || (select!=1 && select!=2)){
            System.out.println("Hatalı giriş yapıldı!");
        }
        else{
            System.out.println("Biletinizin tutarı: "+tutar);
        }

    }

}
