package student;

public class Main {
    public static void main(String[] args) {
        Note n11 = new Note("Math", 10);
        Note n12 = new Note("Bio", 8);
        Note n13 = new Note("English", 9);
        Note n14 = new Note("Phys", 10);
        Note n15 = new Note("Info", 7);
        Note[] notes1 = {n11, n12, n13, n14, n15};
        Student s1 = new Student("Max", notes1);

        System.out.println(s1);
        printSubjectWith10(s1);
    }

    static void printSubjectWith10(Student s) {
        Note[] notes = s.getNotes();
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].getNote() == 10){
                System.out.println(notes[i]);
            }
        }
    }
}
