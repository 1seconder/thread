/**
 * @Title: MyThread.java
 * @Package com.wpf.thread
 * @Description: TODO(用一句话描述该文件做什么)
 * @author pengfei.wang
 * @date 2018年11月9日 下午2:21:45
 * @version V1.0
 */
package com.wpf.multithread.book;

/**
 * @ClassName: MyThread
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author pengfei.wang
 * @date 2018年11月9日 下午2:21:45
 */
public class MyThread extends Thread {

  private int amount = 5;

  /*
   * (非 Javadoc) <p>Title: run</p> <p>Description: </p>
   * @see java.lang.Thread#run()
   */
  @Override
  synchronized public void run() {
    super.run();
    amount--;
    System.out.println(Thread.currentThread().getName() + " amount = " + amount);
  }

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
    MyThread myThread1 = new MyThread();
    myThread1.start();
    MyThread myThread2 = new MyThread();
    myThread2.start();
    // Thread a = new Thread(myThread,"a");
    // Thread b = new Thread(myThread,"b");
    // Thread c = new Thread(myThread,"c");
    // Thread d = new Thread(myThread,"d");
    // Thread e = new Thread(myThread,"e");
    // Thread f = new Thread(myThread,"f");
    //
    // a.start();
    // b.start();
    // c.start();
    // d.start();
    // e.start();
    // f.start();

    System.out.println(Thread.currentThread().getName() + " 结束");

  }

}
