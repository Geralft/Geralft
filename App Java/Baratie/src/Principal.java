import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

    public Principal() {
        setTitle("ZONA PRINCIPAL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel contentPanel = new JPanel(null);
        contentPanel.setPreferredSize(new Dimension(1200, 1090)); 





        

        JLabel Encabezado = new JLabel("BARATIE");
        contentPanel.setBackground(Color.white);
 
        Encabezado.setBounds(350, 10, 580, 125);
        Encabezado.setFont(new Font("Arial", Font.BOLD, 36));
        Encabezado.setForeground(Color.BLACK);
 
        
        contentPanel.add(Encabezado);
 






        ImageIcon imagenIconoOriginals = new ImageIcon("Baratie\\src\\Imagenes\\Banner_principal.jpg");
        Image imagens = imagenIconoOriginals.getImage(); 
        Image imagenModificadas = imagens.getScaledInstance(2000,550, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconos = new ImageIcon(imagenModificadas); 
        JLabel lblNewLabels = new JLabel();
        lblNewLabels.setIcon(imagenIconos);
        lblNewLabels.setBounds(300, 0, 2000, 145); 
        lblNewLabels.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

       contentPanel.add(lblNewLabels);



     




        JTextField Buscador = new JTextField(20); 
        Buscador.setBounds(350, 110, 400, 25);
        contentPanel.add( Buscador);











        ImageIcon imagenIconoOriginal = new ImageIcon("Baratie\\src\\Imagenes\\Manos.png");
        Image imagen = imagenIconoOriginal.getImage(); 
        Image imagenModificada = imagen.getScaledInstance(250, 250, Image.SCALE_SMOOTH); 
        ImageIcon imagenIcono = new ImageIcon(imagenModificada); 
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setIcon(imagenIcono);
        lblNewLabel.setBounds(20, 580, 250, 250); 
       contentPanel.add(lblNewLabel);
    
    


       ImageIcon imagenIconoOriginalss1 = new ImageIcon("Baratie\\src\\Logo.jpg");
       Image imagenss1 = imagenIconoOriginalss1.getImage(); 
       Image imagenModificadass1 = imagenss1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
       ImageIcon imagenIconoss1 = new ImageIcon(imagenModificadass1); 
       JLabel lblNewLabelss1 = new JLabel();
       lblNewLabelss1.setIcon(imagenIconoss1);
       lblNewLabelss1.setBounds(65, 500, 150, 150); 
       
       contentPanel.add(lblNewLabelss1);





       JPanel sidebar = new JPanel(null);
       Color colorDeFondo = new Color(0x8FEBB1);
       sidebar.setBackground(colorDeFondo); 
       sidebar.setBounds(0, 0, 300, 1050);

      contentPanel.add(sidebar);



      JPanel sidebar1 = new JPanel(null);
      Color colorDeFondo1 = new Color(0x000000);
      sidebar1.setBackground(colorDeFondo1); 
      sidebar1.setBounds(950, 0, 2, 1050);

     contentPanel.add(sidebar1);


     JPanel sidebar2 = new JPanel(null);
     Color colorDeFondo2 = new Color(0x000000);
     sidebar2.setBackground(colorDeFondo2); 
     sidebar2.setBounds(650, 0, 2, 1050);

    contentPanel.add(sidebar2);

    JPanel sidebar3 = new JPanel(null);
    Color colorDeFondo3= new Color(0x000000);
    sidebar3.setBackground(colorDeFondo3); 
    sidebar3.setBounds(340, 0, 2, 1050);

   contentPanel.add(sidebar3);




   JPanel sidebar4 = new JPanel(null);
   Color colorDeFondo4 = new Color(0x000000);
   sidebar4.setBackground(colorDeFondo4); 
   sidebar4.setBounds(1290, 0, 2, 1050);

  contentPanel.add(sidebar4);




  JPanel sidebarV1 = new JPanel(null);
  Color colorDeFondov1 = new Color(0x000000);
  sidebarV1.setBackground(colorDeFondov1); 
  sidebarV1.setBounds(342, 400, 950, 2);

 contentPanel.add(sidebarV1);


 JPanel sidebarV2 = new JPanel(null);
  Color colorDeFondov2 = new Color(0x000000);
  sidebarV2.setBackground(colorDeFondov2); 
  sidebarV2.setBounds(342, 720, 950, 2);

 contentPanel.add(sidebarV2);


 
 JPanel sidebarV3 = new JPanel(null);
  Color colorDeFondov3 = new Color(0x000000);
  sidebarV3.setBackground(colorDeFondov3); 
  sidebarV3.setBounds(342, 1050, 950, 2);

 contentPanel.add(sidebarV3);



      JButton Boton_De_Barra = new JButton("CLIENTES");
      Boton_De_Barra.setBounds(50, 20, 190, 55);
      Boton_De_Barra.setForeground(Color.BLACK);
      Boton_De_Barra.setFont(new Font("Arial", Font.BOLD, 16));

      Color colorDeFondos = new Color(0xCFE8E9);
      Boton_De_Barra.setBackground(colorDeFondos); 

      Boton_De_Barra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      Boton_De_Barra.setBorderPainted(rootPaneCheckingEnabled);
      Boton_De_Barra.setFocusPainted(false);


      sidebar.add(Boton_De_Barra);





      Boton_De_Barra.addActionListener(new ActionListener() {
        @Override
    
        public void actionPerformed(ActionEvent e) {
    
                dispose();
           Clientes newframe =new  Clientes();
    
            }
                
      
    
    });





      JButton Boton_De_Barra1 = new JButton("INICIO");
      Boton_De_Barra1.setBounds(50, 100, 190, 55);
      Boton_De_Barra1.setForeground(Color.BLACK);
      Boton_De_Barra1.setFont(new Font("Arial", Font.BOLD, 16));

      Color colorDeFondos1 = new Color(0xCFE8E9);
      Boton_De_Barra1.setBackground(colorDeFondos1); 

      Boton_De_Barra1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      Boton_De_Barra1.setBorderPainted(rootPaneCheckingEnabled);
      Boton_De_Barra1.setFocusPainted(false);


      sidebar.add(Boton_De_Barra1);



      JButton Boton_De_Barra2 = new JButton("FACTURACION");
      Boton_De_Barra2.setBounds(50, 180, 190, 55);
      Boton_De_Barra2.setForeground(Color.BLACK);
      Boton_De_Barra2.setFont(new Font("Arial", Font.BOLD, 14));

      Color colorDeFondos2 = new Color(0xCFE8E9);
      Boton_De_Barra2.setBackground(colorDeFondos); 
      
      
      Boton_De_Barra2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      Boton_De_Barra2.setBorderPainted(rootPaneCheckingEnabled);
      Boton_De_Barra2.setFocusPainted(false);


      sidebar.add(Boton_De_Barra2);



      JButton Boton_De_Barra3 = new JButton("COMENTARIOS");
      Boton_De_Barra3.setBounds(50, 270, 190, 55);
      Boton_De_Barra3.setForeground(Color.BLACK);
      Boton_De_Barra3.setFont(new Font("Arial", Font.BOLD, 14));


      Color colorDeFondos3 = new Color(0xCFE8E9);
      Boton_De_Barra3.setBackground(colorDeFondos3); 



      Boton_De_Barra3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      Boton_De_Barra3.setBorderPainted(rootPaneCheckingEnabled);
      Boton_De_Barra3.setFocusPainted(false);


      sidebar.add(Boton_De_Barra3);

     











        ImageIcon imagenIconoOriginals1 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Arroz-Campo.png");
        Image imagens1 = imagenIconoOriginals1.getImage(); 
        Image imagenModificadas1 = imagens1.getScaledInstance(250, 220, Image.SCALE_SMOOTH);
        ImageIcon imagenIconos1 = new ImageIcon(imagenModificadas1); 
        JLabel lblNewLabels1 = new JLabel();
        lblNewLabels1.setIcon(imagenIconos1);
        lblNewLabels1.setBounds(370, 140, 250, 220); 
        lblNewLabels1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contentPanel.add(lblNewLabels1);


    
        

        
        JButton Boton_De_Compra1 = new JButton("COMPRAR");
        Boton_De_Compra1.setBounds(820, 355, 90, 40);
        Boton_De_Compra1.setForeground(Color.BLACK);
        Boton_De_Compra1.setFont(new Font("Arial", Font.BOLD, 10));
        
        Color colorDeFondos9 = new Color(0x17E685);
        Boton_De_Compra1.setBackground(colorDeFondos9); 
        
        Boton_De_Compra1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra1.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra1.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra1);
        
        
        
        
        
        JButton Boton_De_CompraPs1 = new JButton("FISICO");
        Boton_De_CompraPs1.setBounds(670, 355, 90, 40);
        Boton_De_CompraPs1.setForeground(Color.BLACK);
        Boton_De_CompraPs1.setFont(new Font("Arial", Font.BOLD, 10));
        
        Color colorDeFondos10 = new Color(0xFA5E5E);
        Boton_De_CompraPs1.setBackground(colorDeFondos10); 
        
        Boton_De_CompraPs1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs1.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs1.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs1);
        
    
    
    
    






        JButton Boton_De_Compra2 = new JButton("COMPRAR");
        Boton_De_Compra2.setBounds(1140, 355, 90, 40);
        Boton_De_Compra2.setForeground(Color.BLACK);
        Boton_De_Compra2.setFont(new Font("Arial", Font.BOLD, 10));
        
        Color colorDeFondos21 = new Color(0x17E685);
        Boton_De_Compra2.setBackground(colorDeFondos21); 
        
        Boton_De_Compra2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra2.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra2.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra2);
        
        
        
        
        
        JButton Boton_De_CompraPs2 = new JButton("FISICO");
        Boton_De_CompraPs2.setBounds(990, 355, 90, 40);
        Boton_De_CompraPs2.setForeground(Color.BLACK);
        Boton_De_CompraPs2.setFont(new Font("Arial", Font.BOLD, 10));
        
        Color colorDeFondos12 = new Color(0xFA5E5E);
        Boton_De_CompraPs2.setBackground(colorDeFondos12); 
        
        Boton_De_CompraPs2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs2.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs2.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs2);






        JButton Boton_De_Compra3 = new JButton("COMPRAR");
        Boton_De_Compra3.setBounds(530, 675, 90, 40);
        Boton_De_Compra3.setForeground(Color.BLACK);
        Boton_De_Compra3.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra3.setBackground(colorDeFondos21); 
        
        Boton_De_Compra3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra3.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra3.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra3);
        
        
        
        
        
        JButton Boton_De_CompraPs3 = new JButton("FISICO");
        Boton_De_CompraPs3.setBounds(380, 675, 90, 40);
        Boton_De_CompraPs3.setForeground(Color.BLACK);
        Boton_De_CompraPs3.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_CompraPs3.setBackground(colorDeFondos12); 
        
        Boton_De_CompraPs3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs3.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs3.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs3);
        






  

        JButton Boton_De_Compra5 = new JButton("COMPRAR");
        Boton_De_Compra5.setBounds(820, 675, 90, 40);
        Boton_De_Compra5.setForeground(Color.BLACK);
        Boton_De_Compra5.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra5.setBackground(colorDeFondos9); 
        
        Boton_De_Compra5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra5.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra5.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra5);
        
        
        
        
        
        JButton Boton_De_CompraPs5 = new JButton("FISICO");
        Boton_De_CompraPs5.setBounds(670, 675, 90, 40);
        Boton_De_CompraPs5.setForeground(Color.BLACK);
        Boton_De_CompraPs5.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_CompraPs5.setBackground(colorDeFondos10); 
        
        Boton_De_CompraPs5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs5.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs5.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs5);
        



        JButton Boton_De_Compra4 = new JButton("COMPRAR");
        Boton_De_Compra4.setBounds(1140, 675, 90, 40);
        Boton_De_Compra4.setForeground(Color.BLACK);
        Boton_De_Compra4.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra4.setBackground(colorDeFondos21); 
        
        Boton_De_Compra4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra4.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra4.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra4);
        
        
        
        
        
        JButton Boton_De_CompraPs4 = new JButton("FISICO");
        Boton_De_CompraPs4.setBounds(990, 675, 90, 40);
        Boton_De_CompraPs4.setForeground(Color.BLACK);
        Boton_De_CompraPs4.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_CompraPs4.setBackground(colorDeFondos12); 
        
        Boton_De_CompraPs4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs4.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs4.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs4);











        JButton Boton_De_Compra6 = new JButton("COMPRAR");
        Boton_De_Compra6.setBounds(530, 1006, 90, 40);
        Boton_De_Compra6.setForeground(Color.BLACK);
        Boton_De_Compra6.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra6.setBackground(colorDeFondos21); 
        
        Boton_De_Compra6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra6.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra6.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra6);
        
        
        
        
        
        JButton Boton_De_CompraPs6 = new JButton("FISICO");
        Boton_De_CompraPs6.setBounds(380, 1006, 90, 40);
        Boton_De_CompraPs6.setForeground(Color.BLACK);
        Boton_De_CompraPs6.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_CompraPs6.setBackground(colorDeFondos12); 
        
        Boton_De_CompraPs6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs6.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs6.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs6);
        





        JButton Boton_De_Compra7 = new JButton("COMPRAR");
        Boton_De_Compra7.setBounds(1140, 1006, 90, 40);
        Boton_De_Compra7.setForeground(Color.BLACK);
        Boton_De_Compra7.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra7.setBackground(colorDeFondos21); 
        
        Boton_De_Compra7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra7.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra7.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra7);
        
        
        
        
        
        JButton Boton_De_CompraPs7 = new JButton("FISICO");
        Boton_De_CompraPs7.setBounds(990, 1006, 90, 40);
        Boton_De_CompraPs7.setForeground(Color.BLACK);
        Boton_De_CompraPs7.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_CompraPs7.setBackground(colorDeFondos12); 
        
        Boton_De_CompraPs7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs7.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs7.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs7);









        JButton Boton_De_Compra8 = new JButton("COMPRAR");
        Boton_De_Compra8.setBounds(820, 1006, 90, 40);
        Boton_De_Compra8.setForeground(Color.BLACK);
        Boton_De_Compra8.setFont(new Font("Arial", Font.BOLD, 10));
        
        Boton_De_Compra8.setBackground(colorDeFondos9); 
        
        Boton_De_Compra8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_Compra8.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_Compra8.setFocusPainted(false);
        
        
        
        contentPanel.add(Boton_De_Compra8);
        
        
        
        
        
        JButton Boton_De_CompraPs8 = new JButton("FISICO");
        Boton_De_CompraPs8.setBounds(670, 1006, 90, 40);
        Boton_De_CompraPs8.setForeground(Color.BLACK);
        Boton_De_CompraPs8.setFont(new Font("Arial", Font.BOLD, 10));
      
        Boton_De_CompraPs8.setBackground(colorDeFondos10); 
        
        Boton_De_CompraPs8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Boton_De_CompraPs8.setBorderPainted(rootPaneCheckingEnabled);
        Boton_De_CompraPs8.setFocusPainted(false);
        
        
        
        
        contentPanel.add(Boton_De_CompraPs8);





        ImageIcon imagenIconoOriginals2 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Leche.png");
        Image imagens2 = imagenIconoOriginals2.getImage(); 
        Image imagenModificadas2 = imagens2.getScaledInstance(190, 190, Image.SCALE_SMOOTH); 
        ImageIcon imagenIconos2 = new ImageIcon(imagenModificadas2); 
        JLabel lblNewLabels2 = new JLabel();
        lblNewLabels2.setIcon(imagenIconos2);
        lblNewLabels2.setBounds(706, 165, 190, 150); 
        lblNewLabels2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    contentPanel.add(lblNewLabels2);


    ImageIcon imagenIconoOriginals3 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Papel-Higienico.png");
    Image imagens3 = imagenIconoOriginals3.getImage(); 
    Image imagenModificadas3 = imagens3.getScaledInstance(240, 200, Image.SCALE_SMOOTH); 
    ImageIcon imagenIconos3 = new ImageIcon(imagenModificadas3); 
    JLabel lblNewLabels3 = new JLabel();
    lblNewLabels3.setIcon(imagenIconos3);
    lblNewLabels3.setBounds(990, 150, 240, 220); 
    lblNewLabels3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    contentPanel.add(lblNewLabels3);





    ImageIcon imagenIconoOriginals4 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Galon de cloro.png");
    Image imagens4 = imagenIconoOriginals4.getImage(); 
    Image imagenModificadas4 = imagens4.getScaledInstance(200, 190, Image.SCALE_SMOOTH);
    ImageIcon imagenIconos4 = new ImageIcon(imagenModificadas4); 
    JLabel lblNewLabels4 = new JLabel();
    lblNewLabels4.setIcon(imagenIconos4);
    lblNewLabels4.setBounds(405, 450, 200, 190); 
    lblNewLabels4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    contentPanel.add(lblNewLabels4);







    ImageIcon imagenIconoOriginals5 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Harina de trigo.png");
    Image imagens5 = imagenIconoOriginals5.getImage(); 
    Image imagenModificadas5 = imagens5.getScaledInstance(240, 290, Image.SCALE_SMOOTH); 
    ImageIcon imagenIconos5 = new ImageIcon(imagenModificadas5); 
    JLabel lblNewLabels5 = new JLabel();
    lblNewLabels5.setIcon(imagenIconos5);
    lblNewLabels5.setBounds(690, 420, 240, 220); 
    lblNewLabels5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    contentPanel.add(lblNewLabels5);


    ImageIcon imagenIconoOriginals6 = new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Carton de Huevo.png");
    Image imagens6 = imagenIconoOriginals6.getImage(); 
    Image imagenModificadas6 = imagens6.getScaledInstance(340, 300, Image.SCALE_SMOOTH); 
    ImageIcon imagenIconos6 = new ImageIcon(imagenModificadas6); 
    JLabel lblNewLabels6 = new JLabel();
    lblNewLabels6.setIcon(imagenIconos6);
    lblNewLabels6.setBounds(950, 390, 340, 320); 
    lblNewLabels6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    contentPanel.add(lblNewLabels6);







    JButton Boton_De_Compra = new JButton("COMPRAR");
    Boton_De_Compra.setBounds(530, 355, 90, 40);
    Boton_De_Compra.setForeground(Color.BLACK);
    Boton_De_Compra.setFont(new Font("Arial", Font.BOLD, 10));
    
    Color colorDeFondos22 = new Color(0x17E685);
    Boton_De_Compra.setBackground(colorDeFondos22); 
    
    Boton_De_Compra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton_De_Compra.setBorderPainted(rootPaneCheckingEnabled);
    Boton_De_Compra.setFocusPainted(false);
    
    
    
    contentPanel.add(Boton_De_Compra);
    
    
    
    
    
    JButton Boton_De_CompraPs = new JButton("FISICO");
    Boton_De_CompraPs.setBounds(380, 355, 90, 40);
    Boton_De_CompraPs.setForeground(Color.BLACK);
    Boton_De_CompraPs.setFont(new Font("Arial", Font.BOLD, 10));
    
    Color colorDeFondos13 = new Color(0xFA5E5E);
    Boton_De_CompraPs.setBackground(colorDeFondos13); 
    
    Boton_De_CompraPs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton_De_CompraPs.setBorderPainted(rootPaneCheckingEnabled);
    Boton_De_CompraPs.setFocusPainted(false);
    
    
    
    
    contentPanel.add(Boton_De_CompraPs);
    
    
    






















    JButton Boton1 = new JButton("Arroz Campo");
    Boton1.setBounds(430, 300, 150, 55);
    Boton1.setForeground(Color.BLACK);
    Boton1.setFont(new Font("Super Positive", Font.BOLD, 14));
    Boton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton1.setFocusPainted(false);
    Boton1.setBackground(Color.WHITE);
    Boton1.setBorderPainted(false);


 contentPanel.add(Boton1);






    JButton Boton2 = new JButton("Leche Milk");
    Boton2.setBounds(720, 300, 150, 55);
    Boton2.setForeground(Color.BLACK);
    Boton2.setFont(new Font("Super Positive", Font.BOLD, 14));
    Boton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton2.setFocusPainted(false);
    Boton2.setBackground(Color.WHITE);
