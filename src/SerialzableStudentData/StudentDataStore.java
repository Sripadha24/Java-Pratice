package SerialzableStudentData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataStore implements Serializable {
    public void savedata(List<Student> list){
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Students.ser"));
            os.writeObject(list);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public List<Student> loaddata(){
        List<Student> student = new ArrayList<>();
        try{
            ObjectInputStream is= new ObjectInputStream(new FileInputStream("Students.ser"));
            student = (List<Student>) is.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return student;

    }
}
