import java.time.LocalTime;
import java.util.Scanner;

public class TODO_02 {
    public static void main(String[] args) throws InterruptedException {
        // TODO 2: kullanıcıdan alınan saati geriye doğru saniye saniye saydırınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown time(hh:mm:ss): ");
        String timeStr= scanner.nextLine();
        String [] timeStrA= timeStr.trim().split(":");
        int[] timeInt= new int[3];
        for (int i = 0; i < 3; i++) {
            timeInt[i]=Integer.parseInt(timeStrA[i]);
        }
        LocalTime time= LocalTime.of(timeInt[0],timeInt[1],timeInt[2]);
        while (true){
            System.out.print("\r"+time);
            time = time.minusSeconds(1);
            Thread.sleep(1000);
        }
    }
}