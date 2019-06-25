package Shapes;

import java.awt.Color;
import java.awt.Graphics;

import Tetris.Cubit;
import Tetris.GameObject;
import Tetris.Shape;
// ==
// == shape
public class O extends Shape {

	
	public O() {
		color = Color.BLUE;
		cubits = new Cubit[]{new Cubit(4,0, color), new Cubit(5, 0, color), new Cubit(4, 1, color), new Cubit(5, 1, color)};
	}
		

	
	
}
