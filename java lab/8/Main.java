public class Main {
  public static void main(String[] args) {
    Thread evenThread = new Thread(new EvenNumberPrinter(),"one");
    Thread oddThread = new Thread(new OddNumberPrinter(),"Two");

    evenThread.start();
    oddThread.start();
  }
}

class EvenNumberPrinter implements Runnable {
  @Override
  public void run() {
    for (int i = 2; i <= 20; i += 2) {
      System.out.println(Thread.currentThread().getName()+"--"+ i);
      try {
        Thread.sleep(700);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class OddNumberPrinter implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 20; i += 2) {
        System.out.println(Thread.currentThread().getName()+"--"+ i);
      try {
        Thread.sleep(700);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
