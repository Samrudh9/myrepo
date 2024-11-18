import java.util.Random;
class one extends Thread
{
String str;
one(String str)
{
this.str=str;
}
	public void run()
	{
		Random r =new Random();
		for(int i=0;i<26;i++)
		{	
			int val =r.nextInt(100);
			System.out.println(str+"prints"+val);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			System.out.println("interrupted");
			}
			 System.out.println("");
			 }
		}
		}
class two extends Thread
{
String str;
two(String str)
{
this.str=str;
}
	public void run()
	{
		for(char ch = 'A';ch <='Z';ch ++)
		{	
			System.out.println(str +"prints" +ch);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			System.out.println("interrupted");
			}
			 System.out.println("");
			 }
		
	}	
}
class three extends Thread
{
String str;
three(String str)
{
this.str=str;
}
	public void run()
	{
		for(char ch = 'a';ch <='z';ch ++)
		{	
			System.out.println(str+"prints"+ch);
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
			System.out.println("interrupted");
			}
			 System.out.println("");
			 }
		
	}	
}
class four
{
	public static void main(String args[])
	{
	one t1 = new one("thread R-I");
	two t2= new two("thread A-Z");
	three t3=new three("thread a-z");
	
	t1.start();
	t2.start();
	t3.start();
	
	try
	{
	t1.join();
	t2.join();
	t3.join();
	}
	catch(InterruptedException ie)
	{
	 System.out.println("interrupted");
	}
	}
}
	
 
