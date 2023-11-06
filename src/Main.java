import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dist, year, type;



        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz :");
        year = inp.nextInt();
        System.out.print("Lütfen gideceğiniz mesafeyi km cinsinden giriniz :");
        dist= inp.nextInt();
        System.out.print("Lütfen yolculuk tipini giriniz (1=>tek yön, 2=> çift yön :");
        type= inp.nextInt();

        double price = dist*0.10;

       switch (type){
           case 1 :
               if(year<12){
                   System.out.println(price*0.5);
               }
               else if ((year>11) && (year<25)) {
                   System.out.println(price*0.9);
               }
               else if (year>65){
                   System.out.println(price*0.7);

               }break;

           case 2 :
               if(year<12){
                   System.out.println(price*0.5*0.8);
               }
               else if ((year>11) && (year<25)) {
                   System.out.println(price*0.9*0.8);
               }
               else if (year>65){
                   System.out.println(price*0.7*0.8);
               }


        }








    }
}