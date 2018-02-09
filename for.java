class ForDemo
{
	public static void main(String[] args)
	{
		int i, n, c = 0, m = 0;
		for(n = 101; n < 201; n++)
		{
			for(i = 2; i * i <= n; i++)
			{
				if(n % i == 0)
					c = c + 1;
			}
			if(c == 0)
			{
				System.out.println(n);
				m = m + 1;
			}
			c = 0;
		}
		System.out.println("There are " + m + " primes between 101 and 200.");
	}
}