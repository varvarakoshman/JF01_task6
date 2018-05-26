public class Main {

    public static void main(String[] args) {
        int n = 5; //number of notes (5 as an example)
        Note[] array = new Note[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Note("note" + i, "notenotenote");
        }
        Notepad pad = new Notepad(array);
        pad.viewAll();
        System.out.println();
        pad.addNew(new Note("NEW note", "note_note_note"));
        pad.viewAll();
        System.out.println();
        pad.remove(array[2]);
        pad.viewAll();
        //  System.out.println();
        // pad.edit(array[3], "note");
        // pad.viewAll();
    }
}
