import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student douglas = new Student("Douglas", "219015686");
        douglas.addMark(99);
        douglas.addMark(89);
        douglas.addMark(79);
        try{
            douglas.Save();
            douglas.SaveLowest();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        File file;
        Scanner scanner = null;
        try{
            file = new File("Douglas-lowestMark.txt");
            scanner = new Scanner(file);

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
