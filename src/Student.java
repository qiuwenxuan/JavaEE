public class Student extends Person {
    private String school;

    public Student() {
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    @Override
    public void showInfo() {
        System.out.println("name:" + getName() + " age:" + getAge() + " school:" + getSchool());
    }
}
