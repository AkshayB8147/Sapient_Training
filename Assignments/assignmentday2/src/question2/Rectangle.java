package question2;

public class Rectangle extends Figure {

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
	}

	@Override
	public double area() {		
		return this.getDim1()*this.getDim2();
	}

}
