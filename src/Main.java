import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student douglas = new Student("Douglas", "219015686");
        Module module1 = new Module("Object Oriented Programming 2", "2022-2", "COS3612");
        Module module2 = new Module("Computer Organization and Architecture", "2022-2", "CIT3652");
        Module module3 = new Module("Computer networks 2", "2022-2", "CIT3612");
        Module module4 = new Module("Advanced databases", "2022-2", "COS3632");
        Module module5 = new Module("Object Oriented Programming 1", "2022-1", "COS3611");
        Module module6 = new Module("Maths for Computer Science", "2022-1", "CMP3651");
        Module module7 = new Module("Computer networks 1", "2022-1", "CIT3611");
        Module module8 = new Module("Introduction to Database Systems", "2022-1", "CMP3611");

        douglas.addMark(module1);
        douglas.addMark(module2);
        douglas.addMark(module3);
        douglas.addMark(module4);
        douglas.addMark(module5);
        douglas.addMark(module6);
        douglas.addMark(module7);
        douglas.addMark(module8);

        try{
            douglas.Save();
            douglas.SaveModulesPassedInSemester("2022-2");
            douglas.SaveModulesPassedInSemester("2022-1");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        File f;
        Scanner scanner = null;
        try{
            f = new File("219015686-passedInSemester2022-1.txt");
            scanner = new Scanner(f);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
