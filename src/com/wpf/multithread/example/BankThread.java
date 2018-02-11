package com.wpf.multithread.example;

public class BankThread implements Runnable {

	private static int bankMoney = 10000;

	private String key = "key";
	private String name;
	private String type;

	public BankThread(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public void run() {

		while (bankMoney > 0 && bankMoney < 20000) {
			synchronized (key) {
				int count = (int) (Math.random() * 100);
				if (type.equals("save")) {
					int counts = bankMoney + count;
					if (counts < 20000) {
						bankMoney += count;
						System.out.println(name + "  存进账户  ：  " + count + "元, 账户总额  ： " + bankMoney + "元");
					} else {
						System.err.println("超过20000不能存了");
					}

				} else if (type.equals("draw")) {
					int counts = bankMoney - count;
					if (counts > 0) {
						bankMoney -= count;
						System.out.println(name + "  取出账户  ：  " + count + "元, 账户总额  ： " + bankMoney + "元");
					} else {
						System.err.println("账户余额不足不能取了");
					}
				}
			}
		}

	}

}
