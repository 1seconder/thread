package com.wpf.multithread.example.test;

import com.wpf.multithread.example.RabbitThread;
import com.wpf.multithread.example.StopAnimal;
import com.wpf.multithread.example.TortoiseThread;

public class TortoiseRabbitTest {
	public static void main(String[] args) {

		TortoiseThread tth = new TortoiseThread("ÎÚ¹ê");
		RabbitThread rth = new RabbitThread("ÍÃ×Ó");

		StopAnimal stop1 = new StopAnimal(tth);
		rth.callToBack = stop1;

		StopAnimal stop2 = new StopAnimal(rth);
		tth.callToBack = stop2;

		rth.start();
		tth.start();
	}
}
