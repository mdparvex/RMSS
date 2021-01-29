package RMSS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class RMW {

	private JFrame frame;
	private JTextField jtxtFizza;
	private JTextField jtxtBurger;
	private JTextField jtxtPasta;
	private JTextField jtxtQty;
	private JTextField jtxtPromo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RMW window = new RMW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RMW() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel.setBounds(20, 73, 606, 296);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPizza.setBounds(10, 11, 165, 36);
		panel.add(lblPizza);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurger.setBounds(10, 58, 165, 36);
		panel.add(lblChickenBurger);
		
		JLabel lblPasta = new JLabel("Pasta");
		lblPasta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPasta.setBounds(10, 109, 155, 36);
		panel.add(lblPasta);
		
		jtxtFizza = new JTextField();
		jtxtFizza.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtFizza.setBounds(237, 11, 341, 36);
		panel.add(jtxtFizza);
		jtxtFizza.setColumns(10);
		
		jtxtBurger = new JTextField();
		jtxtBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtBurger.setColumns(10);
		jtxtBurger.setBounds(237, 58, 341, 36);
		panel.add(jtxtBurger);
		
		jtxtPasta = new JTextField();
		jtxtPasta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtPasta.setColumns(10);
		jtxtPasta.setBounds(237, 110, 341, 36);
		panel.add(jtxtPasta);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrink.setBounds(10, 169, 155, 36);
		panel.add(lblDrink);
		
		final JComboBox jcmbDrink = new JComboBox();
		jcmbDrink.setFont(new Font("Tahoma", Font.ITALIC, 14));
		jcmbDrink.setModel(new DefaultComboBoxModel(new String[] {"select a drink", "Coca-cola", "Pepsi", "7UP", "Fanta", "Mirinda", "Sprite"}));
		jcmbDrink.setEditable(true);
		jcmbDrink.setBounds(10, 204, 107, 29);
		panel.add(jcmbDrink);
		
		final JCheckBox cbxHomeDelivery = new JCheckBox("Home Delivery");
		cbxHomeDelivery.setFont(new Font("Tahoma", Font.ITALIC, 15));
		cbxHomeDelivery.setBounds(10, 240, 129, 36);
		panel.add(cbxHomeDelivery);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQuantity.setBounds(311, 169, 155, 36);
		panel.add(lblQuantity);
		
		jtxtQty = new JTextField();
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(287, 204, 252, 36);
		panel.add(jtxtQty);
		
		final JCheckBox cbxTax = new JCheckBox("Tax");
		cbxTax.setFont(new Font("Tahoma", Font.ITALIC, 15));
		cbxTax.setBounds(297, 249, 97, 23);
		panel.add(cbxTax);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_1.setBounds(647, 73, 297, 229);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("Enter promocode");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(56, 44, 193, 40);
		panel_1.add(label_2);
		
		final JCheckBox cbxPromo = new JCheckBox("Have PromoCode!");
		cbxPromo.setBounds(56, 14, 129, 23);
		panel_1.add(cbxPromo);
		
		jtxtPromo = new JTextField();
		jtxtPromo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtPromo.setColumns(10);
		jtxtPromo.setBounds(41, 95, 229, 35);
		panel_1.add(jtxtPromo);
		
		final JLabel jlblPromo = new JLabel("");
		jlblPromo.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblPromo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblPromo.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblPromo.setBounds(86, 141, 111, 35);
		panel_1.add(jlblPromo);
		
		JButton jBtnDiscount = new JButton("Discount");
		jBtnDiscount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double promo = Double.parseDouble(jtxtPromo.getText());
				if(cbxPromo.isSelected()) {
				if(jtxtPromo.getText().equals("10")) {
					double dis = 2.4;
					String discount = String.format("%.2f", dis);
					jlblPromo.setText(discount);
				}
				else if(jtxtPromo.getText().equals("20")) {
					double dis = 3.1;
					String discount = String.format("%.2f", dis);
					jlblPromo.setText(discount);
				}
				else if(jtxtPromo.getText().equals("30")) {
					double dis = 2.7;
					String discount = String.format("%.2f", dis);
					jlblPromo.setText(discount);
				}
				else {
					jlblPromo.setText("wrong");
				}
				}
				else {
					jlblPromo.setText("wrong");
				}
			}
		});
		jBtnDiscount.setFont(new Font("Tahoma", Font.ITALIC, 13));
		jBtnDiscount.setBounds(96, 187, 89, 23);
		panel_1.add(jBtnDiscount);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_2.setBounds(20, 380, 606, 162);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Drink Cost");
		lblCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfDrink.setBounds(10, 11, 165, 36);
		panel_2.add(lblCostOfDrink);
		
		JLabel lblCostOfMeals = new JLabel("Meals Cost");
		lblCostOfMeals.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCostOfMeals.setBounds(10, 58, 165, 36);
		panel_2.add(lblCostOfMeals);
		
		JLabel lblDeliveryCost = new JLabel("Delivery Cost");
		lblDeliveryCost.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDeliveryCost.setBounds(10, 115, 165, 36);
		panel_2.add(lblDeliveryCost);
		
		final JLabel jlblDinkCost = new JLabel("");
		jlblDinkCost.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblDinkCost.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblDinkCost.setBounds(331, 11, 235, 36);
		jlblDinkCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.add(jlblDinkCost);
		
		final JLabel jlblCostofMeal = new JLabel("");
		jlblCostofMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostofMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostofMeal.setBounds(331, 58, 235, 36);
		panel_2.add(jlblCostofMeal);
		
		final JLabel jlblDeliveryCost = new JLabel("");
		jlblDeliveryCost.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblDeliveryCost.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblDeliveryCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblDeliveryCost.setBounds(331, 115, 235, 36);
		panel_2.add(jlblDeliveryCost);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_3.setBounds(647, 326, 297, 216);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(10, 11, 123, 47);
		panel_3.add(lblTax);
		
		JLabel lblAfterDiscount = new JLabel("Befor Discount");
		lblAfterDiscount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAfterDiscount.setBounds(10, 81, 156, 47);
		panel_3.add(lblAfterDiscount);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(10, 139, 123, 47);
		panel_3.add(lblTotal);
		
		final JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(176, 11, 111, 47);
		panel_3.add(jlblTax);
		
		final JLabel jlblBeforDiscount = new JLabel("");
		jlblBeforDiscount.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblBeforDiscount.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblBeforDiscount.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblBeforDiscount.setBounds(176, 81, 111, 47);
		panel_3.add(jlblBeforDiscount);
		
		final JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(176, 139, 111, 47);
		panel_3.add(jlblTotal);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_5.setBounds(20, 553, 1303, 86);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jBtnExit.setBounds(773, 32, 89, 23);
		panel_5.add(jBtnExit);
		
		JButton jBtnReset = new JButton("Reset");
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblDeliveryCost.setText(null);
				jlblBeforDiscount.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jlblPromo.setText(null);
				jlblDeliveryCost.setText(null);
				jlblDinkCost.setText(null);
				jlblCostofMeal.setText("0");
				jlblBeforDiscount.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jtxtFizza.setText(null);
				jtxtBurger.setText(null);
				jtxtPasta.setText(null);
				jtxtQty.setText(null);
				jtxtPromo.setText(null);
				jcmbDrink.setSelectedItem("Select a drink");
			}
		});
		jBtnReset.setBounds(640, 32, 89, 23);
		panel_5.add(jBtnReset);
		
		JButton jBtnReceipts = new JButton("Individual peice");
		jBtnReceipts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(jtxtFizza.getText());
				double Qty2 = Double.parseDouble(jtxtBurger.getText());
				double Qty3 = Double.parseDouble(jtxtPasta.getText());
				
				String pr1 = String.format("%.2f", Qty1*3.29);
				String pr2 = String.format("%.2f", Qty2*4.4);
				String pr3 = String.format("%.2f", Qty3*3.7);
				
				
				textField.setText("pizza: "+pr1 + " ,Bueger: "+pr2+ " ,pasta: "+pr3);
				
			}
		});
		jBtnReceipts.setBounds(491, 32, 139, 23);
		panel_5.add(jBtnReceipts);
		
		JButton jBtnTotal = new JButton("Total");
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pizza = Double.parseDouble(jtxtFizza.getText());
				double pprice = 3.29;
				double amountPizza = (pizza * pprice);
				String pricePizza = String.format("%.2f", amountPizza);
				jlblCostofMeal.setText(pricePizza);
				
				double Burger = Double.parseDouble(jtxtBurger.getText());
				double bprice = 4.4;
				double aBurger = (Burger * bprice);
				String pBurger = String.format("%.2f", aBurger + amountPizza);
				jlblCostofMeal.setText(pBurger);
				
				double pesta = Double.parseDouble(jtxtPasta.getText());
				double pPrice = 3.7;
				double aPasta = (pesta * pPrice);
				String pPasta = String.format("%.2f", aPasta + aBurger + amountPizza);
				jlblCostofMeal.setText(pPasta);
				
				//delivery
				double Delivery = 3.5;
				if(cbxHomeDelivery.isSelected()) {
					String DeliviryPrice = String.format("%.2f", Delivery);
					jlblDeliveryCost.setText(DeliviryPrice);
				}
				else {
					jlblDeliveryCost.setText("0");
				}
				
				//Drink
				double drinks = Double.parseDouble(jtxtQty.getText());
				double cocaCola = 1.3*drinks;
				double pepsi = 1.2*drinks;
				double sevenUp= 1.1*drinks;
				double fanta = 1.7*drinks;
				double mirinda = 1.25*drinks;
				double sprit = 1.5*drinks;
				if(jcmbDrink.getSelectedItem().equals("Coca-cola")) {
					String pcocaCola = String.format("%.2f", cocaCola);
				jlblDinkCost.setText(pcocaCola);
				}
				else if(jcmbDrink.getSelectedItem().equals("Pepsi")) {
					String pPepsi = String.format("%.2f", pepsi);
				jlblDinkCost.setText(pPepsi);
				}
				else if(jcmbDrink.getSelectedItem().equals("7UP")) {
					String p7UP = String.format("%.2f", sevenUp);
				jlblDinkCost.setText(p7UP);
				}
				else if(jcmbDrink.getSelectedItem().equals("Fanta")) {
					String pFanta = String.format("%.2f", fanta);
				jlblDinkCost.setText(pFanta);
				}
				else if(jcmbDrink.getSelectedItem().equals("Mirinda")) {
					String pmirinda = String.format("%.2f", mirinda);
				jlblDinkCost.setText(pmirinda);
				}
				else if(jcmbDrink.getSelectedItem().equals("Sprite")) {
					String psprit = String.format("%.2f", sprit);
				jlblDinkCost.setText(psprit);
				}
				else if(jcmbDrink.getSelectedItem().equals("select a drink")) {
					jlblDinkCost.setText("0");
				}
					
				//tax
				
				double cTotal1 = Double.parseDouble(jlblDinkCost.getText());
				double cTotal2 = Double.parseDouble(jlblCostofMeal.getText());
				double cTotal3 = Double.parseDouble(jlblDeliveryCost.getText());
				double AllTotal = (cTotal1+cTotal2+cTotal3)/100;
				
				if(cbxTax.isSelected()) {
					String iTotal = String.format("%.2f", AllTotal);
					jlblTax.setText(iTotal);
				}
				//befor discount
				double cTotal4 = Double.parseDouble(jlblTax.getText());
				
				double Adiscount = (cTotal1+ cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("%.2f", Adiscount);
				jlblBeforDiscount.setText(iTotal);
				
				//total after discount
				
				double ctotal5 = Double.parseDouble(jlblPromo.getText());
				double total = Adiscount - ctotal5;
				String ltotal = String.format("$ %.2f", total);
				jlblTotal.setText(ltotal);
				
			}
		});
		jBtnTotal.setBounds(392, 32, 89, 23);
		panel_5.add(jBtnTotal);
		
		
		JLabel lblNewLabel = new JLabel("Burger Hut");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(524, 0, 568, 69);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_4.setBounds(954, 73, 388, 469);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 37, 42, -15);
		panel_4.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 56, 42, -9);
		panel_4.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(20, 48, 32, -9);
		panel_4.add(panel_8);
		
		JLabel lblReceipts = new JLabel("show only for meal");
		lblReceipts.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblReceipts.setBounds(10, 21, 216, 24);
		panel_4.add(lblReceipts);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(20, 64, 344, 359);
		panel_4.add(textField);
		textField.setColumns(10);
	}
}
