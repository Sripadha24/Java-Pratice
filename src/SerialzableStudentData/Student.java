package SerialzableStudentData;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int rollno;
    private double cgpa;
    public Student(String name,int rollno,double cgpa){
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", cgpa=" + cgpa +
                '}';
    }
}
