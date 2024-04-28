import javax.swing.*;
import Baratie.ConnectionDB;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Registro extends JFrame {

    public  JTextField Cajita1;
    public  JTextField Cajita2;
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

    public Registro() {
        setTitle("Registro de Baraties");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel panel = new BackgroundPanel("Baratie\\src\\Imagenes\\Fondo_Login.jpg");
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
        

        ImageIcon imagenIconoOriginals = new ImageIcon("Baratie\\src\\Logo.jpg");
        Image imagens = imagenIconoOriginals.getImage(); 
        Image imagenModificadas = imagens.getScaledInstance(200, 200, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconos = new ImageIcon(imagenModificadas); 
        JLabel lblNewLabels = new JLabel();
        lblNewLabels.setIcon(imagenIconos);
        lblNewLabels.setBounds(150, 211, 200, 200); 
        panel.add(lblNewLabels);

        JLabel Encabezado = new JLabel("BARATIE");
        Encabezado.setBounds(550, 10, 580, 125);
       Encabezado.setFont(new Font("Arial", Font.BOLD, 96));

        panel.add(Encabezado);
        

        JLabel SubEncabezado = new JLabel("!REGISTRATE  Y REALIZA TU COMPRA!");
        SubEncabezado.setBounds(506, 90, 880, 125);
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


        
        JLabel Apellido_Usuario = new JLabel("Contraseña");
        Apellido_Usuario.setBounds(560, 260, 180, 25);
        Apellido_Usuario.setForeground(Color.BLACK);

        Apellido_Usuario.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(Apellido_Usuario);
        
        Cajita2 = new JTextField(20); 
        Cajita2.setBounds(550, 300, 400, 25);
        panel.add(Cajita2);









        JLabel Contraseña = new JLabel("Correo:");
        Contraseña.setBounds(560, 340, 180, 25);
        Contraseña.setForeground(Color.BLACK);
        Contraseña.setFont(new Font("Arial", Font.BOLD, 20));

        panel.add(Contraseña);

        Cajita3 = new JTextField(20);
        Cajita3.setBounds(550, 380, 400, 25);
        panel.add(Cajita3);





        JLabel correo = new JLabel("Usuario:");
       correo.setBounds(560, 420, 180, 25);
       correo.setForeground(Color.BLACK);
       correo.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(correo);

        Cajita4 = new JTextField(20);
        Cajita4.setBounds(550, 460, 400, 25);
        panel.add(Cajita4);




        JLabel Name_User = new JLabel("Apellido:");
       Name_User.setBounds(560, 520, 180, 25);
       Name_User.setForeground(Color.BLACK);
       Name_User.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(Name_User);

        Cajita5 = new JTextField(20);
        Cajita5.setBounds(550, 560, 400, 25);
        panel.add(Cajita5);







        JButton tengo_cuenta = new JButton("Tengo Cuenta");
        tengo_cuenta.setBounds(790, 600, 150, 35);
        tengo_cuenta.setForeground(Color.BLACK);
        tengo_cuenta.setFont(new Font("Arial", Font.BOLD,16));
        tengo_cuenta.setBackground(Color.YELLOW);
        tengo_cuenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tengo_cuenta.setBorderPainted(rootPaneCheckingEnabled);
        tengo_cuenta.setFocusPainted(false);


        panel.add(tengo_cuenta);



    tengo_cuenta.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
        
                    dispose();
                    Login newframe =new Login();


                }
            
        });


      

        JButton Boton_De_Login = new JButton("Registrarse");
        Boton_De_Login.setBounds(560, 600, 150, 35);
        Boton_De_Login.setForeground(Color.BLACK);
        Boton_De_Login.setFont(new Font("Arial", Font.BOLD, 16));
        Boton_De_Login.setBackground(Color.YELLOW);
        Boton_De_Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Login.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Login.setFocusPainted(false);

        Boton_De_Login.addActionListener(new ActionListener(){
            @Override

            public void actionPerformed(ActionEvent e) {

                String usuario = Cajita1.getText();
                String correo = Cajita3.getText();
                                String Apellido = Cajita4.getText();
                String Apodo = Cajita5.getText();
                String apellido = Cajita2.getText();

                String contraseña = new String(Cajita2.getText());


                if (usuario.isEmpty() || contraseña.isEmpty() || correo.isEmpty () || Apellido.isEmpty()||Apodo.isEmpty()   ) {
                    JOptionPane.showMessageDialog(null, "Por favor si quiere ingresar inserte los Datos.");
                } else {
                    
                JOptionPane.showMessageDialog(null, "Intento de inicio de sesión con Usuario: " + usuario + ", Contraseña: " + contraseña + ",  Correo: " + correo+ ", Apellido: "+Apodo);
         

              try (Connection conn = ConnectionDB.conectar();
                 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO loginfm (usuario, contraseña, correo) VALUES (?, ?, ?)")) {
                
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
        new Registro();
    }
}
