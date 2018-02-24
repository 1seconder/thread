package com.wpf.multithread.example;

import com.wpf.multithread.inter.Animal;

public class RabbitThread extends Animal {

	private String tName;

	public RabbitThread(String name) {
		this.tName = name;
		setName(name);
	}

	@Override
	public void running() {

		double dis = 5;
		length -= dis;
		System.err.println(tName + "����   " + dis + " m ,�����յ㻹��   " + length + " m ");
		if (length <= 0) {
			length = 0;
			System.err.println(tName + "  �����ʤ�� ");

			if (null != callToBack) {
				callToBack.win();
			}
		}

		if (length % 2 == 0) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// e.printStackTrace();
				return;
			}
		}

	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

}
