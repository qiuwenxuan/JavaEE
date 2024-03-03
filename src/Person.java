public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.println("name:" + getName() + " age:" + getAge());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person pr = (Person) obj;
        return this.name.equals(pr.name) && this.age == pr.age;
    }

//    @Override
//    public String toString() {
//        return "[ name= " + this.name + ", age = " + this.age + "]";
//    }


    @Override
    public String toString() {
        return super.toString();
    }
}