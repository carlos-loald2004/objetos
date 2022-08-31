package fifa;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class Menu_principal extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel contet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu_principal frame = new Menu_principal();
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
	public Menu_principal() {
		componentes();
		Equipo p1 = new Equipo();
		p1.setSize(680, 420);	
		p1.setLocation(0,0);
		
		contet.removeAll();
		contet.add(p1, BorderLayout.CENTER);
		contet.revalidate();
		contet.repaint(); 
	}
	
	public void componentes() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 363, 800);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 0, 153));
		panel_1.setBounds(0, 0, 361, 800);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 75, 361, 100);
		panel_1.add(lblNewLabel);
		
		JPanel btnequipo = new JPanel();
		btnequipo.setBackground(new Color(0, 51, 204));
		btnequipo.setBounds(0, 303, 361, 64);
		panel_1.add(btnequipo);
		btnequipo.setLayout(null);
		
		JLabel txtequipo = new JLabel("  Mi equipo");
		txtequipo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnequipo.setBackground(Color.WHITE);
				txtequipo.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnequipo.setBackground(new Color(0,102,204));
				txtequipo.setForeground(Color.WHITE);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
					
				

				
				
				
			}
			
		});
		txtequipo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtequipo.setBackground(new Color(0, 0, 255));
		txtequipo.setBorder(null);
		txtequipo.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/jugador (1).png")));
		txtequipo.setHorizontalAlignment(SwingConstants.CENTER);
		txtequipo.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		txtequipo.setForeground(Color.WHITE);
		txtequipo.setBounds(0, 0, 361, 64);
		btnequipo.add(txtequipo);
		
		JPanel btnpar = new JPanel();
		btnpar.setBackground(new Color(0, 51, 204));
		btnpar.setBounds(0, 367, 361, 64);
		panel_1.add(btnpar);
		btnpar.setLayout(null);
		
		JLabel txtpar = new JLabel("  Partidos diarios");
		txtpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnpar.setBackground(Color.WHITE);
				txtpar.setForeground(Color.BLACK);
			
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnpar.setBackground(new Color(0,102,204));
				txtpar.setForeground(Color.WHITE);
			}
		});
		txtpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtpar.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/26bd.png")));
		txtpar.setHorizontalAlignment(SwingConstants.CENTER);
		txtpar.setForeground(Color.WHITE);
		txtpar.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		txtpar.setBounds(0, 0, 361, 64);
		btnpar.add(txtpar);
		
		JPanel btntor = new JPanel();
		btntor.setBackground(new Color(0, 51, 204));
		btntor.setBounds(0, 431, 361, 64);
		panel_1.add(btntor);
		btntor.setLayout(null);
		
		JLabel txttor = new JLabel("  Torneo principal");
		txttor.setBounds(0, 0, 361, 64);
		btntor.add(txttor);
		txttor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btntor.setBackground(Color.WHITE);
				txttor.setForeground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btntor.setBackground(new Color(0,102,204));
				txttor.setForeground(Color.WHITE);
			}
		});
		txttor.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txttor.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/jugador.png")));
		txttor.setForeground(Color.WHITE);
		txttor.setHorizontalAlignment(SwingConstants.CENTER);
		txttor.setFont(new Font("Roboto Mono Medium", Font.BOLD, 20));
		
		JPanel btntien = new JPanel();
		btntien.setBackground(new Color(0, 51, 204));
		btntien.setBounds(0, 493, 361, 64);
		panel_1.add(btntien);
		btntien.setLayout(null);
		
		JLabel txttien = new JLabel("  Tienda");
		txttien.setBounds(0, 0, 361, 64);
		btntien.add(txttien);
		txttien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btntien.setBackground(Color.WHITE);
				txttien.setForeground(Color.BLACK);
			}
			
			
			@Override
			public void mouseExited(MouseEvent e) {
				btntien.setBackground(new Color(0,102,204));
				txttien.setForeground(Color.WHITE);
			}
		});
		txttien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txttien.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/7a8154be7b9b50412fc2cf63b636e370-icono-de-tienda-tienda-plana.png")));
		txttien.setForeground(Color.WHITE);
		txttien.setHorizontalAlignment(SwingConstants.CENTER);
		txttien.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(57, 165, 253, 10);
		panel_1.add(panel_3);
		
		JPanel btncerrarm = new JPanel();
		btncerrarm.setBorder(null);
		btncerrarm.setBackground(new Color(0, 0, 128));
		btncerrarm.setBounds(0, 0, 53, 45);
		panel_1.add(btncerrarm);
		btncerrarm.setLayout(null);
		
		JLabel txtcerrarm = new JLabel("X");
		txtcerrarm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btncerrarm.setBackground(Color.WHITE);
				txtcerrarm.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btncerrarm.setBackground(new Color(0,0,128));
				txtcerrarm.setForeground(Color.WHITE);
			}
		});
		txtcerrarm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtcerrarm.setForeground(Color.WHITE);
		txtcerrarm.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		txtcerrarm.setHorizontalAlignment(SwingConstants.CENTER);
		txtcerrarm.setBounds(0, 0, 53, 45);
		btncerrarm.add(txtcerrarm);
		
		JPanel btnesta = new JPanel();
		btnesta.setLayout(null);
		btnesta.setBackground(new Color(0, 51, 204));
		btnesta.setBounds(0, 555, 361, 64);
		panel_1.add(btnesta);
		
		JLabel txtesta = new JLabel("  Estadisticas");
		txtesta.setBounds(0, 0, 361, 64);
		btnesta.add(txtesta);
		txtesta.setBackground(new Color(0, 51, 204));
		txtesta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnesta.setBackground(Color.WHITE);
				txtesta.setForeground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				btnesta.setBackground(new Color(0,102,204));
				txtesta.setForeground(Color.WHITE);
			}
		});
		txtesta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtesta.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/9205.png")));
		txtesta.setHorizontalAlignment(SwingConstants.CENTER);
		txtesta.setForeground(Color.WHITE);
		txtesta.setFont(new Font("Roboto Mono Medium", Font.BOLD, 25));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(362, 127, 638, 137);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Menu_principal.class.getResource("/fifa/imagenes/proyecto/FIFA_logo_without_slogan.svg.png")));
		lblNewLabel_2.setBounds(0, 0, 638, 137);
		panel_2.add(lblNewLabel_2);
		{
			contet = new JPanel();
			contet.setBounds(362, 263, 638, 537);
			contentPane.add(contet);
		}
		

	}
	}


