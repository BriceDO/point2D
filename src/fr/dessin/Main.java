package fr.dessin;

public class Main {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(5, 10);
		System.out.println(p1);
		
		Point2D p2 = new Point2D(15, 20);
		System.out.println(p2);
		
		p1.translater(5, 5);
		System.out.println(p1);
		
		Point3D p3 = new Point3D(15, 5, 20);
		System.out.println(p3);
		
		System.out.println(Point2D.getCompteur());
		
		p3.translater(10, 15, 2);
		;

	}

}
