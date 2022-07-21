import java.io.*;
import java.util.*;
class laptop
{
	String name,gname,brand;
	int ram,rom,price;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void accept()
	{
		try{
			System.out.println("Enter brand name");
			brand=br.readLine();
			System.out.println("Enter name of laptop");
			name=br.readLine();
			System.out.println("Enter Graphic card name");
			gname=br.readLine();
			System.out.println("Enter Ram size");
			ram=Integer.parseInt(br.readLine());
			System.out.println("Enter Storage size");
			rom=Integer.parseInt(br.readLine());
			System.out.println("Enter Price");
			price=Integer.parseInt(br.readLine());
		   }
		catch(Exception e)
		   {
			System.out.println(e);
		   }
		
	}
	void show()
	{
		System.out.println("Brand\tName\t   Graphics\tRAM\tROM\tPrice");
		System.out.println(""+brand+"\t"+name+"\t"+gname+"\t\t"+ram+"\t"+rom+"\t"+price);
	}
}

class jav 
{	
	
	public static void main(String args[])
	{	
		int ch=0,n=0,in=0,max=100,g=0,cnt=0,bud=0;
		String s="",ir="";  
		Vector v=new Vector(1,1);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		laptop l[]=new laptop[max];	
		laptop temp=new laptop();
		for(int i=0;i<max;i++)
		{
			l[i]=new laptop();
		}
		do{	
			try{
				System.out.println("1]Insert Records\n2]Display filters\n3]Search\n4]Delete\n5]Budget friendly\n6]Extreme filter\n  Enter choice");
				ch=Integer.parseInt(br.readLine());
			   }
				catch(Exception e)
	   	 		{	System.out.println(e);
				}
			switch(ch)
			{
				case 1:	try{
						System.out.println("Enter how many records you want to insert");
						in=Integer.parseInt(br.readLine());
					   }
					catch(Exception e)	
					{
						System.out.println(e);
					}
			
					for(int i=0;i<in;i++)
					{
							l[cnt].accept();
							cnt++;
					}	
					break;
				case 2: if(cnt!=0)
					{
					try
					{
						System.out.println("1)by  highest ram\n2)by highest Storage\n3)by highest price\nEnter your choice of Filter");
						g=Integer.parseInt(br.readLine());
					}
					catch(Exception e)	
					{
						System.out.println(e);
					}
						switch(g)
						{
							case 1:for(int i=0;i<cnt;i++)
								{	
									for(int j=0;j<i;j++)
									{
										if(l[i].ram>l[j].ram)
										{
											temp=l[i];	
											l[i]=l[j];
											l[j]=temp;
										}
									}
								 }
								for(int i=0;i<cnt;i++)
								{
									l[i].show();
								}
								break;
							case 2:for(int i=0;i<cnt;i++)
								{	
									for(int j=0;j<i;j++)
									{
										if(l[i].rom>l[j].rom)
										{
											temp=l[i];	
											l[i]=l[j];
											l[j]=temp;
										}
									}
								 }
								for(int i=0;i<cnt;i++)
								{
									l[i].show();
								}
								break;
							case 3:for(int i=0;i<cnt;i++)
								{	
									for(int j=0;j<i;j++)
									{
										if(l[i].price>l[j].price)
										{
											temp=l[i];	
											l[i]=l[j];
											l[j]=temp;
										}
									}
								 }
								for(int i=0;i<cnt;i++)
								{
									l[i].show();
								}
								break;
						}		
					}else{System.out.println("There's no record present");}		break;	

				case 3: try{
						System.out.println("Enter brand or name of laptop");
						s=br.readLine();
					   }
					catch(Exception e)	
					   {
						System.out.println(e);
					   }
					int flag1=0;
					for(int i=0;i<cnt;i++)
					{	flag1=1;
						if(s.equals(l[i].brand)||s.equals(l[i].name))
							l[i].show();
					}if(flag1==0){System.out.println("There's no such laptop");}
					break; 	
				case 4:try{
						System.out.println("Enter brand or name of laptop");
						s=br.readLine();
					   }
					catch(Exception e)	
					   {
						System.out.println(e);
					   }
					int delete=0;
					for(int i=0;i<cnt;i++)
					{
						if(s.equals(l[i].brand)||s.equals(l[i].name))
						{	delete=1;
							l[i].show();
							for(int j=i;j<cnt;j++)
							{
								l[j].brand=l[j+1].brand;
								l[j].name=l[j+1].name;
								l[j].gname=l[j+1].gname;
								l[j].ram=l[j+1].ram;
								l[j].rom=l[j+1].rom;
								l[j].price=l[j+1].price;
							}
							cnt=cnt-1;
							System.out.println("Deleted record");
						}
					}
					if(delete==0){System.out.println("There's no such brand");}
					break;
				case 5:try{
						System.out.println("Enter your budget");
						bud=Integer.parseInt(br.readLine());
					   }
					catch(Exception e)	
					   {
						System.out.println(e);
					   }
					int j=0,bc=0;
					for(int i=0;i<cnt;i++)
					{
						if(bud>=l[i].price)
						{
							bc++;
						}
					}
					if(bc!=0)
					{
						laptop t[]=new laptop[bc];	
						for(int i=0;i<bc;i++)
						{
							t[i]=new laptop();
						}	
					        j=0;
						for(int i=0;i<cnt;i++)
						{
							if(bud>=l[i].price)
							{
								t[j]=l[i];
								j++;
							}
						}
						System.out.println("What is more important for you RAM or Storage");
						try{  ir=br.readLine();  } catch(Exception e){System.out.println(e);}
						if(ir.equalsIgnoreCase("RAM"))
						{	
							for(int i=0;i<bc;i++)
							{
								for(j=0;j<i;j++)
								{
									if(t[i].ram>t[j].ram)
									{
										temp=t[i];	
										t[i]=t[j];
										t[j]=temp;
									}
								}
							}
						}
						else if(ir.equalsIgnoreCase("Storage"))
						{
							for(int i=0;i<bc;i++)
							{
								for(j=0;j<i;j++)
								{
									if(t[i].rom>t[j].rom)
									{
										temp=t[i];	
										t[i]=t[j];
										t[j]=temp;
									}
								}
							}
						}
						else{System.out.println("You entered wrong choice");}
						for(int i=0;i<bc;i++)
						{
							t[i].show();
						}
						
					}
					else
					{System.out.println("There's no such laptop in that range");}
					break;
				case 6: laptop demo=new laptop();
					demo.accept();
					int flag=0;
					for(int i=0;i<cnt;i++)
					{
						flag=1;
					if((demo.brand.equalsIgnoreCase(l[i].brand)||demo.brand.equalsIgnoreCase("Any"))&&(demo.name.equalsIgnoreCase(l[i].name)||demo.name.equalsIgnoreCase("Any"))&&(demo.gname.equalsIgnoreCase(l[i].gname)||demo.gname.equalsIgnoreCase("Any"))&&(demo.ram<=l[i].ram&&demo.rom<=l[i].rom&&demo.price>=l[i].price))
					{l[i].show();}
					}
					if(flag==0)
					{	System.out.println("Sorry there's no such laptop");}
			}
		  }while(ch<=6);
	}
}

