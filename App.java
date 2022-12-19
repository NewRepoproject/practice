package second;

public class App {
		public static void main(String[] args) {
	
			
			Course c;
			c=new Course("Arun",1,"Java",4000,4);
			meth(c);
			dis(c);
			System.out.println("final duration of course: "+c.Calduration(1));
			c=new CrashCourse("Arun",1,"Java",4000,4,2000,2);
			meth(c);
			dis(c);
			
			
		}
	public static void meth(Course c)
			{
				System.out.println(c);
				double t=c.Calduration();
				if(c instanceof CrashCourse)
					System.out.println("Crash Course duration: "+((CrashCourse)c).Calduration());
				else
				{
					System.out.println("Total duration is: "+t);
				}
			}
	
	public static void dis(Course c)
	{
		System.out.println(c);
		double t=c.TotalFees();
		if(c instanceof CrashCourse)
			System.out.println("Total fess of CrashCourse:"+((CrashCourse)c).TotalFees());
		else
		{
			System.out.println("Total fees of course:"+t);
		}
	}
	}


