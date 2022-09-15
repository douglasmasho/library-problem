public class Module {
    private String  name;
    private String semester;
    private String code;

    public Module(String name, String semester, String code){
        this.name = name;
        this.semester = semester;
        this.code = code;
    }

    public String GetName(){
        return name;
    }

    public String GetSemester(){
        return semester;
    }

    public String GetCode(){
        return code;
    }

}
