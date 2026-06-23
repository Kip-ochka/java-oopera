public class Theatre {
    public static void main(String[] args) {

        Actor ivanov = new Actor("Иван", "Иванов", Gender.MALE, 182);
        Actor petrova = new Actor("Мария", "Петрова", Gender.FEMALE, 170);
        Actor sidorov = new Actor("Пётр", "Сидоров", Gender.MALE, 178);

        Director smirnov = new Director("Алексей", "Смирнов", Gender.MALE, 12);
        Director kuznetsova = new Director("Ольга", "Кузнецова", Gender.FEMALE, 8);

        Person tchaikovsky = new Person("Пётр", "Чайковский", Gender.MALE);
        Person grigorovich = new Person("Юрий", "Григорович", Gender.MALE);

        Show drama = new Show("Гроза", 120, smirnov);

        Opera opera = new Opera(
                "Евгений Онегин", 180, kuznetsova,
                tchaikovsky, "Татьяна пишет письмо Онегину...", 24);

        Ballet ballet = new Ballet(
                "Лебединое озеро", 150, smirnov,
                tchaikovsky, "Принц Зигфрид встречает заколдованную Одетту...", grigorovich);

        System.out.println("===== Распределение актёров =====");
        drama.addActor(ivanov);
        drama.addActor(petrova);
        drama.addActor(sidorov);
        drama.addActor(petrova);

        opera.addActor(ivanov);
        opera.addActor(petrova);

        ballet.addActor(sidorov);
        ballet.addActor(petrova);

        System.out.println("\n===== Списки актёров =====");
        drama.printActors();
        opera.printActors();
        ballet.printActors();

        System.out.println("\n===== Замена актёра =====");
        opera.replaceActor(sidorov, "Петрова");
        opera.printActors();

        System.out.println("\n===== Замена несуществующего актёра =====");
        drama.replaceActor(ivanov, "Несуществующий");

        System.out.println("\n===== Либретто =====");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();

        System.out.println("\n===== Режиссёры =====");
        drama.printDirectorInfo();
        opera.printDirectorInfo();
        ballet.printDirectorInfo();
    }
}
