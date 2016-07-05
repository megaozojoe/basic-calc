import javax.swing.JOptionPane;

public class additionclass {

        public void addition(){
            gui guiobj = new gui();

            guiobj.ans = guiobj.numone + guiobj.numtwo;

            JOptionPane.showMessageDialog(null,"Your answer is " + guiobj.ans, "Answer", JOptionPane.PLAIN_MESSAGE);

    }


}
