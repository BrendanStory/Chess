import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.imageio.ImageIO;

class Pawn extends JPanel, Movement implements ActionListener, MouseListener {
	
	public String name(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

}