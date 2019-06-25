package Tetris;

import java.awt.Color;
import java.awt.Graphics;

public class Cubit extends GameObject {
	Color color;
	int size = Game.WIDTH/10;
	public Cubit(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x*size, y*size, size, size);
	}

}
