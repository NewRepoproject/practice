package second;

public class CrashCourse extends Course{

	private double discount;
	private  int Crashduration;
		
		public CrashCourse() {
			
		}

		public CrashCourse(String studentname, int rollno, String courseName, double fees, int duration,double discount, int Crashduration) 
		{
			super(studentname, rollno, courseName, fees, duration);
			this.discount=discount;
			this.Crashduration=Crashduration;
		}
		
		
		public double getdiscount() {
			return discount;
		}



		public void setdiscount(double discount) {
			this.discount = discount;
		}



		public int getCrashduration() {
			return Crashduration;
		}



		public void setCrashduration(int crashduration) {
			this.Crashduration = crashduration;
		}



		@Override
		public String toString()
		{
			return super.toString()+", Discount:"+this.discount+", Crashduration:"+this.Crashduration;
		}
		@Override
		public double TotalFees()
		{
			return super.TotalFees()-(this.discount);
		}
		
		@Override
		public int Calduration()
		{
			return super.Calduration()+(this.Crashduration);
		}
}