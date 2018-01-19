/**
 * 
 */
package com.infinetworks.silalahi.valentinus.basic.designpattern;

/**
 * @author valentinusilalahi
 *
 */
public class OctObserver extends Observer {
	public OctObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	public void update() {
		System.out.print(" " + Integer.toOctalString(subject.getState()));
	}
}
