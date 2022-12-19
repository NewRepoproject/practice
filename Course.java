package second;

public class Course {
	
		private String studentname;
		private int rollno;
		private String courseName;
		private int duration;
		private double fees;
		
		public Course()
		{
			
		}
		public Course(String studentname, int rollno, String courseName, double fees, int duration) {
			this.studentname = studentname;
			this.rollno = rollno;
			this.courseName = courseName;
			this.duration=duration;
			this.fees=fees;
		}


		public String getStudentname() {
			return studentname;
		}

		public void setStudentname(String studentname) {
			this.studentname = studentname;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public int getDuration() {
			return duration;
		}

		public void setDuration(int duration) {
			this.duration = duration;
		}
		
		public double getFees() {
			return fees;
		}

		public void setFees(double fees) {
			this.fees= fees;
		}

		public double TotalFees()
		{
//			System.out.println(" fees of Course");
			return this.fees;
		}
		//function overloading  - static/compile time polymorphism
		public double TotalFees(double discount)
		{	
			return (this.fees)-discount;
		}
		
		public int Calduration()
		{

			return this.duration;
		}
		
		public int Calduration(int noofday) {

			return (this.duration)+noofday;
			
		}
		
		@Override
		public String toString() {
			System.out.println("Course");
			return "student details[" +"Student name:" +this.studentname+", Roll no:"+this.rollno+",Course name:"+this.courseName+", Duration:"+this.duration+"hr/day,Fees:"+this.fees+"Rs"+"]";  
					
		}	
		
		
		
		
}
