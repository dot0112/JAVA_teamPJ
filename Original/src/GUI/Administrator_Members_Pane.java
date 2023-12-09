package GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import JDBC.UserDAO;

public class Administrator_Members_Pane extends Administrator_pane {

	private JButton revise, delete;
	private String colNames[] = {"아이디","이름","전화번호","관리자여부"};  // 테이블 컬럼 값들
    private DefaultTableModel model = new DefaultTableModel(colNames, 0);
    private JTable table ;
    UserDAO dao;
	
	public Administrator_Members_Pane(JFrame master, Administrator_pane a) throws ClassNotFoundException {
		super(master);
		table = new JTable(model);
		dao = new UserDAO();
		dao.userAll(model);
		
		/*
		 * table.setBounds(18, 30, 460, 344); scrollPane.add(table);
		 */
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(18, 30, 460, 344);
		scrollPane.setBackground(Color.white);
		add(scrollPane);
		//master.add(table);
		
		revise = new JButton("수정");
		revise.setBounds(close_bt.getX(), scrollPane.getY(),
					close_bt.getWidth(), close_bt.getHeight());
		revise.setBackground(null);
		add(revise);

		delete = new JButton("삭제");
		delete.setBounds(close_bt.getX(), revise.getY()+revise.getHeight()+20,
				close_bt.getWidth(), close_bt.getHeight());
		delete.setBackground(null);
		add(delete);
	
		
		
		setBackground(Color.white);
		
	}
	

}