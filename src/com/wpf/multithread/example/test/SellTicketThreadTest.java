package com.wpf.multithread.example.test;

import com.wpf.multithread.example.SellTicketThread;

public class SellTicketThreadTest {

	public static void main(String[] args) {
		int threadCount = 3;
		for (int i = 0; i < threadCount; i++) {
			SellTicketThread st = new SellTicketThread("ÊÛÆ±´°¿Ú " + i);
			new Thread(st).start();
		}
	}
}
