import javax.swing.*;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

import Baratie.ConnectionDB;
import java.sql.ResultSet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class inicio extends JFrame {

    public  JTextField Cajita1;
    public  JPasswordField Cajita2;
    public  JTextField Cajita3;
    public  JTextField Cajita4; 
    public  JTextField Cajita5;

    class BackgroundPanel extends JPanel {
        public  Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            backgroundImage = new ImageIcon(imagePath).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public inicio () {
        setTitle("ZONA DE USARIO");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel panel = new BackgroundPanel("Baratie\\src\\Imagenes\\Fondo_inicio2.png");

        panel.setLayout(null);
        setContentPane(panel);
        placeComponents(panel);
        setVisible(true);
        
    }

    
    /**
     * @param panel
     */
    public  void placeComponents(JPanel panel) {








        ImageIcon imagenIconoOriginal = new ImageIcon("Baratie\\src\\Imagenes\\logi.png");
        Image imagen = imagenIconoOriginal.getImage(); 
        Image imagenModificada = imagen.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono = new ImageIcon(imagenModificada); 
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(imagenIcono);
        lblNewLabel.setBounds(10, -20, 200, 200); 
        panel.add(lblNewLabel);



        ImageIcon imagenIconoOriginal1 = new ImageIcon("Baratie\\src\\Imagenes\\almacen.jpg");
        Image imagen1 = imagenIconoOriginal1.getImage(); 
        Image imagenModificada1 = imagen1.getScaledInstance(690, 600, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono1 = new ImageIcon(imagenModificada1); 
        JLabel lblNewLabel1 = new JLabel();
        lblNewLabel1.setIcon(imagenIcono1);
        lblNewLabel1.setBounds(660, 130, 690, 600); 
        panel.add(lblNewLabel1);


     

        JButton Boton_De_Barra = new JButton("INICIAR");
        Boton_De_Barra.setBounds(150, 605, 150, 55);
        Boton_De_Barra.setForeground(Color.BLACK);
        Boton_De_Barra.setFont(new Font("Arial", Font.BOLD, 16));
  
        Color colorDeFondos = new Color(0x0379ff);
        Boton_De_Barra.setBackground(colorDeFondos); 
  
        Boton_De_Barra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra);
  

        JButton Boton_De_Barra1 = new JButton("COMENTARIOS");
        Boton_De_Barra1.setBounds(300, 605, 150, 55);
        Boton_De_Barra1.setForeground(Color.BLACK);
        Boton_De_Barra1.setFont(new Font("Arial", Font.BOLD, 14));
  
        Color colorDeFondos1 = new Color(0x0379ff);
        Boton_De_Barra1.setBackground(colorDeFondos1); 
  
        Boton_De_Barra1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra1.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra1.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra1);
  


        JButton Boton_De_Barra2 = new JButton("PERFIL");
        Boton_De_Barra2.setBounds(450, 605, 150, 55);
        Boton_De_Barra2.setForeground(Color.BLACK);
        Boton_De_Barra2.setFont(new Font("Arial", Font.BOLD, 14));
  
        Color colorDeFondos2 = new Color(0x0379ff);
        Boton_De_Barra2.setBackground(colorDeFondos1); 
  
        Boton_De_Barra2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra2.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra2.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra2);
  


  


        JButton Boton1 = new JButton("INICIAR SECCIÓN");
        Boton1.setBounds(400, 30, 290, 55);
        Boton1.setForeground(Color.WHITE);
        Boton1.setFont(new Font("Super Positive", Font.BOLD, 19));
        Boton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton1.setFocusPainted(false);
        Boton1.setBorderPainted(false);
        Boton1.setOpaque(false);
        Boton1.setContentAreaFilled(false);

    
    panel.add(Boton1);
    


    JButton Boton2 = new JButton("REGISTRARSE");
    Boton2.setBounds(620, 30, 290, 55);
    Boton2.setForeground(Color.WHITE);
    Boton2.setFont(new Font("Super Positive", Font.BOLD, 19));
    Boton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton2.setFocusPainted(false);
    Boton2.setBorderPainted(false);
    Boton2.setOpaque(false);
    Boton2.setContentAreaFilled(false);


panel.add(Boton2);


JButton Boton3 = new JButton("HISTORIAL");
    Boton3.setBounds(830, 30, 290, 55);
    Boton3.setForeground(Color.WHITE);
    Boton3.setFont(new Font("Super Positive", Font.BOLD, 19));
    Boton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton3.setFocusPainted(false);
    Boton3.setBorderPainted(false);
    Boton3.setOpaque(false);
    Boton3.setContentAreaFilled(false);


panel.add(Boton3);








        Boton_De_Barra.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                   Principal newframe =new Principal();


                }
            
        });


        Boton_De_Barra2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                   Clientes newframe =new Clientes();


                }
            
        });


        Boton_De_Barra1.addActionListener(new ActionListener() {
            @Override
        
            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                    Comentarios newframe =new Comentarios();
        
        
                }
            
        });
        


        Boton1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                 Login newframe =new Login();


                }
            
        });




        Boton2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                 Registro newframe =new  Registro();


                }
            
        });






    }
        public static void main(String[] args) {
            new inicio ();
        }
    }
