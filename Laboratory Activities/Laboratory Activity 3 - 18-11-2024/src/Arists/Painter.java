package Arists;

enum Medium {
    OIL,
    WATERCOLOR,
    ACRYLIC,
    PENCIL,
    CHARCOAL
}

class Painter extends Artist {
    private Medium paintingGenre;

    public Painter(String name, String nationality, int age, String speciality, Medium paintingGenre) {
        super(name, nationality, age, speciality);
        this.paintingGenre = paintingGenre;
    }

    public Medium getPaintingGenre() {
        return paintingGenre;
    }

    public void setPaintingGenre(Medium paintingGenre) {
        this.paintingGenre = paintingGenre;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Painter Info ==");
        super.displayInfo();
        System.out.println("Genre: " + paintingGenre);
    }
}