import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtInsiraOParmetro_1;
	private JTextField txtTamanhocod;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setText("Excel Reader 2020");
		txtA.setFont(new Font("Magneto", Font.PLAIN, 27));
		txtA.setBounds(247, 13, 292, 60);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox.setBackground(new Color(0, 0, 204));
		chckbxNewCheckBox.setBounds(32, 178, 113, 25);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxNewCheckBox_1.setBackground(new Color(0, 0, 204));
		chckbxNewCheckBox_1.setBounds(32, 235, 152, 25);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxLongMethod = new JCheckBox("Long Method");
		chckbxLongMethod.setFont(new Font("Tahoma", Font.BOLD, 13));
		chckbxLongMethod.setSelected(true);
		chckbxLongMethod.setBackground(new Color(0, 0, 204));
		chckbxLongMethod.setBounds(32, 298, 113, 25);
		contentPane.add(chckbxLongMethod);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Cyclo");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_2.setBackground(new Color(0, 0, 204));
		chckbxNewCheckBox_2.setBounds(32, 360, 152, 25);
		contentPane.add(chckbxNewCheckBox_2);
		
		txtInsiraOParmetro_1 = new JTextField();
		txtInsiraOParmetro_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtInsiraOParmetro_1.setColumns(10);
		txtInsiraOParmetro_1.setBackground(new Color(255, 255, 255));
		txtInsiraOParmetro_1.setBounds(220, 371, 400, 33);
		contentPane.add(txtInsiraOParmetro_1);
		
		JButton btnNewButton = new JButton("Import Excel Table");
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.setBounds(38, 46, 146, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Insira a regra para o primeiro code smell:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(232, 169, 453, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a regra para o segundo code smell:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBackground(new Color(0, 0, 204));
		lblNewLabel_1.setBounds(232, 317, 388, 58);
		contentPane.add(lblNewLabel_1);
		
		txtTamanhocod = new JTextField();
		txtTamanhocod.setText("tamanhocod>50");
		txtTamanhocod.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTamanhocod.setColumns(10);
		txtTamanhocod.setBackground(Color.WHITE);
		txtTamanhocod.setBounds(220, 227, 400, 33);
		contentPane.add(txtTamanhocod);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(247, 179, 272, -71);
		contentPane.add(table);
	}
}
