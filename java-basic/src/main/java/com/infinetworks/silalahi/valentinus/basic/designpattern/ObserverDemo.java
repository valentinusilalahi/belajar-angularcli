/**
 * 
 */
package com.infinetworks.silalahi.valentinus.basic.designpattern;

import java.util.Scanner;

/**
 * @author valentinusilalahi
 *
 */
public class ObserverDemo {
	public static void main(String[] args) {
		Subject sub = new Subject();
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}
	}
}
