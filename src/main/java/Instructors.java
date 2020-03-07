public final class Instructors extends People<Instructor>{
    private static Instructors INSTANCE = new Instructors();


    private Instructors(){}

    public static Instructors getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] instructors = Instructors.getInstance().toArray();
        return instructors;
    }


}
