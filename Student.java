package Task2;

public class Student {
	//ID Number, #credit hours earned, number of points earned.
	private int idNum = 0;
	private int numCre = 0;
	private int numPoint= 0;
	private double gpa = 0;
	// assign values to attributes
	public void setIDNum (int num) {
		idNum = num;
	}
	public void setnumCre (int cre) {
		numCre = cre;
	}
	public void setnumPoint (int point) {
		numPoint = point;
	}
	// getter methods to display values
	
	public int getIdNum() {
		return idNum;
	}
	public int getnumCre() {
		return numCre;
		
	}public int getnumPoint() {
		return numPoint;
	}
	public double getGPA() {
		gpa = numPoint / numCre;
		return gpa;
	}
}
