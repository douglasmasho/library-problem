public class Bird {
    private String name;
    private String color;

    public Bird(String n, String c){
        name = n;
        color = c;
    }

    public String GetName(){
        return name.toLowerCase();
    }

    public String GetColor(){
        return color;
    }

}
