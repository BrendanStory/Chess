import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.imageio.ImageIO;

class Bishop extends JPanel, Movement implements ActionListener, MouseListener {

	//Moves the piece when clicked
	public void mousePressed(MouseEvent e){

	}

	//shows where the piece can move
	public void mouseEntered(MouseEvent e){
		
	}

	//Undoes the last command (Showing movement)
	public void mouseExited(MouseEvent e){
		
	}

	public String name(){
		return name;
	}	

	public void setName(String name){
		this.name = name;
	}

}