package com.wpf.multithread.example;

import com.wpf.multithread.inter.Animal;

public class TortoiseThread extends Animal {

	private String tName;

	public TortoiseThread(String name) {
		this.tName = name;
		setName(name);
	}

	@Override
	public void running() {

		double dis = 5;
		length -= dis;
		System.out.println(tName + "����   " + dis + " m ,�����յ㻹��   " + length + " m ");
		if (length <= 0) {

			length = 0;
			System.out.println(tName + "  ȡ����ʤ�� ");

			if (null != callToBack) {
				callToBack.win();
			}

		}

		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// e.printStackTrace();
			return;
		}

	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

}
