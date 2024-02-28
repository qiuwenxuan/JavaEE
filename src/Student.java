public class Student {
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }
}
