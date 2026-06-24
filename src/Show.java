import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
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
        ArrayList<Integer> matches = new ArrayList<>();
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surname)) {
                matches.add(i);
            }
        }
        if (matches.isEmpty()) {
            System.out.println("Внимание: актёр с фамилией \"" + surname
                    + "\" не найден в спектакле \"" + title + "\". Замена не выполнена.");
            return;
        }
        if (matches.size() > 1) {
            System.out.println("Внимание: в спектакле \"" + title
                    + "\" найдено несколько актёров с фамилией \"" + surname
                    + "\" (" + matches.size() + "). Уточните, кого именно заменить:");
            for (int id : matches) {
                System.out.println("  [" + id + "] " + listOfActors.get(id));
            }
            System.out.println("Замена не выполнена.");
            return;
        }

        listOfActors.set(matches.getFirst(), newActor);
        System.out.println("В спектакле \"" + title + "\" актёр с фамилией "
                + surname + " заменён на " + newActor);
    }
}
