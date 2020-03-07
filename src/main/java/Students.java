public final class Students extends People<Student> {
    private static  Students INSTANCE = new Students();


    private Students(){}


    public static Students getInstance(){
        if(INSTANCE ==null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }


    public Student[] toArray() {
        Student[] students = Students.getInstance().toArray();
        return students;
    }


}
