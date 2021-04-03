import java.io.IOException;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        System.out.println(1.2f % 2);
        try {
            replace(null);
        } catch (IOException throwables) {
            System.out.println("Problem");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static void replace(String s) throws IOException {

    }
}
