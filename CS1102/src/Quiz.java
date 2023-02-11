import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        String question = "What color is made when you mix blue and red??\n";
        question += "A. Red\n";
        question += "B. Green\n";
        question += "C. Purple\n";
        question += "D. Yellow\n";
        question += "E. Grey";

        for(boolean i=true; i.equals(true); i = true ) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("C")){
                JOptionPane.showMessageDialog(null, "Correct!");
            break;
              } else {
                JOptionPane.showMessageDialog(null, "Invalid answer.");
            }
        }
    }
}
