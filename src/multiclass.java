import javax.swing.JOptionPane;

public class multiclass {

    public void multiplication(){
        gui guiobj = new gui();
        guiobj.ans = guiobj.numone * guiobj.numtwo;

        JOptionPane.showMessageDialog(null, "Your answer is " + guiobj.ans, "Answer" , JOptionPane.PLAIN_MESSAGE);
    }

}
