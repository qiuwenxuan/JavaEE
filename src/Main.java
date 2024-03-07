public class Main {
    private static class People {
        public int age;
        public String name;

        public People() {

        }

        public People(int age) {
            this.age = age;
        }

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("name=" + name + " age=" + age);
        }

        public void show(String name, int age) {
            System.out.println("name=" + name + " age=" + age);
        }
    }

    @FunctionalInterface
    private interface GeneratePeople { //返回People的无参构造方法接口
        People generate();
    }

    @FunctionalInterface
    private interface GetValue {
        int getValue(People p);
    }

    @FunctionalInterface
    private interface SetValue {
        void setValue(People p, String name);
    }

    @FunctionalInterface
    private interface ShowTest {
        void show(People p);
    }

    @FunctionalInterface
    private interface ShowTest1 {
        void show(People p, String name, int age);
    }

    private static int y = 10;

    public static void main(String[] args) {
//        GetPeople1 p1 = () -> new People();
        GeneratePeople genteratePeople = People::new;
        People p = genteratePeople.generate();

//        SetValue setValue = (p1, name) -> p1.setName(name);
        SetValue setValue = People::setName;
        setValue.setValue(p, "wenxuan");

        p.setAge(10);
//        GetValue getValue = (p2) -> p2.getAge();
        GetValue getValue = People::getAge;
        int age = getValue.getValue(p);
        System.out.println(age);

//        Show show = (p3) -> p3.show();
        ShowTest show1 = People::show;
        show1.show(p);

//        ShowTest1 show2 = (p4, a, b) -> p4.show(a, b);
        ShowTest1 show2 = People::show;
        show2.show(p, "wenxuan", 18);

        int x = 10;
        LambdaTest lambdaTest = () -> {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        };
        y = 20;
    }

    interface LambdaTest {
        void test();
    }
}