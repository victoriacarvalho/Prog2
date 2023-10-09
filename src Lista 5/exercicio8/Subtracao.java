package exercicio8;

public class Subtracao {

	private int x, y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) throws SubtracaoException{
		if (x == 0)
		{
			SubtracaoException e = new SubtracaoException("Esse valor não pode ser 0! \n ");
			throw e;
		}
		this.x = x;
	}
	
	public int subtracao(int x, int y)
	
	{
		return x - y;
	}
	
}
