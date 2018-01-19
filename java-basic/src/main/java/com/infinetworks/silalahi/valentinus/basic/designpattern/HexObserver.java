/**
 * 
 */
package com.infinetworks.silalahi.valentinus.basic.designpattern;

/**
 * @author valentinusilalahi
 *
 */
public class HexObserver extends Observer {
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toHexString(subject.getState()));
	}
}
