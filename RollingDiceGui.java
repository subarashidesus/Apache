
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class RollingDiceGui extends JFrame  {
    public RollingDiceGui(){
        super("Tirar dados dobles");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700, 700));
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        addGuiComponents();
    }
    
    private void addGuiComponents(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        
        // 1.Banner
        JLabel bannerImg = ImgService.loadImage("resources/banner.png");
        bannerImg.setBounds(45, 25, 600, 100);
        jPanel.add(bannerImg);
        JScrollPane scrollPane = new JScrollPane(jPanel);
        this.getContentPane().add(scrollPane);
        
        // 2. Dices
        JLabel diceOneImg = ImgService.loadImage("resources/dice1.png");
        diceOneImg.setBounds(100, 200, 200, 200);
        jPanel.add(diceOneImg);
        
        JLabel diceTwoImg = ImgService.loadImage("resources/dice1.png");
        diceTwoImg.setBounds(380, 200, 200, 200);
        jPanel.add(diceTwoImg);
        
        // 3. Roll Button
        Random rand = new Random();
        JButton rollButton = new JButton("Lanzar!");
        rollButton.setBounds(250, 550, 200, 50);
        rollButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            rollButton.setEnabled(false);
            
            // roll for 3 seconds
            long startTime = System.currentTimeMillis();
            Thread rollThread = new Thread(new Runnable(){
                @Override
                public void run(){
                    long endTime = System.currentTimeMillis();
                    try{
                        while((endTime - startTime) / 1000F < 3){
                            // roll dice
                            int diceOne = rand.nextInt(1, 7);
                            int diceTwo = rand.nextInt(1, 7);
                            
                            // update dice images
                            ImgService.updateImage(diceOneImg, "resources/dice" + diceOne + ".png");
                            ImgService.updateImage(diceTwoImg, "resources/dice" + diceTwo + ".png");
                            
                            repaint();
                            revalidate();
                            
                            // sleep thread
                            Thread.sleep(60);
                            
                            endTime = System.currentTimeMillis();
                        }
                        
                        rollButton.setEnabled(true);
                    }catch(InterruptedException e){
                        System.out.println("Threading Error: " + e);
                    }
                }
            });
            rollThread.start();
        }
    });
        jPanel.add(rollButton);
    
        
        
        this.getContentPane().add(jPanel);
    }
    
}
