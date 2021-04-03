package classs;

public class App {
    public static void main(String[] args) {
        Student s = new Student(30,"Max");
        System.out.println(s);
        s.setAge(31);
        System.out.println(s);
    }
}
