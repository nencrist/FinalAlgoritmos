package View;

import Model.Logic;
import processing.core.PApplet;

public class Main extends PApplet{
	Logic logic;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(800,800);
		
	}
	
	public void setup() {
		logic = new Logic(this);
		
	}
	
	public void draw() {
		background(255);
		logic.pintar();
		logic.boton();
	}
	
	public void mousePressed() {
		logic.mouse();
	}
	
}
