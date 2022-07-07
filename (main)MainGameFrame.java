package main;

import javax.swing.JPanel;

public class MainGameFrame extends JPanel {
	
private JPanel runnerGamePanel;
	
	public MainGameFrame() {
		
		runnerGamePanel = new RunnerGamePanel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle( "Runner Game v_1.4");
		setLocation(500, 200);
		add( runnerGamePanel);
		pack();
		setVisible(false);
		setVisible( true);
		//setResizable( false);
		
	}
	
    public static void main( String[] args) {
		
		new MainGameFrame();

	}

}
