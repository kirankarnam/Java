package com.semaphore;

import java.awt.Scrollbar;
import javax.swing.JButton;
import javax.swing.JMenu;


/*
 * interface that invokes the specific type of object based on the gui type required.
 */
public interface GuiFactory {

	public Scrollbar createScrollbar();
	public JButton createJbutton();
	public JMenu createJmenu();
}
