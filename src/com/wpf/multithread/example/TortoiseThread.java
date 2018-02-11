package com.wpf.multithread.example;

import com.wpf.multithread.inter.Animal;

public class TortoiseThread extends Animal {

	private String tName;

	public TortoiseThread(String name) {
		setName(name);
	}

	@Override
	public void running() {

		double dis = 0.1;
		length -= dis;

		if (length <= 0) {
			length = 0;
			System.out.println(tName + "  取得了胜利 ");

			if (null != callToBack) {
				callToBack.win();
			}

		}
		System.out.println(tName + "跑了   " + dis + " m ,距离终点还有   " + length + " m ");

		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

}
