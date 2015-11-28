import javax.swing.JOptionPane;
public class Practice02 {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter Temperature: ");
		double temp = Double.parseDouble(s);
		
		while (temp < -58 || temp > 41){
			s = JOptionPane.showInputDialog("Invalid Data. Enter Temperature: ");
			temp = Double.parseDouble(s);
		}
		
		s = JOptionPane.showInputDialog("Enter wind speed: ");
		double wind = Double.parseDouble(s);
		
		while (wind < 2){
			s = JOptionPane.showInputDialog("Invalid Data. Enter wind speed: ");
			wind = Double.parseDouble(s);
		}
		
		double x = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind, 0.16) + 0.4275 * temp * Math.pow(wind, 0.16);
		
		JOptionPane.showMessageDialog(null, "Wind chill index is: " + x);

	}

}
