package jvm.mainthread;

public class MainThreadDemo {
  public static void main(String[] args) {
    Thread.currentThread().setName("Main1 Called");
  }
}

class MainThreadDemo2 {
  public static void main(String[] args) {
    Thread.currentThread().setName("Main2 Called");
  }
}

class MainThreadDemo3 {
  public static void main(String[] args) {
    MainThreadDemo m1 = new MainThreadDemo();
    m1.main(null);
    System.out.println(Thread.currentThread().getName());
    MainThreadDemo2 m2 = new MainThreadDemo2();
    m2.main(null);
    System.out.println(Thread.currentThread().getName());
  }
}
