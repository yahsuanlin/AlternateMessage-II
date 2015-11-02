import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlternateMessage extends JFrame {
  //create a RotateMessagePanel instance for rotating two messages
  private RotateMessagePanel panel = new RotateMessagePanel();
  
  public AlternateMessage() {
	//place the message panel in the frame 
	add(panel, BorderLayout.CENTER);
    panel.setFocusable(true);
  }

  class RotateMessagePanel extends MessagePanel {
	private String msg1 = "Java is fun";
    private String msg2 = "Java is powerful";
    private boolean isM1; // Message to display	
	
	/** Contruct a panel to rotate two msgs */
    public RotateMessagePanel() {
		addMouseListener(new MouseAdapter() {
			/** Handle mouse-clicked event */
			public void mouseClicked(MouseEvent e) {
			  if(isM1)
				setMessage(msg1);
			  else 
				setMessage(msg2);	
			isM1 = !isM1;
        }
      });
    }
  }
}
