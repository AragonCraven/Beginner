class ForNesting
{
	public static void main(String[] args)
	{
		int a;
		int p, q;
		int s = 9, t;
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
				t = p * s;
				System.out.print(t + "\t");
				s--;
			}
			System.out.println();
			s = 9;
		}
	}
}