Boton2.setBorderPainted(false);


contentPanel.add(Boton2);




    
    JButton Boton3 = new JButton("Papel Higienico");
    Boton3.setBounds(1035, 300, 150, 55);
    Boton3.setForeground(Color.BLACK);
    Boton3.setFont(new Font("Super Positive", Font.BOLD, 14));
    Boton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    Boton3.setFocusPainted(false);
    Boton3.setBackground(Color.WHITE);
Boton3.setBorderPainted(false);
    Boton3.setBorderPainted(false);


contentPanel.add(Boton3);



JButton Boton4 = new JButton("CLORO");
Boton4.setBounds(430, 620, 150, 55);
Boton4.setForeground(Color.BLACK);
Boton4.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton4.setFocusPainted(false);
Boton4.setBackground(Color.WHITE);
Boton4.setBorderPainted(false);
Boton4.setBorderPainted(false);


contentPanel.add(Boton4);





JButton Boton5 = new JButton("HUEVOS");
Boton5.setBounds(1035, 620, 150, 55);
Boton5.setForeground(Color.BLACK);
Boton5.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton5.setFocusPainted(false);
Boton5.setBackground(Color.WHITE);
Boton5.setBorderPainted(false);
Boton5.setBorderPainted(false);


contentPanel.add(Boton5);




