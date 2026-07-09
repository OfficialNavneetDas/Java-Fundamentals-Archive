class Pattern
{
	public static void main(String agre[])
	{
		int x=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=x;k+=1)
			{
				System.out.print("*");
			}
		System.out.println();
		x+=2;
		}
	}
}