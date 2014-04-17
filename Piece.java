import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;

class Piece extends JPanel implements ActionListener, MouseListener {

	public Display(String name) {
		setName(name);
		this.image = Piece.loadImage(name);
	}

	public static Image loadImage(String name) {
	 	Image image = null;
	 	String path = null;
			try	{
 				path = "img" + File.separator + name + ".png";
 				image = ImageIO.read(new File(path));
			}  catch(IOException e) {
				System.out.println("Could not load image at path: " + path) ;
				System.exit(1);
		 	}

		 return image;

	}

	public String name(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

}