package Ex2;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public List<String> students = new ArrayList<>();
    public int max = 30;

    public List<String> getStudents() {
        return students; // exposes internal list
    }

    public void add(String name) {
        students.add(name); // no validation
    }

    public void setMax(int m) {
        max = m; // can set to negative or lower than current size
    }
}