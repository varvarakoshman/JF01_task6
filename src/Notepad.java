import java.util.Arrays;

class Notepad {
   private Note[] notes;

    public Notepad(Note[] notes) {
        this.notes = notes;
    }

    public void addNew(Note note) {
        notes = Arrays.copyOf(notes, notes.length + 1);
        notes[notes.length - 1] = note;
    }

    public void remove(Note note) {
        int index = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].equals(note)) {
                index = i;
                break;
            }
        }
        for (int i = index + 1; i < notes.length; i++) {
            notes[i - 1] = notes[i];
        }
        notes = Arrays.copyOf(notes, notes.length - 1);
    }

    public void edit(Note note, String newText){
        note.setText(newText);
    }

    public void viewAll() {
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i].getName() + " " + notes[i].getText());
        }
    }

}
