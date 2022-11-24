import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double p=3.14;
        int r;
        Scanner input = new Scanner(System.in);
        System.out.print("radiusu daxil edin: ");
        r = input.nextInt();


        double cevreSahe = p * r * r;
        double cevrePerimetr = 2 * p * r;

        System.out.println("cevrenin sahesi :"+cevreSahe);
        System.out.println("cevrenin perimetri : "+cevrePerimetr);




    }
}