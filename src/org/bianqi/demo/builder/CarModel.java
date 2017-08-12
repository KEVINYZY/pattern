package org.bianqi.demo.builder;

import java.util.ArrayList;

/**
 * 
 * <p>Title: CarModel</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2017年8月7日上午12:16:30
 * @version 1.0
 */
public abstract class CarModel {
	private ArrayList<String> sequence = new ArrayList<>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	final public void run() {
		for (int i = 0; i < this.sequence.size(); i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) { // 如果是start关键字，
				this.start(); // 开启汽车
			} else if (actionName.equalsIgnoreCase("stop")) { // 如果是stop关键字
				this.stop(); // 停止汽车
			} else if (actionName.equalsIgnoreCase("alarm")) { // 如果是alarm关键字
				this.alarm(); // 喇叭开始叫了
			} else if (actionName.equalsIgnoreCase("engine boom")) { // 如果是engine
				this.engineBoom(); // 引擎开始轰鸣
			}
		}
	}
	
	final public void setSquence(ArrayList<String> sequence){
		this.sequence = sequence;
	}
}










