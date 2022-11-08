package Giris;
import java.util.Scanner;
public class UsHesaplama {
    public static void main(String[] args) {
        Scanner baba = new Scanner(System.in);
        int p,l;
        int total = 1;
        System.out.print("Üssü alınacak sayıyı girin :");
        p = baba.nextInt();
        System.out.print("Üs olacak sayıyı girin : ");
        l = baba.nextInt();

        for(int i=1; i<=l; i++){
            total *= p;
        }
        System.out.println("Cevap : " + total);
    }
}
