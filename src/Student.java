import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Student {
    private String name;
    private String studentNo;
    private ArrayList<Module> marks;

    public void addMark(Module mark){
        marks.add(mark);
    }

    public Student(String name, String studentNo){
        this.name = name;
        this.studentNo = studentNo;
        marks = new ArrayList<Module>();
    }

    public void Save() throws IOException {
        File f;
        PrintWriter pw = null;
        try{
           f = new File(studentNo + ".txt");
           pw = new PrintWriter(f);
            for (Module module: marks) {
                pw.println(module.GetCode());
            }
        }catch(Exception e){
            throw new IOException("File not found");
        }finally {
            pw.close();
        }
    }

    public void SaveModulesPassedInSemester(String semester) throws IOException{
        File f;
        PrintWriter pw = null;
        try{
            f = new File(studentNo + "-passedInSemester" + semester + ".txt");
            pw = new PrintWriter(f);
            for(Module module: marks){
                if(module.GetSemester().equals(semester)){
                    pw.println(module.GetName());
                }
            }
        }catch(Exception e){
            throw new IOException("File not found");
        }finally {
            pw.close();
        }
    }


}
