package Foo;

public class Demo {

	public class Box 
	{
	  private int width,height,depth;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	public int volume()
	{
		int c;
		c=width*height*depth;
		 
		return c; 
	}
	  
	}
}
