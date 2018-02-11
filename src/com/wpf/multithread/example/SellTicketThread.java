package com.wpf.multithread.example;

public class SellTicketThread implements Runnable {

	private static int ticketCount = 200;

	private String name;

	private String key = "key";

	public SellTicketThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// synchronized (key) { //����������� ѭ���� ��ô��һ���߳��õ���֮�� ��һֱѭ����
		while (ticketCount > 0) {
			synchronized (key) {
				int millis = (int) (Math.random() * 10);
				if (ticketCount > 0) {
					ticketCount--;
					System.err.println(name + "  �۳�һ��  ����ʣ   " + ticketCount + "  ��Ʊ,  ��Ϣ  " + millis + " ms");
				} else {
					System.err.println("Ʊ������");
				}

				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
