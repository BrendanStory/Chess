
class Piece {

	public String type;
	public String color;

	public Piece(String type, String color){
		setType(type);
		setColor(color);
	}


	public String type(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}


	public String color(){
		return color;
	} 
	public void setColor(String color){
		this.color = color;
	}

	

	//Images are 256 by 256//

}