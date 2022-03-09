package question2;

public class Triangle extends Figure {

	public Triangle(int dim1, int dim2) {
		super(dim1, dim2);
		
	}

	@Override
	public double area() {
		return 1*2*this.getDim1()*this.getDim2();
	}

}
