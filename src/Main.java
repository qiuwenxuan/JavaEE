//举例:
interface Inter {
    void show();
}//定义一个接口

class Outer {
    public void method() {
        Inter i = new Inter() { //由于匿名内部类继承了接口Inter,采用多态的方法将匿名类向上转型成Inter接口类型的对象,通过对象名调用内部类方法
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();//通过对象名调用内部类方法
    }
}