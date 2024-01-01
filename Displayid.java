import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Displayid {

    public void Idshow() {

        JLabel lp, l0, l01, l02, l03, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18,
                l19, l20, l21, l22, l23, l24, l25, l26, l27;
        JPanel p = new JPanel();
        // Photo
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel(); // Pink

        Font f1 = new Font("Verdana", Font.BOLD, 25);
        Font f2 = new Font("Serif", Font.PLAIN, 5);
        Font f3 = new Font("Serif", Font.BOLD, 15);
        Font f4 = new Font("Serif", Font.PLAIN, 5);
        Font f5 = new Font("Serif", Font.BOLD, 15);
        // Font f6 = new Font("Verdana",Font.BOLD,10);

        p.setBounds(240, 70, 350, 550);
        p.setBackground(Color.white);

        p2.setBounds(790, 70, 350, 550);
        p2.setBackground(Color.white);
        // p3.setBounds(300,200,50,200);
        // p3.setBackground(Color.pink);

        // ImageIcon i = new ImageIcon(getClass().getResource("fxlogo.png"));

        JFrame f = new JFrame("ID CARD ");
        // f.getContentPane().setBackground(Color.decode("#FFE4E1"));
        // f.getContentPane().setBackground(Color.decode("#000080"));
        f.getContentPane().setBackground(Color.CYAN);
        l0 = new JLabel("  ISO 9001:2015 Certified|DST-FIST Supported Institution");
        l01 = new JLabel(" Recognized under Section 2(f) & 12(B) of the UGC Act. 1956");
        l02 = new JLabel("  Vannarpettai,Tirunelveli-627003,TamilNadu");
        l03 = new JLabel("Principal");
        // l04 = new JLabel("vel");
        l1 = new JLabel(Data.t1);
        l2 = new JLabel(Data.t2);
        l3 = new JLabel("Valid upto : " + Data.t3);
        l4 = new JLabel("Departement                     :     " + Data.t4);
        l5 = new JLabel("Blood group                       :     " + Data.t5);
        l6 = new JLabel("Date of birth                       :     " + Data.t6);
        l7 = new JLabel("Phone no                            :     " + Data.t7);
        l8 = new JLabel("Hostler/DayScholar          :     " + Data.t8);
        l9 = new JLabel("Father's name                    :     " + Data.t9);
        l10 = new JLabel("Address                               :     " + Data.t10);
        l11 = new JLabel("Instruction :");
        l12 = new JLabel("1.Possession of identity card is mandatory In Fxec campus.");
        l13 = new JLabel("2.In case this card is lost/found kindly Inform/return to Fxec");
        l14 = new JLabel("Central Library");
        l15 = new JLabel("3.Do not bend this smart card");
        l16 = new JLabel("Holders Signature");
        l17 = new JLabel("________________________________________________________");
        l18 = new JLabel("FRANCIS XAVIER ENGINEERING COLLEGE");
        l19 = new JLabel("103/G2,Bypass Road,vannarpet");
        l20 = new JLabel("Tirunelveli 627003,Tamilnadu,India");
        l21 = new JLabel("Phone : +91 462 2502283 , 2502157");
        l22 = new JLabel("Fax : +91 462 2501007");
        l23 = new JLabel("Email : principal@Francisxavier.ac.in");
        l24 = new JLabel("www.francisxavier.ac.in");
        l25 = new JLabel();
        l25.setIcon(new ImageIcon("D:\\gitscam\\idCard\\fxlogo.png"));
        l26 = new JLabel();
        l26.setIcon(new ImageIcon("D:\\gitscam\\idCard\\becsesame.jpg"));
        l27 = new JLabel();
        l27.setIcon(new ImageIcon("D:\\gitscam\\idCard\\pink box 2.jpg"));
        lp = new JLabel(Data.lp);

        lp.setBounds(120, 200, 120, 140);// photo
        l0.setBounds(15, 100, 500, 30);
        l01.setBounds(5, 120, 500, 30);
        l02.setBounds(40, 140, 500, 30);
        l03.setBounds(270, 500, 100, 30);
        // l04.setBounds(270,485,100,30);
        l1.setBounds(150, 360, 500, 30);
        l2.setBounds(150, 390, 500, 30);
        l3.setBounds(110, 420, 500, 30);
        l4.setBounds(10, 20, 500, 30);
        l5.setBounds(10, 45, 500, 30);
        l6.setBounds(10, 70, 500, 30);
        l7.setBounds(10, 95, 500, 30);
        l8.setBounds(10, 120, 500, 30);
        l9.setBounds(10, 145, 500, 30);
        l10.setBounds(10, 170, 500, 30);
        l11.setBounds(10, 200, 100, 30);
        l12.setBounds(10, 220, 500, 50);
        l13.setBounds(10, 245, 500, 50);
        l14.setBounds(10, 270, 500, 50);
        l15.setBounds(10, 295, 500, 50);
        l16.setBounds(230, 325, 120, 30);
        l17.setBounds(0, 350, 500, 30);
        l18.setBounds(15, 375, 500, 40);
        l19.setBounds(70, 400, 500, 40);
        l20.setBounds(60, 420, 500, 40);
        l21.setBounds(60, 440, 500, 40);
        l22.setBounds(100, 460, 500, 40);
        l23.setBounds(60, 480, 500, 40);
        l24.setBounds(100, 500, 500, 40);
        l25.setBounds(-10, -5, 400, 100);
        l26.setBounds(315, 200, 150, 200);
        l27.setBounds(-80, 140, 500, 600);

        l1.setForeground(Color.red);
        // lp.setBackground(Color.CYAN);
        // l1.setFont(f6);
        // l2.setForeground(Color.red);
        // l2.setFont(f6);
        // l3.setForeground(Color.red);
        // l3.setFont(f6);
        // l4.setFont(f6);
        // l5.setFont(f6);
        // l6.setFont(f6);
        // l7.setFont(f6);
        // l8.setFont(f6);
        // l9.setFont(f6);
        // l10.setFont(f6);
        // l11.setFont(f6);
        // l12.setFont(f6);
        // l13.setFont(f6);
        // l14.setFont(f6);
        // l15.setFont(f6);
        // l16.setFont(f6);

        l17.setFont(f1);
        l18.setFont(f2);
        l18.setFont(f3);
        l18.setForeground(Color.red);
        l19.setFont(f4);
        l20.setFont(f4);
        l21.setFont(f4);
        l22.setFont(f4);
        l23.setFont(f4);
        l24.setFont(f4);
        l19.setFont(f5);
        l20.setFont(f5);
        l21.setFont(f5);
        l22.setFont(f5);
        l23.setFont(f5);
        l24.setFont(f5);

        f.add(p);
        f.add(lp);
        f.add(p2);
        f.add(p3);
        p.add(lp);
        p.add(p3);
        p.add(l0);
        p.add(l01);
        p.add(l02);
        p.add(l03);
        // p.add(l04);
        p.add(l1);
        p.add(l2);
        p.add(l3);
        p2.add(l4);
        p2.add(l5);
        p2.add(l6);
        p2.add(l7);
        p2.add(l8);
        p2.add(l9);
        p2.add(l10);
        p2.add(l11);
        p2.add(l12);
        p2.add(l13);
        p2.add(l14);
        p2.add(l15);
        p2.add(l16);
        p2.add(l17);
        p2.add(l18);
        p2.add(l19);
        p2.add(l20);
        p2.add(l21);
        p2.add(l22);
        p2.add(l23);
        p2.add(l24);
        p.add(l25);
        p.add(l26);
        p.add(l27);

        p.setLayout(null);
        p.setVisible(true);
        p2.setLayout(null);
        p2.setVisible(true);
        p3.setLayout(null);
        p3.setVisible(true);

        f.setLayout(null);
        f.setSize(1650, 1080);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Displayid().Idshow();
    }
}