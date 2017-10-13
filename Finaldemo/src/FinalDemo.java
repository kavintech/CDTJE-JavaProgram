
public final class FinalDemo 
	{
		final double PI;
		
		public FinalDemo()
		{
			PI=3.141;
		}
		
		public final double calcCircleArea(double radius)
		{
			double area;
			area=PI*radius*radius;
			return area;
		}
	}


	