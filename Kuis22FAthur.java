import java.util.Scanner;
public class Kuis22Fathur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pelanggan hari ini: ");
        int n = sc.nextInt();
        int totalBerat = 0;
        int totalBiaya = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Berat cucian pelanggan ke-" + i + " (kg): ");
            int berat = sc.nextInt();

            int biaya;
            totalBiaya = 0;

            
            // Tarif: sampai 3 kg Rp 15000 (flat), lebih dari 3 kg ditambah Rp 4000 per kg kelebihannya
            if (berat <= 3) {
                biaya = 15000;
                totalBiaya += biaya;
            } else {
                biaya = 15000 + (berat - 3) * 4000;
                totalBiaya += biaya;
            }

            totalBerat += berat;
            
            System.out.println("  Biaya: Rp " + biaya);
        }
        
        double rata2 = 0;
         rata2 = (double) totalBerat / n;

        double rataBerat = totalBerat / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("Total pemasukan : Rp " + totalBiaya);
        System.out.println("Rata-rata berat : " + rata2 + " kg");
    }
    
}
