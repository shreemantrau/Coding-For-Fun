package practice;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
public class GamePanel extends JPanel implements Runnable, KeyListener 
{
public static final int height=400;
public static final int width=400;
public static int weidht;


private Thread th;
private boolean runnning;
private long targetime;

public GamePanel()
{
setPreferredSize(new Dimension(height,width));	
setFocusable(true);
requestFocus();
addKeyListener(this);
}

@Override
public void keyTyped(KeyEvent e) {

	
}

@Override
public void keyPressed(KeyEvent e) {

}
public void keyReleased(KeyEvent e) {
	
}

public void run() {

	
}

}