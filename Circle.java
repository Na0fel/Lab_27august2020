public class Circle implements MyShape{
   double R;
	public double Area(double R){
		this.R=R;
		return 3.1416*R*R;
	}
	public double boundaryLength(double R){
		this.R=R;

		return 2*3.1416*R;
	}

}
