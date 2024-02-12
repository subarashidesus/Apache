
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MorseCodeTranslatorGUI extends JFrame{
    // textInputArea - User input (text to be traslated)
    // morseCodeArea - translated text into morse code
    
    private JTextArea textInputArea, morseCodeArea;
    
    public MorseCodeTranslatorGUI(){
        // basically adds text to the title bar
        super("Traductor de código Morse");
        
        
        // sets the size of the frame to be 540 * 760 pixels
        setSize(new Dimension(540, 760));
        
        // prevents GUI from being able to be resized
        setResizable(false);
        
        // setting the layout to be null allows us to manually position and set the size of the components in our GUI
        setLayout(null);
        
        // exits program when closing the GUI
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        getContentPane().setBackground(Color.decode("#264653"));
        
        // places the GUI in the center of the screen when ran
        setLocationRelativeTo(null);
        
        addGuiComponents();
    }
    
    private void addGuiComponents(){
        // title label
        JLabel titleLabel = new JLabel("Traductor de código Morse");
        
        // changes the font size for the label and the font weight
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 28));
        
        // changes the font color of the text to white
        titleLabel.setForeground(Color.WHITE);
        
        // centers text (relative to its container´s width)
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // sets the x, y position and the width and height dimensions
        // to make sure that the title aligns to the center of our GUI, we made it the same width
        titleLabel.setBounds(0, 0, 540, 100);
        
        // text input
        JLabel textInputLabel = new JLabel("Texto: ");
        textInputLabel.setFont(new Font("Dialog", Font.BOLD, 16));
        textInputLabel.setForeground(Color.WHITE);
        textInputLabel.setBounds(20, 100, 200, 30);
        
        
        textInputArea = new JTextArea();
        textInputArea.setFont(new Font("Dialog", Font.PLAIN, 18));
        
        // simulates padding of 10 px in the text area
        textInputArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // makes it so that words wrap to the next line after rearching the of the text area
        textInputArea.setLineWrap(true);
        
        // makes it so that when the words do get wrap, the word doesn´t split off
        textInputArea.setWrapStyleWord(true);
        
        // addds scrolling ability to input text area
        JScrollPane textInputScroll = new JScrollPane(textInputArea);
        textInputScroll.setBounds(20, 132, 484, 236);
        
        // morse code input      
        // add to GUI
        add(titleLabel);
        add(textInputLabel);
        add(textInputScroll);
    }
}
