package io.battlearena.leekhub.tools.graphe;

public class NodeLeek
	{
	int x;
	int y;
	
	public NodeLeek(int x, int y)
		{
		this.x = x;
		this.y = y;
		}

	public int getX()
		{
		return this.x;
		}

	public int getY()
		{
		return this.y;
		}
	
	@Override
	public boolean equals(Object obj)
		{
		boolean res = false;
		if(obj.getClass().getName().equals(this.getClass().getName()))
			{
			NodeLeek other = (NodeLeek)obj;
			int tmpX1 = this.getX();
			int tmpY1 = this.getY();
			int tmpX2 = other.getX();
			int tmpY2 = other.getY();
			if(other.getX()==this.getX() && other.getY()==this.getY())
				{
				res = true;
				}
			}
		return res;
		}
	}
