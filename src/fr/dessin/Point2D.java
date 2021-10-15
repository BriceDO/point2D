package fr.dessin;

public class Point2D {

	private static int compteur;
	private int x, y;
	
	// Constructeurs
	public Point2D() {
		compteur++;
	}

	public Point2D(int x, int y) {
		this();
		this.x = x;
		this.y = y;
	}
	
	
	// Méthode translater()
	public void translater(int dX, int dY) {
		this.x += dX;
		this.y += dY;
	}
	
	// Méthode getCompteur() static
	public static int getCompteur(){
		return compteur;
	}
	
	// Guetters & Setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
}