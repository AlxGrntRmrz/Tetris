package Tetris;

public class Matrix {
	private int[][] matrix = new int[20][10];
	// static LinkedList<GameObject> objects = new LinkedList<GameObject>();
	private int[] currentX = new int[4];
	private int[] currentY = new int[4];

	// private Handler handler;

	public void addShape(Shape tetronimo) {
		for (int i = 0; i < tetronimo.cubits.length; i++) {
			GameObject cubit = tetronimo.cubits[i];
			int x = cubit.getX();
			int y = cubit.getY();
			matrix[y][x] = 1;
			currentX[i] = x;
			currentY[i] = y;
		}

	}

	public void tick() {
		for (int i = 0; i < currentX.length; i++) {
			matrix[currentY[i]][currentX[i]] = 0;
		}
		for (int i = 0; i < Game.handler.objects.size(); i++) {
			Shape tempObject = (Shape) Game.handler.objects.get(i);
			for (int j = 0; j < tempObject.cubits.length; j++) {
				GameObject cubit = tempObject.cubits[i];
				int x = cubit.getX();
				int y = cubit.getY();
				matrix[y][x] = 1;
				currentX[i] = x;
				currentY[i] = y;
			}

		}
	}

	public boolean leftBounds() {
		Shape tempObject = (Shape) Game.handler.objects.get(0);
		GameObject cubit1 = tempObject.cubits[0];

		System.out.println("Cubit1 x " + cubit1.getX());

		if (cubit1.getX() - 1 < 0) {
			return false;
		}
		return true;
	}

	public boolean rightBounds() {
		Shape tempObject = (Shape) Game.handler.objects.get(0);

		GameObject cubit4 = tempObject.cubits[3];

		System.out.println("Cubit4 x " + cubit4.getX());
		if (cubit4.getX() + 1 > 9) {
			return false;
		} else {
			return true;
		}
	}

}
