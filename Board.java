class board {

	private String[] typeArray = {"Pawn", "Knight", "Bishop", "Rook", "Queen", "King"};
	private String[] colorArray = {"Black", "White"};
	private Piece[] black = new Piece[16];
	private Piece[] white = new Piece[16];

	public Board(Graphics g){

		String pieceName = "";

		for (int i = 0; i < 8; i++) {
			
		}
	}

	private int width, height;
	public Graphics g;
	private Point topLeft = new Point(0,0);


	public rectangle(Point topLeft, int width, int height ){

		setWidth(width);
		setHeight(height);

		g.fillRect(topLeft.x, topLeft.y, width, height);

	}

	public int width(){
		return width;
	}

	public int height(){
		return height;
	}
	public void setWidth(int width){
		this.width = width;
	}

	public void setHeight(int height){
		this.height = height;
	}

}