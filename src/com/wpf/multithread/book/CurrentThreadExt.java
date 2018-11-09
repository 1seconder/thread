/**
 * @Title: CurrentThreadExt.java
 * @Package com.wpf.thread
 * @Description: TODO(用一句话描述该文件做什么)
 * @author pengfei.wang
 * @date 2018年11月9日 下午3:17:44
 * @version V1.0
 */
package com.wpf.multithread.book;

/**
 * @ClassName: CurrentThreadExt
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author pengfei.wang
 * @date 2018年11月9日 下午3:17:44
 */
public class CurrentThreadExt extends Thread {

  public CurrentThreadExt() {
    System.out.println("CurrentThreadExt begin ");
    System.out.println("Thread.currentThread().getsName() = " + Thread.currentThread().getName());
    System.out.println("this.getName() = " + this.getName());
    System.out.println("CurrentThreadExt end ");
  }

  /*
   * (非 Javadoc) <p>Title: run</p> <p>Description: </p>
   * @see java.lang.Thread#run()
   */
  @Override
  public void run() {
    super.run();
    System.out.println("run begin ");
    System.out.println("Thread.currentThread().getsName() = " + Thread.currentThread().getName());
    System.out.println("this.getName() = " + this.getName());
    System.out.println("run end ");
  }

  public static void main(String[] args) {
    CurrentThreadExt currentThreadExt = new CurrentThreadExt();
    Thread thread = new Thread(currentThreadExt, "A");
    thread.start();
  }
}
