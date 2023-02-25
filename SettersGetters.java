package Encapsulation;

class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class SettersGetters {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(18);
        obj1.setAge(20);
        obj.setName("Navin");
        obj1.setName("Kiran");
        int Stud1Age = obj.getAge();
        System.out.println(Stud1Age);

    }

}
