
public class Course  
	{
		String courseId,courseName;
		int duration;
		
		public Course(String courseId,String courseName,int duration)
		{
			this.courseId=courseId;
			this.courseName=courseName;
			this.duration=duration;
		}
		
		public void displayCourse()
		{
			System.out.println("Course ID:"+courseId);
			System.out.println("Course Name:"+courseName);
			System.out.println("Course Duration:"+duration);
		}
	
}
