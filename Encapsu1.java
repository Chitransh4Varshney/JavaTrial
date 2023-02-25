package Encapsulation;

class Student {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}

public class Encapsu1 {
    public static void main(String[] args) {

        Student st = new Student();
        st.setAge(20);
        st.setName("Chitransh");
        System.out.println(st.getAge());
        System.out.println(st.getName());

    }

}
