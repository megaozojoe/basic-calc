import javax.swing.JOptionPane;


public class gui{

	public static String fn;
	public static String sn;
	public static String opt;
	public static int numone;
	public static int numtwo;
	public static int ans;

	public void value(){
		fn = JOptionPane.showInputDialog("What is your first number?");
		sn = JOptionPane.showInputDialog("What is your second number?");
		opt = JOptionPane.showInputDialog("What is your operator?");
		numone = Integer.parseInt(fn); //this converts the public string to an int
		numtwo = Integer.parseInt(sn);

	}




	public static void main(String[] args){

		gui guiobj = new gui();
		additionclass addobj = new additionclass();
		subtractionclass subobj = new subtractionclass();
		multiclass multiobj = new multiclass();
		divisionclass divobj = new divisionclass();

		try {
			guiobj.value();


			if (opt.equalsIgnoreCase("Addition") || opt.equals("+")) {
				addobj.addition();
			}
			if (opt.equalsIgnoreCase("Subtraction") || opt.equals("-")) {
				subobj.subtraction();
			}

			if (opt.equalsIgnoreCase("Multiplication") || opt.equals("*")) {
				multiobj.multiplication();
			}
			if (opt.equalsIgnoreCase("Division") || opt.equals("/")) {
				divobj.division();
			}
		}

		catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Something went wrong please try again.", "Error", JOptionPane.PLAIN_MESSAGE);
		}

	}


}
