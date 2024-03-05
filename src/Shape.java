class Fa {
    public void method() {
        System.out.println("我是父类的方法");
    }
}

class Demo {
    public static void main(String[] args) {
        Fa f = new Fa() {
            @Override
            public void method() {
                System.out.println("我是子类的方法");
            }
        };
        f.method();
    }
}