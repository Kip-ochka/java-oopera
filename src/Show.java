import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  (список пуст)");
        }
        for (Actor actor : listOfActors) {
            System.out.println("  - " + actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Внимание: актёр " + actor
                    + " уже участвует в спектакле \"" + title + "\". Повторно не добавлен.");
            return;
        }
        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                System.out.println("В спектакле \"" + title + "\" актёр с фамилией "
                        + surname + " заменён на " + newActor);
                return;
            }
        }
        System.out.println("Внимание: актёр с фамилией \"" + surname
                + "\" не найден в спектакле \"" + title + "\". Замена не выполнена.");
    }
}
