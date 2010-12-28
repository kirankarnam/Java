package com.semaphore.gui;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.semaphore.GuiFactory;
import com.semaphore.controller.GuiController;

/**
 * Gui Class which invokes the specific type of GUI factory class
 * @author kirankarnam
 *
 */
@SuppressWarnings("unused")
public class ClientGui extends JFrame {


	private static final long serialVersionUID = 1L;
	private GuiController controller = new GuiController();
	private JButton SaveButton;

	private GuiFactory gf;


	
	public ClientGui(GuiFactory g) {
		super();
		this.gf = g;
	}
	
	/** 
	 * save button functionality when the user clicks the save button the GUI just
	 *  calls controller and it performs the redirection and object instantiation process.
	 *  The GUI is unaware of the back end business logic
	 * @return
	 */

	private JButton getSaveButton() {
		if (SaveButton == null) {
			//SaveButton.addActionListener(new SaveListener());
			SaveButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					saveBtnActionPerformed(e);
				}
			});
		}
		return SaveButton;
	}



	private void saveBtnActionPerformed(ActionEvent evt) {	
		controller.saveText(SaveButton.getText());
		
	}

}