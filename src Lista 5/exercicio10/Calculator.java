package exercicio10;

public class Calculator {
	
	private double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) throws ExceptionDivisao {
        if(x <= 0)
        {
        	ExceptionDivisao e = new ExceptionDivisao("\n Número deve que ser maior que zero");
            throw e;
        }
        this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double Y) throws ExceptionDivisao{
		if (y <= 0)
		{
			ExceptionDivisao e = new ExceptionDivisao("\n Número deve que ser maior que zero");
			throw e;
		}
		this.y = y;
	}
	
	double div(double x, double y )
	{
		return x / y;
	}
	
	double log10(double x)
	{
		return Math.log10(x);
	}
}
