package Task2;
import javax.swing.JOptionPane;
public class ShowStudent {
	public static void main(String[] args) {
		String s1;
		int a,b,c;
		//instantiate student object
		Student showStudent = new Student();
		// assign values
		//showStudent.setIDNum(1);
		//showStudent.setnumCre(180);
		//showStudent.setnumPoint(360);
		s1 = JOptionPane.showInputDialog(null,"Enter Your ID:",JOptionPane.INFORMATION_MESSAGE);
		a = Integer.parseInt(s1);
		showStudent.setIDNum(a);
		s1 = JOptionPane.showInputDialog(null,"Enter Your Credit Number:",JOptionPane.INFORMATION_MESSAGE);
		b = Integer.parseInt(s1);
		showStudent.setnumCre(b);
		s1 = JOptionPane.showInputDialog(null,"Enter Your Point:",JOptionPane.INFORMATION_MESSAGE);
		c = Integer.parseInt(s1);
		showStudent.setnumPoint(c);
		
		// display values
		JOptionPane.showMessageDialog(null,"ID Number: "+showStudent.getIdNum());
		JOptionPane.showMessageDialog(null,"Number of Credits: "+showStudent.getnumCre());
		JOptionPane.showMessageDialog(null,"Number of Points: "+showStudent.getnumPoint());
		JOptionPane.showMessageDialog(null,"Your GPA: "+showStudent.getGPA());
		
		//Convert Grade to Qualification Status
		if (showStudent.getGPA() <= 1.5)
			JOptionPane.showMessageDialog(null,"Your Status: Sehr Gut");
		else if (showStudent.getGPA() <= 2.5)
			JOptionPane.showMessageDialog(null,"Your Status: Gut");
		else if (showStudent.getGPA() <= 3.5)
			JOptionPane.showMessageDialog(null,"Your Status: Befriedigend");
		else if (showStudent.getGPA() <= 4.0)
			JOptionPane.showMessageDialog(null,"Your Status: Ausreichend");
		else
			JOptionPane.showMessageDialog(null,"Your Status: Nich Bestanden");
	}
	
}
