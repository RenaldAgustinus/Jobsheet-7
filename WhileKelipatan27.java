import java.util.Scanner;
public class ForKelipatan27 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        int i = 1
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;   
                System.out.printf("%d Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n",i, kelipatan, counter); 
            }
               i++; 
            }
           System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah );
        }

    }
