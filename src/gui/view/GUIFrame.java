package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setFrame();

	}
	
	private void setFrame()
	{
		this.setSize(400,400);
		this.setVisible(true);
	}
}
