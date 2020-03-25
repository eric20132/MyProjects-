package finalproject;

public class where {

	public double[] school(int num) 
	{
		int people=100;//preinstall 100 people
		double rent=1;//SchoolStudent=1,SchoolElderly=1,SchoolChild=1;
		double clientStyle[];//SchoolOffice=1,SchoolWorker=1,SchoolRichman=1;
		clientStyle = new double[10];		
		clientStyle[0] = people*(0.5);//student
		clientStyle[1] = people*(0.15);//elderly
		clientStyle[2] = people*(0.1);//child
		clientStyle[3] = people*(0.15);//officeworker
		clientStyle[4] = people*(0.05);//worker
		clientStyle[5] = people*(0.05);//richman
		return clientStyle;
	} 
	
	public double[] hospital(int num) 
	{
		int people=100;//preinstall 100 people
		double rent=1;//SchoolStudent=1,SchoolElderly=1,SchoolChild=1;
		double clientStyle[];//SchoolOffice=1,SchoolWorker=1,SchoolRichman=1;
		clientStyle = new double[10];		
		clientStyle[0] = people*(0.05);//student
		clientStyle[1] = people*(0.4);//elderly
		clientStyle[2] = people*(0.05);//child
		clientStyle[3] = people*(0.25);//officeworker
		clientStyle[4] = people*(0.15);//worker
		clientStyle[5] = people*(0.1);//richman
		return clientStyle;
	} 
	
	public double[] contury(int num) 
	{
		int people=100;//preinstall 100 people
		double rent=1;//SchoolStudent=1,SchoolElderly=1,SchoolChild=1;
		double clientStyle[];//SchoolOffice=1,SchoolWorker=1,SchoolRichman=1;
		clientStyle = new double[10];		
		clientStyle[0] = people*(0.1);//student
		clientStyle[1] = people*(0.5);//elderly
		clientStyle[2] = people*(0.05);//child
		clientStyle[3] = people*(0.1);//officeworker
		clientStyle[4] = people*(0.2);//worker
		clientStyle[5] = people*(0.05);//richman
		return clientStyle;
	} 
	
	public double[] trainStation(int num) 
	{
		int people=100;//preinstall 100 people
		double rent=1;//SchoolStudent=1,SchoolElderly=1,SchoolChild=1;
		double clientStyle[];//SchoolOffice=1,SchoolWorker=1,SchoolRichman=1;
		clientStyle = new double[10];		
		clientStyle[0] = people*(0.25);//student
		clientStyle[1] = people*(0.05);//elderly
		clientStyle[2] = people*(0.05);//child
		clientStyle[3] = people*(0.25);//officeworker
		clientStyle[4] = people*(0.1);//worker
		clientStyle[5] = people*(0.3);//richman
		return clientStyle;
	} 
	
	
}
