import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        int a,b,c;

        Scanner grs= new Scanner(System.in);

        System.out.println("Birbirinden farkli sayi giriniz");

        System.out.println("a sayisini giriniz");
        a = grs.nextInt();
        System.out.println("b sayisini giriniz");
        b = grs.nextInt();
        System.out.println("c sayisini giriniz");
        c = grs.nextInt();

        if(a>b&&b>c){
            System.out.println("a>b>c");
        }
        else if(c>a&&a>b){
            System.out.println("c>a>b");
        }
        else if(b>a&&a>c){
            System.out.println("b>a>c");
        }
        else if(b>c&&c>a){
            System.out.println("b>c>a");
        }
        else if(c>b&&b>a){
            System.out.println("c>b>a");
        }
        else if(a>c&&c>b){

            System.out.println("a>c>b");

        }



    }
}
