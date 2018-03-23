
public class RectangleClass {
	
	
	int aSide;
	int bSide;
	
	
	public RectangleClass(int aSide, int bSide)
	{
		this.aSide= aSide;
		this.bSide= bSide;
	}
	
	public RectangleClass(int sides)
	{
		this.aSide= sides;
		this.bSide= sides;
	}
	
	
	public int getArea()
	{
		return aSide*bSide;
	}

	public String toString() {
		return aSide + ", " + bSide + ", " + getArea();
	}

	public int getaSide() {
		return aSide;
	}

	public void setSides(int aSide, int bSide) {
		this.aSide= aSide;
		this.bSide= bSide;
	}

	public int getbSide() {
		return bSide;
	}

	public void setBothSide(int sides) 
	{
		this.aSide= sides;
		this.bSide= sides;
	}
	
	
	public boolean Bigger(RectangleClass rectangle){
		
		if(this.getArea()<rectangle.getArea())
		{
			return true;
		}
		
		else return false; 
		
	}
	
	public boolean aside_bside(RectangleClass rectangle)
	{
		if(this.getaSide() == rectangle.getaSide() && this.getbSide()== rectangle.getbSide())
		{
			return true;
		}
		else return false;
	}
	
	
	

}
