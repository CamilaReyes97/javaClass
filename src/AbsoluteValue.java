import javax.swing.JOptionPane;

public class AbsoluteValue {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Enter a number:");

        // Convert the input to a double
        double number = Double.parseDouble(input);
        // Calculate the absolute value
        double absoluteValue = Math.abs(number);


        JOptionPane.showMessageDialog(null, "The absolute value of " + number + " is " + absoluteValue + ".");
    }
}
