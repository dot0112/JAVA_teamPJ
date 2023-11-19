package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import GUI.C_Component.itemSlot_history;

public class RentHistory extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private RoundButton btnNewButton;
	private RoundButton btnNewButton_1;
	private RoundButton btnNewButton_2;
	private itemSlot_history is;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentHistory frame = new RentHistory();
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
	public RentHistory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1034, 531);
		panel.setBackground(Color.white);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("렌트 내역");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(44, 29, 162, 62);
		panel.add(lblNewLabel);

		is = new itemSlot_history(38, 90, 960, 370);
		panel.add(is);

		btnNewButton = new RoundButton("연장 요청");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(671, 470, 104, 33);
		panel.add(btnNewButton);

		btnNewButton_1 = new RoundButton("반납");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(787, 470, 104, 33);
		panel.add(btnNewButton_1);

		btnNewButton_2 = new RoundButton("뒤로");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setColorNormal(new Color(31, 78, 121));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(903, 470, 104, 33);
		panel.add(btnNewButton_2);

		Vector<Object[]> vector = new Vector<Object[]>();
		for (int i = 0; i < 15; i++) {
			vector.add(new Object[] { false, "" + (i + 1), "asdf", "asdf", "asdf", "asdf", "asdf" });
		}
		is.setItem(vector);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnNewButton) { // 연장 요청 동작
			System.out.println(((JButton) (e.getSource())).getText());
			if (is.getSelectItemNum() != -1)
				System.out.println("물품 번호: " + is.getSelectItemNum());
		} else if (e.getSource() == btnNewButton_1) { // 반납 동작
			System.out.println(((JButton) (e.getSource())).getText());
			if (is.getSelectItemNum() != -1)
				System.out.println("물품 번호: " + is.getSelectItemNum());
		} else if (e.getSource() == btnNewButton_2) { // 뒤로 동작
			System.out.println(((JButton) (e.getSource())).getText());
		}
	}
}
