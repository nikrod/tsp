
public class ciudad {
	
	private int x;
	private int y;
	private int num;
	
	public ciudad()
	{
		this.x=0 ;
		this.y=0;
		this.num=0;
	}
	
	public ciudad(int x1,int y1,int num1)
	{
		this.x=x1;
		this.y=y1;
		this.num=num1;
	}
	
	public int getx()
	{
		return this.x;
	}
	
	 public int gety()
	 {
		return this.y; 
	 }
	 
	 public int getnum()
	 {
		 return this.num;
	 }
	
	 public void setx(int x1)
	 {
		 this.x=x1;
	 }
	 
	 public void sety(int y1)
	 {
		 this.y=y1;
	 }
	 
	 public void setnum(int num1)
	 {
		 this.num=num1;
	 }
}
