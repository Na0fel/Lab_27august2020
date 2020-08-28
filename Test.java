import java.lang.Math;
import java.util.Scanner;

public class Test{

	public static void main(String args[]){
	System.out.println(" ");

	Scanner sc = new Scanner(System.in);

	System.out.println("Press 1 For Square\nPress 2 For Circle\nPress 3 For Triangle  ");
	System.out.println(" ");
	System.out.print("Your requested number is : ");
	int A = sc.nextInt();

	Square obj1 = new Square();
  Circle obj2 = new Circle();
	Triangle obj3 = new Triangle();

	if(A==1){
  System.out.print("Enter the length of square : ");
  double square = sc.nextDouble();
  System.out.println("The area of the square is : " +obj1.Area(square));
  System.out.println("The boundary length of the square is : " +obj1.boundaryLength(square));
		}



	else if(A==2){

    System.out.print("Enter the redius of circle : ");
		double circle = sc.nextDouble();
		System.out.println("The area of the circle is : " +obj2.Area(circle));
		System.out.println("The boundary length of the circle is : " +obj2.boundaryLength(circle));

		}

	else if(A==3){
		System.out.print("Enter the side of triangle : ");
		double triangle = sc.nextDouble();
		System.out.println("The area of the Triangle is : " +obj3.Area(triangle));
		System.out.println("The boundary length of the Triangle is : " +obj3.boundaryLength(triangle));

		}

	else{
		System.out.println("Invalid Choice");
		}

	}


}
