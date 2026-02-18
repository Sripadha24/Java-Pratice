package SerialzableStudentData;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main implements Serializable {
    public static void main(String[] args) {
        StudentDataStore st= new StudentDataStore();
        List<Student> list = new ArrayList<>();
        list.add(new Student("John Doe", 1, 20));
        list.add(new Student("sripadha", 2, 21));
        list.add(new Student("kakani", 3, 22));

        st.savedata(list);
        System.out.println(st.loaddata());

    }
}