JButton Boton6 = new JButton("Harina de Trigo");
Boton6.setBounds(740, 620, 150, 55);
Boton6.setForeground(Color.BLACK);
Boton6.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton6.setFocusPainted(false);
Boton6.setBackground(Color.WHITE);
Boton6.setBorderPainted(false);
Boton6.setBorderPainted(false);


contentPanel.add(Boton6);



JButton Boton7 = new JButton("Aceite Vegetal Crisol");
Boton7.setForeground(Color.BLACK);
Boton7.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton7.setFocusPainted(false);
Boton7.setBackground(Color.WHITE);
Boton7.setBorderPainted(false);


contentPanel.add(Boton7);




ImageIcon imagenIconoOriginals7= new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Aceite-Vegetal-Crisol.png");
Image imagens7 = imagenIconoOriginals7.getImage(); 
Image imagenModificadas7 = imagens7.getScaledInstance(190, 190, Image.SCALE_SMOOTH); 
ImageIcon imagenIconos7 = new ImageIcon(imagenModificadas7); 
JLabel lblNewLabels7 = new JLabel();
lblNewLabels7.setIcon(imagenIconos7);
lblNewLabels7.setBounds(710, 920, 140, 120); 
lblNewLabels7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
contentPanel.add(lblNewLabels7);




