import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Zoo zooyork = new Zoo();
        Bird bird1 = new Bird("Parrot", "blue");
        Bird bird2 = new Bird("Parrot", "red");
        Bird bird3 = new Bird("Bald Eagle", "blue");
        Bird bird4 = new Bird("Bald Eagle", "red");

        zooyork.addBird(bird1);
        zooyork.addBird(bird2);
        zooyork.addBird(bird3);
        zooyork.addBird(bird4);


        try{
            zooyork.Save("baldeagle.txt", "bald eagle");
            zooyork.SaveBlueBirds();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        File f;
        Scanner scanner = null;
        try{
            f = new File("bluebirds.txt");
            scanner = new Scanner(f);

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
