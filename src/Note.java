import java.util.Objects;

class Note {
    private String name;
    private String text;

    public Note(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        Note note = (Note) o;
        return Objects.equals(name, note.name) &&
                Objects.equals(getText(), note.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getText());
    }

}
