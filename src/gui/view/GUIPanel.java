package gui.view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import gui.controller.GUIController;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Do Not Click The Button");
		firstTextField = new JTextField("You can Type words here");
		baseLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void  changeColors()
	{
		int red, blue, green;
		red = (int) (Math.random()*256);
		blue = (int) (Math.random()*256);
		green = (int) (Math.random()*256);
		
		this.setBackground(new Color(red, blue, green));
		
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 43,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 139,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -10,
				SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -10,
				SpringLayout.EAST, this);

	}

	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("You WHORE");

			}
		});

		 this.addMouseListener(new MouseListener()
		 {
			 public void mouseClicked(MouseEvent clicked)
			 {
				changeColors(); 
			 }

			
			public void mousePressed(MouseEvent pressed)
			{
				
				
			}

			
			public void mouseReleased(MouseEvent released)
			{
				
				
			}

			public void mouseEntered(MouseEvent entered)
			{
				changeColors();
				
			}

			public void mouseExited(MouseEvent exited)
			{
				changeColors();
				
			}
		 });
		this.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseMoved(MouseEvent moved)
			{
				firstButton.setText("Mouse X" + moved.getX() + "Mouse Y" + moved.getY());
				if((moved.getX() > 25 && moved.getX() < 40) && (moved.getY() > 50 && moved.getY() < 70))
				{
					changeColors();
				}
			}


			public void mouseDragged(MouseEvent dragged)
			{
				if (dragged.isAltDown())
				{
					firstButton.setText("You are holding down Alt");
				}
			}

		});
		
	}
}