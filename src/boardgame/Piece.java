package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;     //initial position
	}

	protected Board getBoard() { //acesso concedido dentro do mesmo pacote e filhos de Piece
		return board;
	}
}
