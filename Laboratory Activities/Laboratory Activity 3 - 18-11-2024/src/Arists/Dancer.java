package Arists;

enum DanceStyle {
    BALLET,
    HIPHOP,
    JAZZ,
    CONTEMPORARY
}

class Dancer extends Artist {
    private DanceStyle danceGenre;

    public Dancer(String name, String nationality, int age, String speciality, DanceStyle danceGenre){
        super(name, nationality, age, speciality);
        this.danceGenre = danceGenre;
    }

    public DanceStyle getDanceGenre(){
        return danceGenre;
    }

    public void setDanceGenre(DanceStyle danceGenre){
        this.danceGenre = danceGenre;
    }

    @Override
    public void displayInfo(){
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Genre: " + danceGenre);
    }
}
