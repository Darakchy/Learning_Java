package student;

import java.util.Arrays;

public class Student {
    private String name;
    private Note[] notes;

    public Student(String name, Note[] notes) {
        this.name = name;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public Note[] getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", " + Arrays.toString(notes);
    }
}
