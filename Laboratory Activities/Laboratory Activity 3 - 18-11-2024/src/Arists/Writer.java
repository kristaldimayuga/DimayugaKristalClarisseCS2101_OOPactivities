package Arists;

enum WritingStyle {
    FICTION,
    NONFICTION,
    POETRY,
    DRAMA
}

class Writer extends Artist {
    private WritingStyle writingStyle;

    public Writer(String name, String nationality, int age, String speciality, WritingStyle writingStyle){
        super(name, nationality, age, speciality);
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle(){
        return writingStyle;
    }

    public void setWritingStyle(WritingStyle writingStyle){
        this.writingStyle = writingStyle;
    }

    @Override
    public void displayInfo(){
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("Genre: " + writingStyle);
    }
}
