import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Statement;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

// import java.awt.event;
// import java.applet.*;

public class Id implements ActionListener {
    public JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, lp, l11, l12, l13, l14;
    public JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
    public JButton b1, b2, b3, b4;
    JFrame f;
    String path;

    // private ImageIcon format=null;
    // String fname=null;
    // int s=0;
    // byte[] pimage=null;
    // int lvalue = 1000;

    public void Idcard() {

        f = new JFrame("Details");
        // Color c = new Color();

        // f.getContentPane().setBackground(Color.cyan);
        f.getContentPane().setBackground(Color.decode("#FFF0F5"));
        // Font f1 = new Font("Verdana",Font.BOLD,10);
        // Font f2 = new Font("Verdana",Font.PLAIN,20);
        Font f3 = new Font("Tahoma", Font.BOLD, 17);

        l1 = new JLabel("Student name : ");
        l2 = new JLabel("Reg No :");
        l3 = new JLabel("Valid upto :");
        l4 = new JLabel("Departement :");
        l5 = new JLabel("Blood group :");
        l6 = new JLabel("Date of birth:");
        l7 = new JLabel("Phone no :");
        l8 = new JLabel("Hos/Day :");
        l9 = new JLabel("Father's name:");
        l10 = new JLabel("Address:");
        l11 = new JLabel("Upload image :");
        lp = new JLabel();
        l12 = new JLabel();
        l12.setIcon(new ImageIcon("D:\\gitscam\\idCard\\scad2.png"));
        l13 = new JLabel();
        l13.setIcon(new ImageIcon("D:\\gitScam\\idCard\\idfxec2.png"));
        // l14 = new JLabel("GENERATOR");

        l1.setBounds(50, 50, 140, 30);
        l2.setBounds(50, 120, 140, 30);
        l3.setBounds(50, 190, 140, 30);
        l4.setBounds(50, 260, 140, 30);
        l5.setBounds(50, 330, 140, 30);
        l6.setBounds(480, 50, 140, 30);
        l7.setBounds(480, 120, 140, 30);
        l8.setBounds(480, 190, 140, 30);
        l9.setBounds(480, 260, 140, 30);
        l10.setBounds(480, 330, 140, 30);
        l11.setBounds(50, 400, 140, 30);
        l12.setBounds(920, 150, 200, 200);
        lp.setBounds(150, 200, 120, 140);
        l13.setBounds(890, 360, 500, 50);
        // l14.setBounds(960,390,400,50);

        l1.setFont(f3);
        l2.setFont(f3);
        l3.setFont(f3);
        l4.setFont(f3);
        l5.setFont(f3);
        l6.setFont(f3);
        l7.setFont(f3);
        l8.setFont(f3);
        l9.setFont(f3);
        l10.setFont(f3);
        l11.setFont(f3);

        // l13.setFont(f1);
        // l13.setFont(f2);
        // // l13.setFont(f3);
        // l13.setForeground(Color.blue);

        // l14.setFont(f1);
        // l14.setFont(f2);
        // // l14.setFont(f3);
        // l14.setForeground(Color.blue);

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t1.setBounds(270, 50, 100, 30);
        t2.setBounds(270, 120, 100, 30);
        t3.setBounds(270, 190, 100, 30);
        t4.setBounds(270, 260, 100, 30);
        t5.setBounds(270, 330, 100, 30);
        t6.setBounds(700, 50, 100, 30);
        t7.setBounds(700, 120, 100, 30);
        t8.setBounds(700, 190, 100, 30);
        t9.setBounds(700, 260, 100, 30);
        t10.setBounds(700, 330, 100, 30);

        b1 = new JButton("Save");
        b2 = new JButton("Clear");
        b3 = new JButton("Upload");
        b4 = new JButton("empty");

        b1.setBounds(270, 520, 100, 30); // save
        b2.setBounds(710, 520, 100, 30); // cancel
        b3.setBounds(270, 400, 100, 30); // upload
        b4.setBounds(300, 100, 100, 30);
        b3.setBackground(Color.white);
        b1.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        // f.add(l14);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);
        f.add(t8);
        f.add(t9);
        f.add(t10);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(1580, 1080);
        // f.setSize(1580,1080);
        f.setLocationRelativeTo(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
                file.addChoosableFileFilter(filter);
                int result = file.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = file.getSelectedFile();
                    path = selectedFile.getAbsolutePath();
                    lp.setIcon(ResizeImage(path));
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    System.out.println("No File Select");
                }
            }
        });

    }

    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lp.getWidth(), lp.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        if (s == b1) {
            Data.t1 = t1.getText();
            System.out.println(Data.t1);
            Data.t2 = t2.getText();
            System.out.println(Data.t2);
            Data.t3 = t3.getText();
            System.out.println(Data.t3);
            Data.t4 = t4.getText();
            System.out.println(Data.t4);
            Data.t5 = t5.getText();
            System.out.println(Data.t5);
            Data.t6 = t6.getText();
            System.out.println(Data.t6);
            Data.t7 = t7.getText();
            System.out.println(Data.t7);
            Data.t8 = t8.getText();
            System.out.println(Data.t8);
            Data.t9 = t9.getText();
            System.out.println(Data.t9);
            Data.t10 = t10.getText();
            System.out.println(Data.t10);
            Data.lp = lp.getIcon();
            System.out.println(Data.lp);
            new Displayid().Idshow();
            f.dispose();
            String studentname = t1.getText();
            String regno = t2.getText();
            String valid = t3.getText();
            String dept = t4.getText();
            String bg = t5.getText();
            String dob = t6.getText();
            String phone = t7.getText();
            String hosorday = t8.getText();
            String father = t9.getText();
            String address = t10.getText();
            String image = path;
            image = image.replace("\\", "\\\\");
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Driver found");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/id", "root", "");
                System.out.println("Connected");
                Statement st = con.createStatement();
                st.executeUpdate("insert into idtable values('" + studentname + "','" + regno + "','" + valid + "','"
                        + dept + "','" + bg + "','" + dob + "','" + phone + "','" + hosorday + "','" + father + "','"
                        + address + "','" + image + "')");
                System.out.println("Added");
            } catch (Exception ae) {
                System.out.println("Driver not found");
            }
        }
    }

    public static void main(String[] args) {
        new Id().Idcard();

    }
}
