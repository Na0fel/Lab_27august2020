public class Triangle implements MyShape{
   double W ;
	public double Area(double W){
		this.W=W;
		return ((Math.sqrt(3))/2)*W*W;
	}
	public double boundaryLength(double W){
		this.W=W;

		return 3*W;
	}

}
