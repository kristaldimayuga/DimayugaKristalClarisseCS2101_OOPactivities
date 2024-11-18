package Arists;

public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("AURORA", "Norwegian", 28, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Lana Del Rey", "American", 39, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Parris Goebel", "New Zealander", 33, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("John Singer Sargent", "American", 69, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Sarah J. Maas", "American", 38, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
    }
}
