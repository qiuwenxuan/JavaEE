class A {
    private String msg;

    public A(String msg) {
        // 子类无参构造方法
        System.out.println("这是父类的带参构造方法...");
    }
}

class B extends A {
    public B() {
        super("hello");
        System.out.println("这是子类的无参构造方法...");
    }
}
