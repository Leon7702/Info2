package Lab06;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HexaNotation extends UserInterface {

	public HexaNotation(CalcEngine engine) {
		super(engine);
	}

	@Override
	protected void makeFrame() {
		frame = new JFrame(calc.getTitle());
        
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4));
            addButton(buttonPanel, "C");
            addButton(buttonPanel, "D");
            addButton(buttonPanel, "E");
            addButton(buttonPanel, "F");
            
            addButton(buttonPanel, "8");
            addButton(buttonPanel, "9");
            addButton(buttonPanel, "A");
            addButton(buttonPanel, "B");
            
            addButton(buttonPanel, "4");
            addButton(buttonPanel, "5");
            addButton(buttonPanel, "6");
            addButton(buttonPanel, "7");
            
            addButton(buttonPanel, "0");
            addButton(buttonPanel, "1");
            addButton(buttonPanel, "2");
            addButton(buttonPanel, "3");
            
            addButton(buttonPanel, "+");
            addButton(buttonPanel, "-");
            addButton(buttonPanel, "*");
            addButton(buttonPanel, "/");
            
            addButton(buttonPanel, "=");
            addButton(buttonPanel, "C");
            addButton(buttonPanel, "?");
            buttonPanel.add(new JLabel(" "));
      
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }

}

