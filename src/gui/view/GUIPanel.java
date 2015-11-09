package gui.view;
import javax.swing.JPanel;
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
	 private void setupPanel()
	 {
		this.setLayout(baseLayout);
		 this.add(firstButton);
		this.add(firstTextField);
	 }
	 private void setupLayout(){
		 
	 }
	 private void setupListeners(){
		 
	 }
}
