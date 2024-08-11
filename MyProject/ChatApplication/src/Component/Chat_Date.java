package Component;

import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

public class Chat_Date extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	JLabel lbDate;
	/**
	 * Create the panel.
	 */
	public Chat_Date() {
		setBorder(new EmptyBorder(10, 10, 10, 10));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{98, 71, 98, 0};
		gridBagLayout.rowHeights = new int[]{16, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Line line = new Line();
		GridBagConstraints gbc_line = new GridBagConstraints();
		gbc_line.fill = GridBagConstraints.BOTH;
		gbc_line.insets = new Insets(0, 0, 0, 5);
		gbc_line.gridx = 0;
		gbc_line.gridy = 0;
		add(line, gbc_line);
		
		lbDate = new JLabel("21/02/2024");
		lbDate.setHorizontalAlignment(SwingConstants.CENTER);
		lbDate.setForeground(new Color(128, 128, 128));
		GridBagConstraints gbc_lbDate = new GridBagConstraints();
		gbc_lbDate.fill = GridBagConstraints.BOTH;
		gbc_lbDate.insets = new Insets(0, 0, 0, 5);
		gbc_lbDate.gridx = 1;
		gbc_lbDate.gridy = 0;
		add(lbDate, gbc_lbDate);
		
		Line line_1 = new Line();
		GridBagConstraints gbc_line_1 = new GridBagConstraints();
		gbc_line_1.fill = GridBagConstraints.BOTH;
		gbc_line_1.gridx = 2;
		gbc_line_1.gridy = 0;
		add(line_1, gbc_line_1);

	}
	public void setDate(String date) {
		lbDate.setText(date);
		
	}
}
