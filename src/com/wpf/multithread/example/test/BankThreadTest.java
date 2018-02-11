package com.wpf.multithread.example.test;

import com.wpf.multithread.example.BankThread;

public class BankThreadTest {

	public static void main(String[] args) {
		int count = 5;

		for (int i = 0; i < count; i++) {
			BankThread bt = new BankThread("用户 " + i, "save");
			new Thread(bt).start();
		}

		for (int i = 10; i < count + 10; i++) {
			BankThread bt = new BankThread("用户 " + i, "draw");
			new Thread(bt).start();
		}

	}
}
