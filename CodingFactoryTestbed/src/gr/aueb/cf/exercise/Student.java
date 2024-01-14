package gr.aueb.cf.exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        try {
            Class<Student> cl = Student.class;
            Constructor<Student> constructor = cl.getConstructor(int.class, String.class,String.class);
            Student s1 = constructor.newInstance(1, "Alekos", "Alkadris");

            System.out.println(s1);

        } catch (NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
