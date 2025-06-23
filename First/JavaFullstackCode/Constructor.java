package sveri;

public class Constructor 
{
	    double radius;
	    Constructor() {
	        this(5.0); 
	        System.out.println("Default Constructor Called: Radius = " + this.radius);
	    }

	    
	    Constructor(double radius) {
	        this.radius = radius; 
	        System.out.println("Parameterized Constructor Called: Radius = " + this.radius);
	    }

	    	Constructor(Constructor copy) {
	        this(copy.radius); 
	        System.out.println("Copy Constructor Called: Radius = " + this.radius);
	    }


	    double calculateArea() 
	    {
	        return Math.PI * this.radius * this.radius; 
	    }

	    double calculateCircumference() {
	        return 2 * Math.PI * this.radius;
	    }
	    void showDetails() {
	        System.out.println("Circle with Radius: " + this.radius);
	        System.out.println(" Area: " + this.calculateArea());
	        System.out.println(" Circumference: " + this.calculateCircumference());
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    
	        Constructor c1 = new Constructor();
	        c1.showDetails();
	       	Constructor c2 = new Constructor(7.0);
	        c2.showDetails();
	        Constructor c3 = new Constructor(c2);
	        c3.showDetails();
	    }
	}



