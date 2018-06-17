public  class  Student  implements  studentData{
	public  String  name;
public	int rollnumber;
	public double  cgpa;
public	void  setName(String n){ name=n;}
	public void  setRollNumber(int roll){rollnumber=roll;}
public	void  setCGPA(double cgpa){this.cgpa=cgpa;}
	 public String getName(){return  name;}
public	int getRollNumber(){return  rollnumber;}
	public double getCGPA(){return  cgpa;}
public 	void showData(){System.out.println("StudentName : "+name+"\nRoll Number : "+rollnumber+"\nCGPA : "+cgpa);
	}
	
}