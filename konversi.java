import java.util.Scanner;
public class konversi {
    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        boolean a=true;
        while(a){
            System.out.println("Pilih Konversi Dari Angka 1 sampai 6 !!");
            System.out.println(" 1  Biner ke Desimal");
            System.out.println(" 2  Desimal ke Biner");
            System.out.println(" 3  Biner ke Hexa");
            System.out.println(" 4  Hexa ke Biner");
            System.out.println(" 5  Desimal ke Hexa");
            System.out.println(" 6  Hexa ke Desimal");
            System.out.println(" 7  Keluar");
            System.out.print("Pilih  : ");
            int i;
            int s = In.nextInt();
            System.out.println("________________________________________\n");
            switch(s){
                case 1:
                    int bil_biner, bil_desimal=0, digit;
                    i=1;
                    System.out.print("Masukkan Bilangan Biner  : ");
                    bil_biner = In.nextInt();

                    while(bil_biner!=0){
                        digit = bil_biner%10;
                        bil_desimal = bil_desimal+(digit*i);
                        i = i*2;
                        bil_biner = bil_biner/10;
                    }System.out.println("Bilangan Desimalnya Adalah : "+bil_desimal);
                    break;
                case 2:
                    int[] bil = new int[32];
                    int bg;

                    System.out.print("Masukkan Bilangan Desimal  : ");
                    bg = In.nextInt();

                    for(i=0;bg>0;i++){
                        bil[i] = bg%2;
                        bg = bg/2;
                    }System.out.print("Bilangan Binernya Adalah : ");
                    for(i=i-1;i>=0;i--){
                        System.out.print(bil[i]);
                    }System.out.println();
                    break;
                case 3:
                    int biner;
                    System.out.print("Masukkan Bilangan Biner  : ");
                    biner = Integer.parseInt(In.next(),2);

                    String Hexa = Integer.toHexString(biner);
                    Hexa = Hexa.toUpperCase();
                    System.out.println("Bilangan Hexa-nya Adalah  : "+Hexa);
                    break;
                case 4:
                    String Hex;
                    System.out.print("Masukkan Bilangan Hexa  : ");
                    Hex = In.next();
                    long dec = Long.parseLong(Hex,16);
                    String Bin = Long.toBinaryString(dec);
                    System.out.println("Bilangan Binernya Adalah  : "+Bin);
                    break;
                case 5:
                    int desi;
                    System.out.print("Masukkan Bilangan Desimal  : ");
                    desi = Integer.parseInt(In.next());

                    String Hexades = Integer.toHexString(desi);
                    Hexades = Hexades.toUpperCase();
                    System.out.println("Bilangan Hexa-nya Adalah  : "+Hexades);
                    break;
                case 6:
                    String Hexaa;
                    System.out.print("Masukkan Bilangan Hexa  : ");
                    Hexaa = In.next();
                    long deci = Long.parseLong(Hexaa,16);
                    System.out.println("Bilangan Desimalnya Adalah  : "+deci);
                    break;
                case 7:
                    System.out.println("Terima Kasih");
                    a = false;
                    break;
                default :
                    System.out.println("Maaf Pilihan Anda Tidak Tersedia");

            }System.out.println("========================================\n");
            
        }
        In.close();
    }
    
}
