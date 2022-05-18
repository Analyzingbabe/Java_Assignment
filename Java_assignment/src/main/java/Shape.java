

	public interface Shape {
		
		public static final int a=4;
		public static final int b=2;
		public abstract double printArea();
		
		public static void main(String[] arg) {
			
			
			//rectangle object
				Shape arect=new Rectangle(); //polymorphism
				double rectanglearea=arect.printArea();
				System.out.println("Area of rectangle is: "+rectanglearea);
			//triangle object
				Shape atriangle=new Triangle(); //polymorphism
				double trianglearea=atriangle.printArea();
				System.out.println("Area of triangle is: "+trianglearea);
				
			//circle object
				Shape acircle=new Circle(); //polymorphism
				double circlearea=acircle.printArea();
				System.out.println("Area of circle is: "+circlearea);
				
	}
	}


