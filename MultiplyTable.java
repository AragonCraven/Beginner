class ForNesting
{
	public static void main(String[] args)
	{
		int a;
		int p, q, t;
		System.out.print("\t");
		for (a = 9; a >=1; a--)
		{
			System.out.print(a + "\t");
		}
		System.out.println();
		for(p = 9; p >= 1; p--)
		{
			System.out.print(p + "\t");
			for(q = 9; q >= p; q--)
			{
				t = p * q;
				System.out.print(t + "\t");
			}
			System.out.println();
			q = 9;
		}
	}
}