JButton Boton8 = new JButton("café santo domingo");
Boton8.setForeground(Color.BLACK);
Boton8.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton8.setFocusPainted(false);
Boton8.setBackground(Color.WHITE);
Boton8.setBorderPainted(false);


contentPanel.add(Boton8);




ImageIcon imagenIconoOriginals8= new ImageIcon("Baratie\\src\\Imagenes\\Productos\\café santo domingo.png");
Image imagens8 = imagenIconoOriginals8.getImage(); 
Image imagenModificadas8 = imagens8.getScaledInstance(200, 190, Image.SCALE_SMOOTH); 
ImageIcon imagenIconos8 = new ImageIcon(imagenModificadas8); 
JLabel lblNewLabels8 = new JLabel();
lblNewLabels8.setIcon(imagenIconos8);
lblNewLabels8.setBounds(580, 920, 200, 120); 
lblNewLabels8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

contentPanel.add(lblNewLabels8);






JButton Boton9 = new JButton("Harina de Maíz Amarillo P.A.N.");
Boton9.setForeground(Color.BLACK);
Boton9.setFont(new Font("Super Positive", Font.BOLD, 14));
Boton9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
Boton9.setFocusPainted(false);
Boton9.setBackground(Color.WHITE);
Boton9.setBorderPainted(false);


