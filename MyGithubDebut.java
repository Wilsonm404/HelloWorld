import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;





public class MyGithubDebut {

   
    public JFrame frame;
    public JPanel flowLayoutPanels;
    public HashMap<Integer,JLabel> labelsHashMap;
    
    public JButton button;
    
    public int buttonIterator = 1;
    
    
    
    //constructor
    public MyGithubDebut()
        {
            JLabel label1 = new JLabel("");
            JLabel label2 = new JLabel("");
            JLabel label3 = new JLabel("");
            JLabel label4 = new JLabel("");
            JLabel label5 = new JLabel("");
            JLabel label6 = new JLabel("");
            JLabel label7 = new JLabel("");
            JLabel label8 = new JLabel("");
            JLabel label9 = new JLabel("");
            JLabel label10 = new JLabel("");
            
            //intitializing HashMap
            labelsHashMap = new HashMap<Integer,JLabel>();
            
            //populating HashMap values to be replaced
            labelsHashMap.put(1,label1);
            labelsHashMap.put(2,label2);
            labelsHashMap.put(3,label3);
            labelsHashMap.put(4,label4);
            labelsHashMap.put(5, label5);
            labelsHashMap.put(6, label6);
            labelsHashMap.put(7, label7);
            labelsHashMap.put(8, label8);
            labelsHashMap.put(9, label9);
            labelsHashMap.put(10, label10);
        }
    
    public void createPaneledGUI()
        {
            frame = new JFrame("Click below...if you must..");
            flowLayoutPanels = new JPanel();
            flowLayoutPanels.setLayout(new BoxLayout(flowLayoutPanels,BoxLayout.PAGE_AXIS));
        
             //populating flowLayOutPanels with labeled panels;
            for(int i = 1; i <= 10 ; i++)
            {
                 JPanel pane = new JPanel();
                 pane.setLayout(new FlowLayout());
                 pane.add(labelsHashMap.get(i));
            
                flowLayoutPanels.add(pane);
            }
        
            button = new JButton(".");
            frame.add(button,BorderLayout.PAGE_END);
        
            event0 event0 = new event0();
        
            button.addActionListener(event0);
        
             frame.add(flowLayoutPanels);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.pack();
             frame.setVisible(true);
        
        
        
        }
    
    //ActionListener
    public class event0 implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
                {
                    try
                        {
                            labelsHashMap.get(buttonIterator).setText("0");
                            buttonIterator++;
                            
                        } catch(Exception exceptionVar)
                        {
                            
                        }
                            
                }       
        }
    
    
    public static void main(String[] args) 
        {
            MyGithubDebut myGithubDebut = new MyGithubDebut();
            
            myGithubDebut.createPaneledGUI();
        }
    
}
