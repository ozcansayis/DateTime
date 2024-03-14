import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TODO_03 {
    public static void main(String[] args) {
        // TODO 3: Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        //         yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.
        //         Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        //         Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total debt amount: ");
        int totalAmount = scanner.nextInt();

        System.out.print("Enter the start date (dd-MM-yyyy): ");
        String startDateInput = scanner.next();
        String[] dateStr= startDateInput.split("-");
        int[] dateInt= new int[3];
        for (int i = 0; i < dateStr.length; i++) {
            dateInt[i]=Integer.parseInt(dateStr[i]);
        }
        LocalDate startDate = LocalDate.of(dateInt[2],dateInt[1],dateInt[0]);

        System.out.print("Enter the number of installments: ");
        int installmentCount = scanner.nextInt();

        double installmentAmount = totalAmount/(double)installmentCount;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Payment Plan:");
        System.out.println("Installment No - Payment Date - Amount Due");

        for (int i = 1; i <= installmentCount; i++) {
            LocalDate installmentDate = startDate.plusMonths(i);
            System.out.println(i + " - " + formatter.format(installmentDate) + " - " + installmentAmount + " TL");
        }

        scanner.close();
    }
}