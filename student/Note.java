package student;

public class Note {
    private String subject;
    private int note;

    public Note(String subject, int note) {
        this.subject = subject;
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Note(" + subject + ", " + note + ')';
    }
}
