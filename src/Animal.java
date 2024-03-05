interface Jumpping { // 定义接口Jumpping
    void jump();
}

class Dog extends Animal implements Jumpping {

    @Override
    public void jump() { // 实现接口的jump方法
        System.out.println("Dog is jumpping...");
    }
}


public class Animal {
    public void eat() {
        System.out.println("Animal eat foods");
    }

}

class JumpOperate { // jump操作类
    public void method(Jumpping j) { // 多态的方式，传入Jumpping接口类型
        j.jump();
    }
}

class AnimalMain {
    public static void main(String[] args) {
        JumpOperate ao = new JumpOperate();

        Jumpping dog = new Dog(); // 使用多态的方式向上转型，创建Jumpping接口的实例
        ao.method(dog);
        dog.jump();

        System.out.println("----------------采用匿名内部类后---------------");
        ao.method(new Jumpping() { // 将匿名类对象作为参数传入到JumpOperate的method()方法内

            @Override
            public void jump() {
                System.out.println("Dog is Jumpping...");
            }
        }); // 类似于Jumpping dog = new Dog(); JumpOperate ao = new JumpOperate(); ao.method(dog);
        new Jumpping() {
            @Override
            public void jump() {
                System.out.println("Dog is Jumpping...");
            }
        }.jump(); // 匿名类调用类对象的jump()方法,类似于Jumpping dog = new Dog(); dog.jump();
    }
}

