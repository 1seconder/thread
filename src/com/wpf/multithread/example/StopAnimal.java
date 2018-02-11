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
		an.stop();
	}
	
	public static void main(String[] args) {
		new Thread(){
			
		};
	}

	
}
