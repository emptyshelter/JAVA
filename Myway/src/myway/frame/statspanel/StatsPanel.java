package myway.frame.statspanel;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import myway.product.Product;
import myway.product.ProductManager;

public class StatsPanel extends JPanel {
	private static final long serialVersionUID = 1390441199619602529L;

	private ProductManager pMgr = new ProductManager();

	private DefaultTableModel defaultTableModel;
	private JTable table;
	private JScrollPane scrollPane;

	/*
	 * ���� �Ǹű��
	 */
	public StatsPanel() throws Exception {

		setBounds(100, 100, 800, 600);
		setLayout(new BorderLayout());

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setAutoCreateRowSorter(true);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();

				// ��Ŭ���� �ƴϰų� 2�� �÷��� �ƴϸ� return
				if (e.getButton() != 1 || col != 2) {
					return;
				}

				// Object korName = table.getValueAt(row, 2);

				String dateTime = table.getValueAt(row, 0).toString();
				String productName = table.getValueAt(row, 1).toString();
				String payedTopping = table.getValueAt(row, 2).toString();
				String price = table.getValueAt(row, 3).toString();

				StringBuilder message = new StringBuilder();
				message.append(dateTime + "\n");
				message.append(productName + "\n");
				message.append(payedTopping + "\n");
				message.append(price);

				JOptionPane.showConfirmDialog(null, message, "�󼼺���", JOptionPane.CLOSED_OPTION,
						JOptionPane.INFORMATION_MESSAGE);

			}
		});

		scrollPane = new JScrollPane(table);

		this.add(scrollPane, BorderLayout.CENTER);
		defaultTableModel = new DefaultTableModel(getProductVector(), getHeaderVector());

		table.setModel(defaultTableModel);

		scrollPane.setViewportView(table);

		setVisible(true);
	}

	public void tableRefresh() throws Exception {
		defaultTableModel = new DefaultTableModel(getProductVector(), getHeaderVector());
		table.setModel(defaultTableModel);
	}

	// HeaderVector
	private Vector<String> getHeaderVector() {
		Vector<String> headerNameVector = new Vector<String>();
		headerNameVector.add("Date/Time");
		headerNameVector.add("ProductName");
		headerNameVector.add("PayedTopping");
		headerNameVector.add("Price");

		return headerNameVector;
	}

	// Data
	private Vector<Vector<Object>> getProductVector() throws Exception {
		ArrayList<Product> pList = pMgr.productList();
		Vector<Vector<Object>> productVector = new Vector<>();
		for (Product p : pList) {
			Vector<Object> rowVector = new Vector<>();
			StringBuilder payedTopping = new StringBuilder();
			// �ð�
			SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/dd  HH:mm:ss");
			rowVector.add(format.format(p.getSoldTime()));
			// ������ġ �̸�
			rowVector.add(p.getSandwich().getKorName());
			// ������ġ ��� �̸�
			rowVector.add(payedTopping.append(p.getSandwich().getExtras()));
			// ������ġ ����
			rowVector.add(p.getSoldPrice());

			productVector.add(rowVector);
		}
		return productVector;
	}

	// /*
	// * 1.������ �ȸ��� �ȸ� �ð��� �ȸ� �ݾ��� ����
	// * 1-1.������ �ȸ� �ð��� ���δ�Ʈ�� ����
	// * 1-2.������ �ȸ� �ݾ��� ���δ�Ʈ�� ����
	// * 2-1.������ �ȸ��ð��� �ð������� x��
	// * 2-2.������ �ȸ���¥�� ��¥������ x��
	// * 3.�ð�����(3�ð�)���� ������ �����ϰ� y��
	// */
	//
	// private ProductManager pmgr;
	// private ArrayList<Product> pList;
	// private Calendar cal;
	// private int date;
	// private int hour;
	// private ArrayList<Number> sum;
	// DefaultCategoryDataset xyValue;
	// //���δ�Ʈ VO���� ���� �ǸŽð�
	// //���δ�Ʈ VO���� ���� �ǸŰ���
	//
	// /*Constructor*/
	// public StatsPanelManager() throws Exception {
	// pmgr = new ProductManager();
	// StockManager
	// pList = new ArrayList<Product>();
	// xyValue = new DefaultCategoryDataset();
	// int date = 1;
	// int hour = 1;
	// }
	//
	// /*
	// * �ð�����(6�ð�)�� �Ǹ���Ȳ �׷��� ��ȯ
	// * �ð�����(6�ð�)�� ���ⷮ�� �����ؼ� y��
	// * 3�ð� ���� x��
	// * ����׷���
	// * 0~23 / 1~24
	// */
	// //�ð� �Ǻ�
	// //�ð����� �Ǹŷ�
	// //y�� ����Ʈ�� �Ǹŷ� ����
	// public void timeToSales() {
	// //x��
	// //y��
	// int tot = 0;
	// System.out.println(pList.size());
	//
	// for (Product p : pList) {
	// cal=Calendar.getInstance();
	// cal.setTime(p.getSoldTime());
	// hour=cal.get(Calendar.HOUR_OF_DAY);
	// System.out.println(hour);
	// if (0 <= hour && hour < 6) {
	// tot +=p.getSoldPrice();
	// sum.add(0, tot);
	// xyValue.addValue(sum.get(0), "0~5", "timeToSales");
	// tot=0;
	// }else if (6 <= hour && hour < 12) {
	// tot +=p.getSoldPrice();
	// sum.add(1, tot);
	// xyValue.addValue(sum.get(1), "6~11", "timeToSales");
	// tot=0;
	// }else if (12 <= hour && hour < 18) {
	// tot +=p.getSoldPrice();
	// sum.add(2, tot);
	// xyValue.addValue(sum.get(2), "12~17", "timeToSales");
	// tot=0;
	// }else if (18 <= hour && hour < 24) {
	// tot +=p.getSoldPrice();
	// sum.add(3, tot);
	// xyValue.addValue(sum.get(3), "18~24", "timeToSales");
	// tot=0;
	// }
	// }
	// JFreeChart chart=
	// ChartFactory.createBarChart(
	// "timeToSales", "�ð�", "�Ǹž�", xyValue);
	// }
	// /*
	// * ���Ϻ� �Ǹ���Ȳ �׷��� ��ȯ
	// * ���Ϸ� ���ⷮ�� �����ؼ� y��
	// * ��¥ ���� x��
	// * ����׷���
	// * �Ͽ��� 1 �����7
	// */
	// public void dateToSales(){
	// int tot = 0;
	// for (Product p : pList) {
	// cal=Calendar.getInstance();
	// cal.setTime(p.getSoldTime());
	// date=cal.get(Calendar.DAY_OF_WEEK);
	//
	// if (date==2) {
	// tot +=p.getSoldPrice();
	// sum.add(0, tot);
	// xyValue.addValue(sum.get(0), "Mon", "dateToSales");
	// tot=0;
	// }else if (date==3) {
	// tot +=p.getSoldPrice();
	// sum.add(1, tot);
	// xyValue.addValue(sum.get(1), "Tue", "dateToSales");
	// tot=0;
	// }else if (date==4) {
	// tot +=p.getSoldPrice();
	// sum.add(2, tot);
	// xyValue.addValue(sum.get(2), "Wed", "dateToSales");
	// tot=0;
	// }else if (date==5) {
	// tot +=p.getSoldPrice();
	// sum.add(3, tot);
	// xyValue.addValue(sum.get(3), "Thur", "dateToSales");
	// tot=0;
	// }else if (date==6) {
	// tot +=p.getSoldPrice();
	// sum.add(4, tot);
	// xyValue.addValue(sum.get(3), "Fri", "dateToSales");
	// tot=0;
	// }else if (date==7) {
	// tot +=p.getSoldPrice();
	// sum.add(5, tot);
	// xyValue.addValue(sum.get(3), "Sat", "dateToSales");
	// tot=0;
	// }else if (date==1) {
	// tot +=p.getSoldPrice();
	// sum.add(6, tot);
	// xyValue.addValue(sum.get(3), "Sun", "dateToSales");
	// tot=0;
	// }
	// }
	// JFreeChart chart=
	// ChartFactory.createBarChart(
	// "dateToSales", "�ð�", "�Ǹž�", xyValue);
	// }

}
