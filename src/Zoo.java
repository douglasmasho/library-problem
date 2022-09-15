import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Bird> birds;

    public Zoo(){
        birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird){
        birds.add(bird);
    }

    public void Save(String filename, String name) throws IOException {
        File f;
        PrintWriter pw = null;
        try{
          f = new File(filename);
          pw = new PrintWriter(f);

          for(Bird bird: birds){
              if(bird.GetName().toLowerCase().equals(name.toLowerCase())){
                  pw.println(bird.GetName() + " " + bird.GetColor());
              }
          }
        }catch(Exception e){
            throw new IOException(e);
        }finally {
            pw.close();
        }
    }

    public void SaveBlueBirds() throws IOException{
        File f;
        PrintWriter pw = null;
        try{
           f = new File("bluebirds.txt");
           pw = new PrintWriter(f);
           for(Bird bird: birds){
               if(bird.GetColor().toLowerCase().equals("blue")){
                   pw.println(bird.GetName() + " " + bird.GetColor());
               }
           }
        }catch(Exception e){
            throw new IOException("File not found");
        }finally {
            pw.close();
        }
    }
}
