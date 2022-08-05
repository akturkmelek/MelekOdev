import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String studentName = input.nextLine();
        System.out.println("Lütfen soyadınızı giriniz : ");
        String studentSurName = input.nextLine();
        System.out.println("Lütfen quiz notunuzu giriniz : ");
        int quizNoteResult = input.nextInt();
        System.out.println("Lütfen vize notunuzu giriniz : ");
        int vizeNoteResult = input.nextInt();
        System.out.println("Lütfen final notunuzu giriniz : ");
        int finalNoteResult = input.nextInt();

        double examAverage = (quizNoteResult*0.1) + (vizeNoteResult*0.3) + (finalNoteResult*0.6);
        System.out.println("Sınav ortalaması : " + examAverage + "dır");

        if(examAverage>=85)
        {
            System.out.println("Sayın " + studentName + " " + studentSurName + " Not ortalamanız : " + examAverage + "'dır . AA");
        }
        else if (examAverage<85 && examAverage>=70)
        {
            System.out.println("Sayın " + studentName + " " + studentSurName + " Not ortalamanız : " + examAverage + "'dır . BB" );
        }
        else if (examAverage<70 && examAverage>=60)
        {
            System.out.println("Sayın " + studentName + " " + studentSurName + " Not ortalamanız : " + examAverage + "'dır . CC" );
        }
        else if (examAverage<60 && examAverage>=45)
        {
            System.out.println("Sayın " + studentName + " " + studentSurName + " Not ortalamanız : " + examAverage + "'dir . DD" );
        }
        else{
            System.out.println("Sayın " + studentName + " " + studentSurName + " Not ortalamanız FF Sınıfta Kaldınız :( ");
        }
    }
    }

