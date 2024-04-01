import java.util.*;

class Student {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
public class SetterGetter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Manish Gautam");
        s.setAddress("Nepal");
        s.setAge(20);
        System.out.println("Name "+s.getName());
        System.out.println("Address "+ s.getAddress()); 
        System.out.println("Age "+ s.getAge());
    }
}
