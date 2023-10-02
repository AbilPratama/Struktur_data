import java.util.Scanner;
public class Discount {
    public static void main(String[] args) throws Exception {
        Double TotalBelanja, discount;

        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan Total Belanja: ");
        TotalBelanja = masukkan.nextDouble();

        if (TotalBelanja >= 100000) {
            discount = (5 * TotalBelanja) /100;
            TotalBelanja = TotalBelanja - discount;
        }

        System.out.println("Total yang harus dibayar: " + TotalBelanja);
        masukkan.close();

    }
}