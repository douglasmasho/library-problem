import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentNo;
    private ArrayList<Integer> marks;

    public void addMark(int mark){
        marks.add(mark);
    }
    public Student(String name, String studentNo){
        this.name = name;
        this.studentNo = studentNo;
        marks = new ArrayList<Integer>();
    }

    public void Save() throws IOException {
        File f;
        PrintWriter pw = null;
        try{
            f = new File(name + ".txt");
            pw = new PrintWriter(f);
            for(int i = 0; i < marks.size(); i++){
                pw.println(marks.get(i).toString());
            }
        }catch(Exception e){
            throw new IOException("File does not exist");
        }finally {
            pw.close();
        }
    }

    public void SaveLowest() throws IOException{
        File f;
        PrintWriter pw = null;
        try{
            f = new File(name + "-" + "lowestMark.txt");
            pw = new PrintWriter(f);
            double lowestMark = Double.POSITIVE_INFINITY;
            for (int mark: marks) {
                if(mark < lowestMark){
                    lowestMark = mark;
                }
            }
            pw.println(lowestMark);
        }catch(Exception e){
            throw new IOException("File not found");
        }finally{
            pw.close();
        }
    }

}
