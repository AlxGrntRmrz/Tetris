package Tetris;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x, y;
	// protected ID id;

	protected int width;

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public GameObject() {
		
	}

	public void checkBounds(GameObject object) {
		if (object.x < 0) {
			object.x = 0;
		}
		if (object.x + object.width > 200) {
			object.x = 200 - object.width;
		}
	}

	public void moveLeft() { 
		
	}
	
	public void moveRight() {
		
	}
	// Move shape down
	public void tick() {
		//y += 1;
	}

	// Display shape
	public abstract void render(Graphics g);

	// Set x and y position
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// Get x and y position
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
