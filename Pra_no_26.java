import java.io.IOException;
class Pra_no_26
{
	public void show() throws IOException
	{
		throw new IOException("Exception");
	}
	void disp()
	{
		try
		{
			show();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		} 
	}
	public static void main(String args[])
	{
		Pra_no_26 obj=new Pra_no_26();
		 obj.disp();
	}
}