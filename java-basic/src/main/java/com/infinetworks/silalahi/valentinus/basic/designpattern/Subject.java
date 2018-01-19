/**
 * 
 */
package com.infinetworks.silalahi.valentinus.basic.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author valentinusilalahi
 *
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;

	public void add(Observer obs) {
		observers.add(obs);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		execute();
	}

	private void execute() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
