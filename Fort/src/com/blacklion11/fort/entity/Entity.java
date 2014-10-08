import java.awt.Point;



public abstract class Entity
{
	
	protected float x, y;
	
	public float getX(){return x;}
	public float getY(){return y;}
	public Point getCoord(){return new Point((int) x, (int) y);}
	
	public void setX(float x){this.x = x;}
	public void setY(float y){this.y = y;}
	public void setCoord(Point p)
	{
		this.x = p.x;
		this.y = p.y;
	}
	
}