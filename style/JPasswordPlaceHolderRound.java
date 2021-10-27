import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * This class defines the style of the field for password entry
 * 
 * @author https://github.com/Alejandro-prog
 * @version: 2.0
 */
public class JPasswordPlaceHolderRound extends JPasswordField {

	private static final long serialVersionUID = 1L;

	private Shape shape;
	private Dimension d = new Dimension(200, 32);
	private String placeholder = "";
	private Boolean border = false;
	private Color phColor = new Color(255, 255, 255);
	private boolean band = true;
	/**
	 * Constructor method which defines the attributes of the field
	 * 
	 * @param Field size
	 */
	public JPasswordPlaceHolderRound(int size) {
		
		super(size);
		
		setOpaque(false);
		setHorizontalAlignment(SwingConstants.LEFT);
		setSize(d);
		setPreferredSize(d);
		setVisible(true);
		setMargin(new Insets(3, 6, 3, 6));

		getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void insertUpdate(DocumentEvent e) {
				band = false;
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				band = !(getText().length() > 0);
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}

		});
	}

	/**
	 * Method that returns the text to display in the field
	 * 
	 * @return the placeholder
	 */
	public String getPlaceholder() {
		return placeholder;
	}

	/**
	 * Method that changes the value of the placeHolder attribute
	 * 
	 * @param placeholder the placeholder to set
	 */
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}
	
	/**
	 * Method that returns the visible for the border
	 * 
	 * @return the placeholder
	 */
	public Boolean getsetBorderPainted() {
		return border;
	}

	/**
	 * Changing method that makes the border visible
	 * 
	 * @param placeholder the placeholder to set
	 */
	public void setBorderPainted(boolean border) {
		this.border = border;
	}


	/**
	 * Method that returns the value of the phColor attribute
	 * 
	 * @return the phColor
	 */
	public Color getPhColor() {
		return phColor;
	}


	/**
	 * Method changes the value of the phColor attribute
	 * 
	 * @param phColor the phColor to set
	 */
	public void setPhColor(Color phColor) {
		this.phColor = phColor;
	}
	

	/**
	 * Method that modifies the color of the placeHolder and draws the text
	 * 
	 * @param g Componente gráfico a modificar
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// color de placeholder
		g.setColor(getPhColor());
		// dibuja texto
		g.drawString((band) ? placeholder : "", getMargin().left, (getSize().height) / 2 + getFont().getSize() / 2);

	}

	/**
	 * Method that draws the border of the placeHolder
	 */
	protected void paintBorder(Graphics g) {
		
		if(this.border) {
			
			g.setColor(getForeground());
			g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
		}
	}
		

	/**
	 * Method that evaluates if the coordinates are inside the shape and adjusts it
	 * 
	 * @param x Coordenada x
	 * @param y Coordenada y
	 */
	public boolean contains(int x, int y) {
		if (shape == null || !shape.getBounds().equals(getBounds())) {
			shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 15, 15);
		}
		return shape.contains(x, y);
	}
}