contentPanel.add(Boton9);




ImageIcon imagenIconoOriginals9= new ImageIcon("Baratie\\src\\Imagenes\\Productos\\Harina de Maíz Amarillo P.A.N..png");
Image imagens9 = imagenIconoOriginals9.getImage(); 
Image imagenModificadas9 = imagens9.getScaledInstance(200, 190, Image.SCALE_SMOOTH); 
ImageIcon imagenIconos9 = new ImageIcon(imagenModificadas9); 
JLabel lblNewLabels9 = new JLabel();
lblNewLabels9.setIcon(imagenIconos9);
lblNewLabels9.setBounds(690, 920, 200, 120); 
lblNewLabels9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

contentPanel.add(lblNewLabels9);




lblNewLabels2.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels2.setOpaque(true);
        JOptionPane.showMessageDialog(null,"RD$80.00");

    }
});



lblNewLabels3.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels3.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$310.00");

    }
});





    
lblNewLabels1.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels1.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$409.00");

    }
});






    
lblNewLabels7.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels7.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$570.00");

    }
});



lblNewLabels8.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels8.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$135.00");

    }
});


lblNewLabels9.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels9.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$65.00");

    }
});





    
lblNewLabels4.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels4.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$105.00");

    }
});



lblNewLabels5.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels5.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$85.00");

    }
});



