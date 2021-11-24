package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> guestList = new ArrayList<String>();
	public void run() {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	frame.add(panel);
	panel.add(add);
	panel.add(view);
	add.setText("Add Name");
	view.setText("View Names");
	add.addActionListener(this);
	view.addActionListener(this);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == add) {
			String newName = JOptionPane.showInputDialog("Enter a Name:");
			guestList.add(newName);
		} else if(arg0.getSource() == view) {
			String names = "";
			int guestNumber;
			for(int i = 0; i < guestList.size(); i++) {
				guestNumber = i + 1;
				names += "Guest #" + guestNumber + ": ";
				names += guestList.get(i);	
				names += "\n";
			}
			JOptionPane.showMessageDialog(null, names);
		}
	}
}
