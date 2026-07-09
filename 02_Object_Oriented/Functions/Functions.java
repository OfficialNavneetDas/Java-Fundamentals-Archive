class Functions
{
public static void numberSum(int n1 , int n2)
	{
		int ans=n1+n2;
		System.out.println("this is main result"+ans);
		return;
	}
public static void main(String agrs[])
	{
		int num1=Integer.parseInt(agrs[0]);
		int num2=Integer.parseInt(agrs[1]);
		numberSum(num1,num2);
	}
}