package gui.view;

import javax.swing.JFrame;

import gui.controller.GUIController;

import javax.swing.JPanel;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel basePanel;
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setFrame();

	}
	
	private void setFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("StupidWindowApp");
		this.setResizable(false);
		this.setSize(400,400);
		this.setVisible(true);
	}

	public  GUIController getBaseController()
	{
		
		return baseController;
	}
}
