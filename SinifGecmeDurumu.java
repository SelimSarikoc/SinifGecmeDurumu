import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int turkce, matematik, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        if ((turkce < 0 || turkce > 100) ){
            turkce = 0;
        }

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        if ((matematik < 0 || matematik > 100) ){
            matematik = 0;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        if ((fizik < 0 || fizik > 100) ){
            fizik = 0;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        if ((kimya < 0 || kimya > 100) ){
            kimya =0;
        }

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        if ((muzik < 0 || muzik > 100) ){
            muzik = 0;
        }


        double ortalama = ( (turkce + matematik + fizik + kimya + muzik) / 5);
        System.out.print("Not Ortalamanız: " +ortalama);

        if (ortalama <= 55){
            System.out.println("\nSınıf Tekrarı! ");
        }else {
            System.out.println("\nSınıfı Geçti! ");
        }








    }
}
