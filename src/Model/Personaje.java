package Model;

import processing.core.PApplet;
import processing.core.PImage;

public class Personaje extends Thread implements Comparable <Personaje>{
	private PApplet pro;
	private int posX;
	private int age;
	private int luckyNumber;
	private PImage image;
	private boolean move;
	
	public Personaje(PApplet pro, PImage image, int age, int luckyNumber) {
		this.pro = pro;
		this.age = age;
		this.luckyNumber = luckyNumber;
		this.image = image;
		this.posX = 100;
		move = true;
	}
	
	public void run() {
		while (true) {
			mover();
			try {
				sleep(10);
			} catch (Exception e) {
			}
		}
	}
	
	public void pintarObjectOne() {
		pro.image(image, posX, 100, 70,70);
	}
	
	public void pintarObjectTwo() {
		pro.image(image,50,50);
	}

	public void mover() {
		if(move) {
			posX++;
			if(posX >710) {
				posX --;
			}
		}
	}
	
	
	
	
	public int compareTo(Personaje arg0) {
		
		return age - arg0.getAge();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLuckyNumber() {
		return luckyNumber;
	}

	public void setLuckyNumber(int luckyNumber) {
		this.luckyNumber = luckyNumber;
	}

	

}
