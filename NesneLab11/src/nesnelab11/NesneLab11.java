


package nesnelab11;

import java.util.Scanner;



public class NesneLab11 {

   
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x=0,y=0,sayi=0;
        Oyun oyun  = new Oyun();
        oyun.oyun();
        oyun.tahtaCiz();
        
        while(oyun.bittiMi()==false){
            
            do{
                System.out.println("Kordinatları giriniz:");
                x = scan.nextInt();
                y = scan.nextInt();
                System.out.println("Hangi rakamı yerleştirmek istersiniz:");
                sayi = scan.nextInt();
            }while(x<0||x>3||y<0||y>3||sayi<0||sayi>9);
            
            oyun.sayiKoy(sayi,x,y);
            oyun.tahtaCiz();
            
        }
         
    }
    
}
