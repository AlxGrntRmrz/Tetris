package Tetris;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape extends GameObject {
	
	protected Cubit[] cubits;
	protected int size = Game.WIDTH/10;
	protected Color color;
	public Shape() {
		
	}
	
	public void moveLeft() {
		for(int i = 0; i < cubits.length; i++) {
			GameObject tempObject = cubits[i];
			tempObject.setX((tempObject.getX() - 1));
		}
	}
	
	public void moveRight() {
		for(int i = 0; i < cubits.length; i++) {
			GameObject tempObject = cubits[i];
			tempObject.setX((tempObject.getX() + 1));
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < cubits.length; i++) {
			GameObject tempObject = cubits[i];
			tempObject.render(g);
		}		
	}
	
	public void tick() {
		for(int i = 0; i < cubits.length; i++) {
			GameObject tempObject = cubits[i];
			tempObject.tick();
		}
	}
	
	
}
