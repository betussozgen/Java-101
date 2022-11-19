package Homework;
//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class ChinesZodiac {
    public static void main(String[] args) {


        //Değişkenleri tanımlıyoruz.
        int month;
        String horoscope = " ";

        //hata var mı diye kontrol etmek ve kod daha temiz olsun diye isError kullandık.
        boolean isError = false;


        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);


        //Gün ve ay bilgisini kullanıcıdan alıyoruz.
        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        //Kalanı buluyoruz.
        int remainder = month % 12;


        //Kalan'a göre ekranda belirmesini istediğimiz koşullar.

        switch (remainder) {
            case 0:
                horoscope = "Monkey/Maymun";
                break;
            case 1:
                horoscope = "Rooster/Horoz";
                break;
            case 2:
                horoscope = "Dog/Köpek";
                break;
            case 3:
                horoscope = "pig/Domuz";
                break;
            case 4:
                horoscope = "Mouse/Fare";
                break;
            case 5:
                horoscope = "Cow/Öküz";
                break;
            case 6:
                horoscope = "Tiger/Kaplan";
                break;
            case 7:
                horoscope = "Rabbit/Tavşan";
                break;
            case 8:
                horoscope = "Dragon/Ejderha";
                break;
            case 9:
                horoscope = "Snake/Yılan";
                break;
            case 10:
                horoscope = "Horse/At";
                break;
            case 11:
                horoscope = "Sheep/Koyun";
                break;
            default:
                System.out.println("Error");
        }

        if (isError){
            System.out.println("You entered an incorrect month! Please try again.");
        }else {
            System.out.println("Your horoscope: " + horoscope);
        }

    }
}
