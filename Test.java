import java.io.IOException;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        String numbers = "0123456789";

        StringBuilder sb = new StringBuilder(numbers);

        sb.append(new Object());
        sb.append('\n');
        sb.append(new Object());

        System.out.println(sb.toString());
    }
}
