/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuboidcalculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class GUI extends JFrame implements ActionListener{
    
    JLabel ltitle = new JLabel("Cuboid Calculator");
    
    JLabel llength = new JLabel("Length: ");
    JTextField flength = new JTextField();
    
    JLabel lwidth = new JLabel("Width: ");
    JTextField fwidth = new JTextField();
    
    JLabel lheight = new JLabel("Height: ");
    JTextField fheight = new JTextField();
    
    JLabel lresult = new JLabel("Result: ");
    
    JLabel larea = new JLabel(" ");
    JLabel lcircumference = new JLabel(" ");
    JLabel lvolume = new JLabel(" ");
    JLabel lsurface = new JLabel(" ");
      
    JButton bcalculate = new JButton("Calculate");
    JButton breset = new JButton("Reset");
    
    public GUI(){
        setTitle("Cuboid Calculator");
        setSize(350,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);    
        
        bcalculate.addActionListener(this);
        breset.addActionListener(this);
        
        add(ltitle);
        add(llength);
        add(flength);
        add(lwidth);
        add(fwidth);
        add(lheight);
        add(fheight);
        add(lresult);
        add(larea);
        add(lcircumference);
        add(lvolume);
        add(lsurface);
        add(bcalculate);
        add(breset);
        
        ltitle.setBounds(120, 10, 100, 20);
        llength.setBounds(20, 50, 120, 20);
        flength.setBounds(130, 50, 150, 20);
        lwidth.setBounds(20, 80, 120, 20);
        fwidth.setBounds(130, 80, 150, 20);
        lheight.setBounds(20, 110, 150, 20);
        fheight.setBounds(130, 110, 150, 20);
        lresult.setBounds(120, 140, 200, 20);
        larea.setBounds(30, 170, 200, 20); 
        lcircumference.setBounds(30, 190, 200, 20); 
        lvolume.setBounds(30, 220, 200, 20); 
        lsurface.setBounds(30, 240, 200, 20);
        bcalculate.setBounds(60, 300, 90, 20);
        breset.setBounds(180, 300, 90, 20);
     
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            int length = Integer.parseInt(flength.getText());
            int width = Integer.parseInt(fwidth.getText());
            int height = Integer.parseInt(fheight.getText());
            int area, circumference, volume, surface;
            
            if(e.getSource() == bcalculate){
                area = length * width;
                larea.setText("Square area : " + area);
                
                circumference = 2*length + 2*width;
                lcircumference.setText("Square circumference : " + circumference);
                
                volume = length * width * height;
                lvolume.setText("Cuboid volume : " + volume);
                
                surface = (2 * length * width) + (2 * width * height) + (2 * length * height);
                lsurface.setText("Cuboid surface : " + surface);
                
            }else if(e.getSource() == breset){
                reset();
            }
            
        }catch(NumberFormatException numberFormatException){
            JOptionPane.showMessageDialog(null, "Error! Input must be number");
        }
    }
    private void reset(){
        flength.setText("");
        fwidth.setText("");
        fheight.setText("");
        larea.setText("");
        lcircumference.setText("");
        lvolume.setText("");
        lsurface.setText("");
    }
}
