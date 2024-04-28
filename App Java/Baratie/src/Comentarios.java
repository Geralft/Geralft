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

public class  Comentarios extends JFrame {

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

    public  Comentarios () {
        setTitle("ZONA DE USARIO");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel panel = new BackgroundPanel("Baratie\\src\\Imagenes\\fondo_de_comentario.png");
        panel.setLayout(null);
        setContentPane(panel);
        placeComponents(panel);
        setVisible(true);
    }

    
    /**
     * @param panel
     */
    public  void placeComponents(JPanel panel) {








        ImageIcon imagenIconoOriginal2 = new ImageIcon("Baratie\\src\\Imagenes\\lo.png");
        Image imagen2= imagenIconoOriginal2.getImage(); 
        Image imagenModificada2 = imagen2.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono2 = new ImageIcon(imagenModificada2); 
        JLabel lblNewLabel2 = new JLabel();
        lblNewLabel2.setIcon(imagenIcono2);
        lblNewLabel2.setBounds(599, 115, 200,200); 
        panel.add(lblNewLabel2);



        ImageIcon imagenIconoOriginal = new ImageIcon("Baratie\\src\\Imagenes\\Comenta.png");
        Image imagen = imagenIconoOriginal.getImage(); 
        Image imagenModificada = imagen.getScaledInstance(600, 600, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono = new ImageIcon(imagenModificada); 
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(imagenIcono);
        lblNewLabel.setBounds(400, 0, 600, 600); 
        panel.add(lblNewLabel);




     
        Cajita1 = new JTextField(20); 
        Cajita1.setBounds(510, 520, 400, 65);
        panel.add(Cajita1);



        JButton Boton_De_Barra = new JButton("ACEPTAR");
        Boton_De_Barra.setBounds(740, 600, 150, 55);
        Boton_De_Barra.setForeground(Color.BLACK);
        Boton_De_Barra.setFont(new Font("Arial", Font.BOLD, 16));
  
        Color colorDeFondos = new Color(0x17E685);
        Boton_De_Barra.setBackground(colorDeFondos); 
  
        Boton_De_Barra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra);
  




        JButton Boton_De_Barra1 = new JButton("CANCELAR");
        Boton_De_Barra1.setBounds(520, 600, 150, 55);
        Boton_De_Barra1.setForeground(Color.BLACK);
        Boton_De_Barra1.setFont(new Font("Arial", Font.BOLD, 16));
  
        Color colorDeFondos1 = new Color(0xE6173A);
        Boton_De_Barra1.setBackground(colorDeFondos1); 
  
        Boton_De_Barra1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra1.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra1.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra1);
  

        JButton Boton_De_Barra2 = new JButton("VOLVER");
        Boton_De_Barra2.setBounds(20, 600, 200, 55);
        Boton_De_Barra2.setForeground(Color.BLACK);
        Boton_De_Barra2.setFont(new Font("Arial", Font.BOLD, 14));
  
        Color colorDeFondos2 = new Color(0xCFE8E9);
        Boton_De_Barra2.setBackground(colorDeFondos2); 
        
        
        Boton_De_Barra2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Barra2.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Barra2.setFocusPainted(false);
  
  
        panel.add(Boton_De_Barra2);
  

       

        


        Boton_De_Barra.addActionListener(new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent e) {

                String usuario = Cajita1.getText();
             

                if (usuario.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor si quiere ingresar inserte los Datos.");
                } else {
                    
                JOptionPane.showMessageDialog(null, "SU COMENTARIO FUE: " + usuario);
         

              try (Connection conn = ConnectionDB.conectar();
                 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO loginfc (comentario) VALUES (?)")) {
                
                pstmt.setString(1, usuario);
          
                int affectedRows = pstmt.executeUpdate();
                
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Cambio exitoso");
 
                } else {
                    JOptionPane.showMessageDialog(null, "Error al cambiar nombre de usuario");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos.");
                ex.printStackTrace();
            }
        }
    }
});





Boton_De_Barra2.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
           Principal newframe =new  Principal();


        }
    
});











    }
        public static void main(String[] args) {
            new Comentarios ();
        }
    }
 
    

