package com.wpf.multithread.example;

import com.wpf.multithread.inter.Animal;
import com.wpf.multithread.inter.Animal.CallToBack;

public class StopAnimal implements CallToBack {

	Animal an;

	public StopAnimal(Animal an) {
		this.an = an;
	}

	@Override
	public void win() {
		// new Timer().schedule(new TimerTask() {
		//
		// @Override
		// public void run() {
				an.flag = false;
				System.out.println(an.getName() + "  stopping ...");
//			}
//		}, 0);
	}

}
