public final class Students extends People<Student> {
    private static  Students INSTANCE = new Students();



    private Students(){}
    String[]init = {"raheel", "moe", "jimmy", "giles", "han", "von", "kevin", "chip", "emma", "greg"};
    //for(Integer i = 0; i < init.length)


    public static Students getInstance(){
        if(INSTANCE ==null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }



}
