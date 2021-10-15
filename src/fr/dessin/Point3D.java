package fr.dessin;

public class Point3D extends Point2D {
	
	int z;
	
	public Point3D() {
		super();
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// methode
	public void translater(int dX, int dY, int dZ) {
		super.translater(dX, dY);
		// ou 
		// this.translater(dX, dY);
		this.z += dZ;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + this.getX() + ", y=" + this.getY() + "]";
	}
}