lblNewLabels6.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels6.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$255.00");

    }
});




lblNewLabels1.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        lblNewLabels1.setOpaque(true);
        JOptionPane.showMessageDialog(null,"$409.00");

    }
});




Boton_De_CompraPs.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs1.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs2.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs3.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs4.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs5.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});


Boton_De_CompraPs6.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs7.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});

Boton_De_CompraPs8.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            ComprarPs1 newframe =new ComprarPs1();


        }
    
});








Boton_De_Compra.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra1.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra2.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra3.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra4.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra5.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});


Boton_De_Compra6.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra7.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});

Boton_De_Compra8.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comprar newframe =new Comprar();


        }
    
});


Boton_De_Barra3.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            Comentarios newframe =new Comentarios();


        }
    
});





Boton_De_Barra1.addActionListener(new ActionListener() {
    @Override

    public void actionPerformed(ActionEvent e) {

            dispose();
            inicio newframe =new inicio();


        }
    
});




JPanel grupoPanel = new JPanel();
grupoPanel.setLayout(null);
grupoPanel.setBackground(Color.white);

grupoPanel.setBounds(400, 720, 290, 920); 

lblNewLabels7.setBounds(10, 0, 640, 320);
grupoPanel.add(lblNewLabels7);


Boton7.setBounds(0, 230, 210, 55); 
grupoPanel.add(Boton7);

contentPanel.add(grupoPanel);


JPanel grupoPanel2 = new JPanel();
grupoPanel2.setLayout(null);
grupoPanel2.setBackground(Color.white);

grupoPanel2.setBounds(690, 720, 340, 920); 

lblNewLabels8.setBounds(15, 0, 540, 320);
grupoPanel2.add(lblNewLabels8);


Boton8.setBounds(0, 230, 250, 55); 
grupoPanel2.add(Boton8);

contentPanel.add(grupoPanel2);




JPanel grupoPanel3 = new JPanel();
grupoPanel3.setLayout(null);
grupoPanel3.setBackground(Color.white);

grupoPanel3.setBounds(1010, 720, 340, 920); 

lblNewLabels9.setBounds(10, 0, 540, 320);
grupoPanel3.add(lblNewLabels9);


Boton9.setBounds(0, 230, 250, 55); 
grupoPanel3.add(Boton9);

contentPanel.add(grupoPanel3);





        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(0, 0, 1200, 800);

        setLayout(new BorderLayout()); 
        add(scrollPane, BorderLayout.CENTER); 

        setVisible(true);
    }






















    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Principal());
    }
}
