package Ex2;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public List<String> students = new ArrayList<>();
    public int max = 30;

    public List<String> getStudents() {
        return students; 
    }

    public void add(String name) {
        if(studenst.size()<max) 
                students.add(name); 
    }

    public void setMax(int m) {
        max = m; 
    }
}
