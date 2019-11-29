package Model;

import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private PApplet app;
	private ArrayList <Personaje> objectArrayList;
	private Personaje [] objectArray;
	private PImage objectOne;
	private PImage objectTwo;
	private int age, luckyNumber;
	private int boton;
	private SortByLuckyNumber sortByLuckyNumber;
	
	public Logic(PApplet app) {
		this.app = app;
		objectArrayList = new ArrayList <Personaje>();
		objectOne = app.loadImage("../data/bart.png");
		objectTwo = app.loadImage("../data/homero.png");
		age = (int) app.random(1,10);
		luckyNumber = (int) app.random(1,20);
		
	}
	
	public void pintar() {
		for (int i = 0; i < objectArrayList.size(); i++) {
			Personaje temp = objectArrayList.get(i);
			temp.pintarObjectOne();
		}
		
	}
	
	public void boton(){
		app.fill(0);
		app.rect(400,700,100,50);
		app.fill(255);
		app.text("crear",410,720);
		app.fill(0);
		app.rect(50,700,80,50);
		app.fill(255);
		app.text("age",60,720);
		app.fill(0);
		app.rect(150,700,80,50);
		app.fill(255);
		app.text("lucky",160,720);
		
	}
	
	public void mouse() {
		if(app.mouseX > 400 && app.mouseX < 500 && app.mouseY > 700 && app.mouseY < 750) {
			Personaje temp = new Personaje(app, objectOne, age, luckyNumber);
			temp.start();
			objectArrayList.add(temp);
		}
		if(app.mouseX > 50 && app.mouseX < 130 && app.mouseY > 700 && app.mouseY < 750) {
			sortByAge();
		}
		if(app.mouseX > 150 && app.mouseX < 230 && app.mouseY > 700 && app.mouseY < 750) {
			sortByLuckyNumber();
		}
		
	}
	
	public void sortByAge() {
		Collections.sort(objectArrayList);
	}
	
	public void sortByLuckyNumber() {
		Collections.sort(objectArrayList, sortByLuckyNumber);
	}
	
	//excepcion
	public void theException() throws MyException {
		if(objectArray.length > 4) {
			throw new MyException ("no se pueden hacer mas");
		}
	}
	

}
