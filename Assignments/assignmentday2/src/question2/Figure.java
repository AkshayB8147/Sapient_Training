package question2;

public abstract class Figure {
	private int dim1;
	private int dim2;

	public Figure(int dim1, int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}	
	
	public int getDim1() {
		return this.dim1;
	}
	public int getDim2() {
		return this.dim2;
	}
	
	abstract public double area();

}
