package finalproject;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MapGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MapGUI frame = new MapGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MapGUI() {
		setFont(new Font("Brush Script MT", Font.PLAIN, 32));
		setTitle("MAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JLabel lblNewLabel = new JLabel("Hospital");
		lblNewLabel.setFont(new Font("Brush Script MT", Font.PLAIN, 32));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LINSANITY\\Desktop\\JAVA\\期末專題\\picture\\s.jpg"));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("TrainStation");
		lblNewLabel_1.setFont(new Font("Brush Script MT", Font.PLAIN, 32));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\LINSANITY\\Desktop\\JAVA\\期末專題\\picture\\t.jpg"));
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);
		
		JLabel lblNewLabel_2 = new JLabel("Country");
		lblNewLabel_2.setFont(new Font("Brush Script MT", Font.PLAIN, 32));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\LINSANITY\\Desktop\\JAVA\\期末專題\\picture\\c.jpg"));
		getContentPane().add(lblNewLabel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("School");
		lblNewLabel_3.setFont(new Font("Brush Script MT", Font.PLAIN, 32));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\LINSANITY\\Desktop\\JAVA\\期末專題\\picture\\h.jpg"));
		getContentPane().add(lblNewLabel_3, BorderLayout.CENTER);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
	
		/*JLabel jlb = new JLabel(); 
		int width = 100,height = 100;	
		ImageIcon image = new ImageIcon("C:\\Users\\LINSANITY\\Desktop\\JAVA\\期末專題\\picture\\c.jpg");	
		image.setImage(image.getImage().getScaledInstance(width, height,Image.SCALE_DEFAULT ));
		jlb.setIcon(image);
		jlb.setSize(width, height);
		contentPane.add(jlb, BorderLayout.NORTH);*/
	}

}
