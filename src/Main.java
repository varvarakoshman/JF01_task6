/*
Задание 6.Простейшие классы и объекты
Спроектировать и разработать классы Запись в блокноте и Блокнот(записи блокнота хранятся в массиве).
Реализовать методы: 1)Добавить запись
                    2)Удалить запись
                    3)Редактировать запись
                    4)Посмотреть все записи.
*/

public class Main {

    public static void main(String[] args) {
        int n = 5; //number of notes (5 as an example)
        Note[] array = new Note[n];
        for (int i = 0; i < n; i++) {
            array[i] = new Note("note" + i, "notenotenote");
        }
        Notepad pad = new Notepad(array);
        pad.addNew(new Note("NEW note", "note_note_note"));
        pad.remove(array[2]);
        pad.edit(array[3], "note");
        pad.viewAll();
    }
}
