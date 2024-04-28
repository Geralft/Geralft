import javax.swing.*;
import java.sql.DriverManager;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class principals extends JFrame {

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

    public principals () {
        setTitle("Colmado D'Clase");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BackgroundPanel panel = new BackgroundPanel("C:\\Users\\Anny Vasquez\\OneDrive\\Escritorio\\aplicacion\\ColmadoDclase\\⚘ ⦂ fondoo.jpg");
        panel.setLayout(null);
        setContentPane(panel);
        placeComponents(panel);
        setVisible(true);
    }

    /**
     * @param panel
     */
    public  void placeComponents(JPanel panel) {

        ImageIcon imagenIconoOriginal = new ImageIcon("C:\\Users\\Anny Vasquez\\OneDrive\\Escritorio\\aplicacion\\ColmadoDclase\\oko.jpg");
        Image imagen = imagenIconoOriginal.getImage(); 
        Image imagenModificada = imagen.getScaledInstance(400, 400, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono = new ImageIcon(imagenModificada); 
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(imagenIcono);
        lblNewLabel.setBounds(530, 30, 200, 200); 
        panel.add(lblNewLabel);







        

    }
        public static void main(String[] args) {
            new principals ();
        }
    }
