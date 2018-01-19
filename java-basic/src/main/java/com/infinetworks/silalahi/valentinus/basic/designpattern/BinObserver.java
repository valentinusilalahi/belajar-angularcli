/**
 * 
 */
package com.infinetworks.silalahi.valentinus.basic.designpattern;

/**
 * @author valentinusilalahi
 *
 */
public class BinObserver extends Observer {
	public BinObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toBinaryString(subject.getState()));
	}
}
