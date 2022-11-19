package Practices.Practic1;
//Kullanıcıdan veri alabilmek için Scanner sınıfını dahil ediyoruz.
import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);


        //Değişkenleri tanımladık.
        int number,i,sum = 0,counter = 0,aveage = 0;


        //Kullanıcıdan bir sayı girmesini istiyoruz.
        System.out.print("Please enter a number: ");
        number = input.nextInt();


        for (i = 0; i < number; i++){//i 0'dan başlasın, girilen sayıya kadar 1-1 artarak devam etsin.
            //System.out.println(i);
            if(((i % 3) == 0) && ((i % 4) == 0)){//3'e ve 4'e tam bölünüyorsa.
                System.out.println("Numbers: " + i);
                sum += i; // bölünebilen her i'yi sum değişkenine atıyor.
                counter ++; //her if içeriği gerçekleştiğinde sayacı 1 artrıyoruz.

            }
        }

        //ortalamayı hesaplatıyoruz.
        aveage = sum / counter;

        //Ortalamayı ekrana yazdırıyoruz.
        System.out.println("Average: " + aveage);


    }
}
