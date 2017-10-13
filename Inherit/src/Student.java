
public class Student  
	{
		String studentId,studentName;
		Course course;
		
		public Student(String studentId,String studentName,String courseId,String courseName,int duration)
		{
			this.studentId=studentId;
			this.studentName=studentName;
			course=new Course(courseId,courseName,duration);
		}
		public void displayStudentDetail()
		{
			System.out.println("Student ID:"+studentId);
			System.out.println("Student Name:"+studentName);
			course.displayCourse();
		}
	}

