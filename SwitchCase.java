import javax.swing.JOptionPane;


public class SwitchCase {
	public static void main (String[] args) {
		String[] choices = { "Administrator", "Faculty" , "Staff", "Student" , "Guest"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account "
		+ "type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		System.out.println(input);
		switch (input){
		case ("Administrator"):
			JOptionPane.showMessageDialog(null, "Welcome Administrator!");
		break;
		case  ("Faculty"):
			JOptionPane.showMessageDialog(null, "Welcome Faculty!");
		break;
		case ("Staff"):
			JOptionPane.showMessageDialog(null, "Welcome Staff");
		break;
		case ("Student"):
			JOptionPane.showMessageDialog(null, "Welcome Student!");
		break;
		case ("Guest"):
			JOptionPane.showMessageDialog(null, "Welcome Guest!");
		break;
		}

	}

}