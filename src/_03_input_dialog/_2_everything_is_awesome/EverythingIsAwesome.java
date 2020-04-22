package _03_input_dialog._2_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
	String awesome	= JOptionPane.showInputDialog("what is your favorit thing?");;
		JOptionPane.showMessageDialog(null, awesome+ " is awesome");

}
}