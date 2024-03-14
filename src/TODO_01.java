import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TODO_01 {
    public static void main(String[] args) throws InterruptedException {
        // TODO 1: Şu anki saati alınan saati geriye doğru saniye saniye saydırınız.
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("kk:mm:ss");
        while (true) {
            System.out.print("\r"+time.format(formatter));
            time = time.minusSeconds(1);
            Thread.sleep(1000);
        }
    }
}
