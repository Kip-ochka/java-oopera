public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
    }
}
