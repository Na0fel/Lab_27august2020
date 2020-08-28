public class Square implements MyShape{
   double L ;
	public double Area(double L){
		this.L=L;
		return L*L;
	}
	public double boundaryLength(double L){
		this.L=L;

		return 4*L;
	}

}
