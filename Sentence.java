class SwitchDemo
{
	public static void main(String[] args) 
	{
		int x = 15;
		if (x < 1 || x > 12)
		{
			System.out.println("Error: there's no " + x + "th month!");
		}
		else
		{
			switch (x / 3)
			{
			case 1:
				System.out.println("The " + x + "th month belongs to spring.");
				break;
			case 2:
				System.out.println("The " + x + "th month belongs to summer.");
				break;
			case 3:
				System.out.println("The " + x + "th month belongs to spring.");
				break;
			default:
				System.out.println("The " + x + "th month belongs to winter.");
			}
		}
	}
}