import java.util.Scanner;

public class Triangle19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc.nextInt();
        
        int i = 1;
        while (i <= N) { 
            int j = 1; 
            while (j <= i) {
                System.out.print("*");
                j++; 
            }
            System.out.println(); 
            i++; 
        }
    }
}
