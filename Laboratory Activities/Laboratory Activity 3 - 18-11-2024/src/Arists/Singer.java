package Arists;

enum Genre {
    POP,
    ROCK,
    CLASSICAL,
    JAZZ,
    HIPHOP,
    RNB
}

class Singer extends Artist {
    private Genre singingGenre;

    public Singer(String name, String nationality, int age, String speciality, Genre singingGenre) {
        super(name, nationality, age, speciality);
        this.singingGenre = singingGenre;
    }

    public Genre getSingingGenre() {
        return singingGenre;
    }

    public void setSingingGenre(Genre singingGenre) {
        this.singingGenre = singingGenre;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Singer Info ==");
        super.displayInfo();
        System.out.println("Genre: " + singingGenre);
    }
}