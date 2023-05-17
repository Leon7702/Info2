package Lab06;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

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
            addButton(buttonPanel, "c");
            addButton(buttonPanel, "?");
            buttonPanel.add(new JLabel(" "));
      
        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }
	
	@Override
	public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();

        if(command.equals("0") ||
           command.equals("1") ||
           command.equals("2") ||
           command.equals("3") ||
           command.equals("4") ||
           command.equals("5") ||
           command.equals("6") ||
           command.equals("7") ||
           command.equals("8") ||
           command.equals("9")) {
            int number = Integer.parseInt(command);
            calc.numberPressed(number);
        }
        else if(command.equals("A")) {
            calc.numberPressed(10);
        }
        else if(command.equals("B")) {
            calc.numberPressed(11);
        }
        else if(command.equals("C")) {
            calc.numberPressed(12);
        }
        else if(command.equals("D")) {
            calc.numberPressed(13);
        }
        else if(command.equals("E")) {
            calc.numberPressed(14);
        }
        else if(command.equals("F")) {
            calc.numberPressed(15);
        }
        else if(command.equals("+")) {
            calc.plus();
        }
        else if(command.equals("-")) {
            calc.minus();
        }
        else if(command.equals("*")) {
            calc.multi();
        }
        else if(command.equals("/")) {
            calc.div();
        }
        else if(command.equals("=")) {
            calc.equals();
        }
        else if(command.equals("c")) {
            calc.clear();
        }
        else if(command.equals("?")) {
            showInfo();
        }
        // else unknown command.

        redisplay();
    }

}

