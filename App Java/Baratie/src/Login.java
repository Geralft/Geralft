import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Baratie.ConnectionDB;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {


    public  JTextField Cajita1;
    public  JPasswordField Cajita2;
    public  JTextField Cajita3;

    class BackgroundPanel extends JPanel {
        private Image backgroundImage;

        public BackgroundPanel(String imagePath) {
            backgroundImage = new ImageIcon(imagePath).getImage();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
        }
    }

    public Login() {
        setTitle("Inicio de Sesión Baratie");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel panel = new BackgroundPanel("Baratie\\src\\Imagenes\\Fondo_Registro.jpg");
        panel.setLayout(null);
        setContentPane(panel);

        

        placeComponents(panel);
        setVisible(true);
    }



    
    /**
     * @param panel
     */
    public  void placeComponents(JPanel panel) {
        ImageIcon imagenIconoOriginal = new ImageIcon("Baratie\\src\\Imagenes\\Manos.png");
        Image imagen = imagenIconoOriginal.getImage(); 
        Image imagenModificada = imagen.getScaledInstance(400, 400, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono = new ImageIcon(imagenModificada); 
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(imagenIcono);
        lblNewLabel.setBounds(50, 211, 400, 400); 
        panel.add(lblNewLabel);
    
    


        ImageIcon imagenIconoOriginals = new ImageIcon("Baratie\\src\\Logo.jpg");
        Image imagens = imagenIconoOriginals.getImage(); 
        Image imagenModificadas = imagens.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconos = new ImageIcon(imagenModificadas); 
        JLabel lblNewLabels = new JLabel();
        lblNewLabels.setIcon(imagenIconos);
        lblNewLabels.setBounds(150, 211, 200, 200); 
        
        panel.add(lblNewLabels);
    
    


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





        Boton_De_Barra2.addActionListener(new ActionListener() {
            @Override
        
            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                   inicio newframe =new  inicio();
        
        
                }
            
        });
        


        JLabel Encabezado = new JLabel("BARATIE");
        Encabezado.setBounds(510, 10, 580, 125);
       Encabezado.setFont(new Font("Arial Black", Font.BOLD, 96));

        panel.add(Encabezado);
        

        JLabel SubEncabezado = new JLabel("!LOGEATE Y REALIZA TU COMPRA!");
        SubEncabezado.setBounds(530, 90, 880, 125);
        SubEncabezado.setFont(new Font("Arial", Font.BOLD, 26));

        panel.add(SubEncabezado);

        JLabel Nombre_Usuario = new JLabel("Nombre");
        Nombre_Usuario.setBounds(560, 180, 80, 25);
        Nombre_Usuario.setForeground(Color.BLACK);
        Nombre_Usuario.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(Nombre_Usuario);
        
        Cajita1 = new JTextField(20); 
        Cajita1.setBounds(550, 220, 400, 25);
        panel.add(Cajita1);





        JLabel Contraseña = new JLabel("Contraseña:");
        Contraseña.setBounds(560, 260, 180, 25);
        Contraseña.setForeground(Color.BLACK);
        Contraseña.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(Contraseña);

        Cajita2 = new JPasswordField(20); 
        Cajita2.setBounds(550, 290, 400, 25);
        panel.add(Cajita2);





        JLabel Correo = new JLabel("Correo:");
        Correo.setBounds(560, 340, 80, 25);
        Correo.setForeground(Color.BLACK);
        Correo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(Correo);

        Cajita3 = new JTextField(20);
        Cajita3.setBounds(550, 380, 400, 25);
        panel.add(Cajita3);



      
        









        JButton Boton_De_Login = new JButton("Iniciar Sesión");
        Boton_De_Login.setBounds(560, 450, 150, 35);
        Boton_De_Login.setForeground(Color.BLACK);
        Boton_De_Login.setBackground(Color.YELLOW);
        Boton_De_Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Login.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Login.setFocusPainted(false);



        Boton_De_Login.setFont(new Font("Arial", Font.BOLD, 16));



        JButton No_cuenta = new JButton("No tengo Cuenta");
        No_cuenta.setBounds(790, 450, 150, 35);
        No_cuenta.setForeground(Color.BLACK);
        No_cuenta.setFont(new Font("Arial", Font.BOLD,12));
        No_cuenta.setBackground(Color.YELLOW);
        No_cuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        No_cuenta.setBorderPainted(rootPaneCheckingEnabled);
        No_cuenta.setFocusPainted(false);



        panel.add(No_cuenta);






        No_cuenta.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                  Registro newframe =new Registro();

                }
                    
          
    
    });
    


        Boton_De_Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = Cajita1.getText();
                String contraseña = new String(Cajita2.getPassword());
                String correo = Cajita3.getText();
        
                if (usuario.isEmpty() || contraseña.isEmpty() || correo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
                } else {
                    try (Connection conn = new ConnectionDB().conectar();
                    PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM loginfm WHERE usuario = ? AND contraseña = ? ")) {
                        
                        pstmt.setString(1, usuario);
                        pstmt.setString(2, contraseña);
                        ResultSet rs = pstmt.executeQuery();
        
                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso para el usuario: " + usuario );

                            dispose();
                           Principal newframe =new Principal();




                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos.");
                    }
                    
                }
            }
            
        
        });
        







        Boton_De_Login.addActionListener(new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent e) {

                String usuario = Cajita1.getText();
                String correo = Cajita3.getText();
                String apellido = Cajita2.getText();

                String contraseña = new String(Cajita2.getText());


                if (usuario.isEmpty() || contraseña.isEmpty() || correo.isEmpty ()   ) {
                    JOptionPane.showMessageDialog(null, "Por favor si quiere ingresar inserte los Datos.");
                } else {
                    
                JOptionPane.showMessageDialog(null, "Intento de inicio de sesión con Usuario: " + usuario + ", Contraseña: " + contraseña + ",  Correo: " + correo );
         

              try (Connection conn = ConnectionDB.conectar();
                 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO loginfn (usuario, contraseña, correo) VALUES (?, ?, ?)")) {
                
                pstmt.setString(1, usuario);
                pstmt.setString(2, contraseña);
                pstmt.setString(3, correo);
                
                int affectedRows = pstmt.executeUpdate();
                
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    dispose();
                    Principal newframe =new Principal();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos.");
                ex.printStackTrace();
            }
        }
    }
});
        panel.add(Boton_De_Login);
    }





       


    public static void main(String[] args) {
        new Login();
    }
}
