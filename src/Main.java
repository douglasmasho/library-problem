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
            zooyork.Save("parrots.txt", "parrot");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
