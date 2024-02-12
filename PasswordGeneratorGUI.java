
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;




// render the GUI components (frontend)
// this class will inherit from the JFrame class
public class PasswordGeneratorGUI extends JFrame{
    private PasswordGenerator passwordGenerator;
    
    public PasswordGeneratorGUI(){
        // render frame and add a title
        super("Generador de Contraseñas");
        
        // set the size of the GUI
        setSize(540, 570);
        
        // prevent GUI from being able to resized
        setResizable(false);
        
        // we will set the layout to be null to have control over the position and size of our components in our app
        setLayout(null);
        
        // terminate the program when the GUI is close (ends the process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // center the GUI to the screen
        setLocationRelativeTo(null);
        
        // init password gnerator
        passwordGenerator = new PasswordGenerator();
        
        // render GUI components
        addGuiComponents();
    }
    
    private void addGuiComponents(){
        // create title text
        JLabel titleLabel = new JLabel("Generador de Contraseñas");
        
        // increase the font size and make it bold
        titleLabel.setFont(new Font("Dialog", Font.BOLD, 32));
        
        // center the text to the screen
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        // SET X, Y coordinates and width/height values
        titleLabel.setBounds(0, 10, 540, 39);
        
        // Cambiar el color del texto a azul
        titleLabel.setForeground(Color.BLUE);        
        
        // add to GUI
        add(titleLabel);
        
        // create result text area
        
        JTextArea passwordOutput = new JTextArea();
        
        // prevent editing the text area
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));
        
        // add scrollability in case output becomes to big
        
        JScrollPane passwordOutputPane = new JScrollPane(passwordOutput);
        
        passwordOutputPane.setBounds(25, 97, 479, 70);
        
        // create a black border around the text area
        
        passwordOutputPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordOutputPane);
        
        
        // create password length label
        JLabel passwordLengthLabel = new JLabel("Longitud de contraseña: ");
        passwordLengthLabel.setFont(new Font ("Dialog", Font.PLAIN, 24));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        // Cambia el color del texto a rojo
        passwordLengthLabel.setForeground(Color.RED);
        add(passwordLengthLabel);
        
        
        // create password length input
        JTextArea passwordLengthInputArea = new JTextArea();
        passwordLengthInputArea.setFont(new Font("Dialog", Font.PLAIN,  32));
        passwordLengthInputArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordLengthInputArea.setBounds(310, 215, 192, 39);
        add(passwordLengthInputArea);
        
        // create toggle  buttons
        // uppercase letter toggle
        JToggleButton uppercaseToggle = new JToggleButton("Mayúscula");
        uppercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        uppercaseToggle.setBounds(25, 302, 225, 56);
        // Cambia el color de onfo a verde
        uppercaseToggle.setBackground(Color.GREEN);
        add(uppercaseToggle);
        
        // lowercase letter toggle
        JToggleButton lowercaseToggle = new JToggleButton("Minúsculas");
        lowercaseToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        lowercaseToggle.setBounds(282, 302, 225, 56);
        // Cambia el color de fondo a amarillo
        lowercaseToggle.setBackground(Color.YELLOW);
        add(lowercaseToggle);
        
        // numbers .toggle
        JToggleButton numbersToggle = new JToggleButton("Números");
        numbersToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        numbersToggle.setBounds(25, 373, 225,  56);
        // Cambia el color de fondo a naranja
        numbersToggle.setBackground(Color.ORANGE);
        add(numbersToggle);
        
        // symbols toggle
        JToggleButton symbolsToggle = new JToggleButton("Símbolos");
        symbolsToggle.setFont(new Font("Dialog", Font.PLAIN, 26));
        symbolsToggle.setBounds(282, 373, 225, 56);
        symbolsToggle.setBackground(Color.CYAN); // Cambia el color de fondo a cian
        add(symbolsToggle);
        
        // create generate button
        JButton generateButton = new JButton("Generar");
        generateButton.setFont(new Font("Dialog", Font.PLAIN, 32));
        generateButton.setBounds(155, 477, 222, 41);
        generateButton.setBackground(Color.MAGENTA); // Cambia el color de fondo a magenta
        generateButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // validation: generate a password only when length > 0 and one the toggled buttons is pressed
                if(passwordLengthInputArea.getText().length() <= 0) return;
                boolean anyToggleSelected = lowercaseToggle.isSelected() ||
                        uppercaseToggle.isSelected() ||
                        numbersToggle.isSelected() ||
                        symbolsToggle.isSelected();
                
                // generate password
                int passwordLength = Integer.parseInt(passwordLengthInputArea.getText());
                if(anyToggleSelected){
                    String generatedPassword = passwordGenerator.generatePassword(passwordLength,
                            uppercaseToggle.isSelected(),
                            lowercaseToggle.isSelected(),
                            numbersToggle.isSelected(),
                            symbolsToggle.isSelected());
                    
                    // display password back to the user
                    passwordOutput.setText(generatedPassword);
                    
                }
                        
            }
        });
        add(generateButton);
    }
    
    
    
    
}
