package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.HomePageController;
import controller.quizController;

public class HomePage extends JFrame {

	private JPanel contentPane;
	

	
	protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Bán kính cong 20 pixel
        super.paintComponents(g);
    }
    
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20); // Bán kính cong 20 pixel
    }

	public HomePage() {

		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Dell\\Downloads\\BTLJava-main\\BTLJava-main\\src\\view\\icon.png");
		Image i = imageIcon.getImage();
		Image new_img = i.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		imageIcon = new ImageIcon(new_img);
		

		ImageIcon imageIcon_2 = new ImageIcon("C:\\Users\\Dell\\Downloads\\BTLJava-main\\BTLJava-main\\src\\view\\logoQuiz.png");
		Image i_2 = imageIcon_2.getImage();
		Image new_img_2 = i_2.getScaledInstance(400, 91, Image.SCALE_SMOOTH);
		imageIcon_2 = new ImageIcon(new_img_2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(50, 10, 1405, 783);
		JPanel jpanel = new JPanel();
		jpanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		jpanel.setBackground(new Color(70, 26, 66));
		jpanel.setForeground(new Color(255, 255, 255));
		this.setContentPane(jpanel);
		jpanel.setLayout(new BorderLayout(0, 0));

		JPanel jpanel_1 = new JPanel();
		jpanel.add(jpanel_1, BorderLayout.CENTER);
		jpanel_1.setLayout(new GridLayout(2, 1, 0, 0));

		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 26, 66));
		panel_2.setLayout(new BorderLayout(0, 0));

		
		
		JLabel jlabel_1 = new JLabel("");
		jlabel_1.setForeground(new Color(255, 255, 255));
		jlabel_1.setBackground(new Color(70, 26, 66));
		jlabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel_1.setFont(new Font("Gabriola", Font.BOLD, 99));
//		jlabel_2.setIcon(imageIcon);
		jlabel_1.setIcon(imageIcon_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 26, 66));

		
		ActionListener ac = new HomePageController(this);
		JButton jbutton = new JButton("Play");
		jbutton.addActionListener(ac);
		jbutton.setBackground(new Color(0, 201, 133));
		jbutton.setFont(new Font("Sitka Text", Font.BOLD, 35));
		jbutton.setFocusable(false);
		jbutton.setBackground(new Color(0,201,133));
		jbutton.setForeground(Color.white);
		jpanel_1.add(panel_2);
		jpanel_1.add(panel_3);
		panel_2.add(jlabel_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(76, 26, 66));
		panel_2.add(panel_2_1, BorderLayout.NORTH);
		panel_2_1.setLayout(null);
		
		JLabel jlabel_2 = new JLabel();
		jlabel_2.setBounds(20, 20, 100, 100);
		jlabel_2.setIcon(imageIcon);
		
//		panel_2_1.add(jlabel_2);
		panel_3.add(jbutton);
		jlabel_1.add(jlabel_2);
		
		JLabel jlabel_3 = new JLabel("Ready to play ?");
		jlabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		jlabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		jlabel_3.setFont(new Font("Gabriola", Font.BOLD, 70));
		jlabel_3.setForeground(new Color(255, 255, 255));
		panel_2.add(jlabel_3, BorderLayout.SOUTH);
		
		this.setTitle("Quiz Game");
		this.setLocation(250, 130);
		this.setSize(1000, 600);
		
		this.setVisible(true);
		
	}

	
}