package Tetris;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	//private Matrix matrix;

	public KeyInput(Handler handler) {
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		for (int i = 0; i < handler.objects.size(); i++) {
			Shape tempObject = (Shape) handler.objects.get(i);

			if (key == KeyEvent.VK_LEFT) {

				if (Game.matrix.leftBounds()) {
					tempObject.moveLeft();
				}
				System.out.println(tempObject.cubits[0].getX());
				//System.out.println(Game.matrix.checkBounds());
			}
			if (key == KeyEvent.VK_RIGHT) {

				if (Game.matrix.rightBounds()) {
					tempObject.moveRight();
				}
				System.out.println(tempObject.cubits[3].getX());
				//System.out.println(Game.matrix.checkBounds());
			}
			if (key == KeyEvent.VK_SPACE) {
				Game.handler.removeAll();

			}

		}

		//System.out.println();
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}

}
