import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.Image;

import java.awt.*;
import java.applet.*;

import javax.swing.*;

import java.awt.event.*;

class Board extends Applet implements ActionListener {
	
	public Display(String name) {
		setName(name);
		this.image = Piece.loadImage(name);
	}


		public rectangle(Point topLeft, int width, int height ){

			setWidth(width);
			setHeight(height);

			g.fillRect(topLeft.x, topLeft.y, width, height);
		}

		public void draw(Graphics g, Rectangle r) {
			g.drawImage(image, r.x, r.y, r.width, r.height, null);
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

		public board(Point topLeft, int width, int height) {
			rectangle( 0, 0, 1, 256, 256);
			

		}
}
