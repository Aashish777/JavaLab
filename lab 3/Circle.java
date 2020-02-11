// Multiple inheritence 

interface drawable
{
	 public void draw();

}

class Circle implements drawable{
	public void draw()
	{
	  System.out.println("Draw Circle");
	}
}

class interface1{
	public static void main(String[] args)
	{
		Circle d= new Circle();
		d.draw();
	}
}