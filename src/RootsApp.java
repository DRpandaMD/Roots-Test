
public class RootsApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("E5");
		Roots.calculate_roots(0, 1, 2);
		System.out.println(Roots.num_roots);
		System.out.println(Roots.root_one);
		System.out.println(Roots.root_two);
		
		System.out.println("E4");
		Roots.calculate_roots(2, 4, 2);
		System.out.println(Roots.num_roots);
		System.out.println(Roots.root_one);
		System.out.println(Roots.root_two);
		
		
		System.out.println("E3");
		Roots.calculate_roots(1, 4, 2);
		System.out.println(Roots.num_roots);
		System.out.println(Roots.root_one);
		System.out.println(Roots.root_two);
		
		System.out.println("E2");
		Roots.calculate_roots(3, 6, 3);
		System.out.println(Roots.num_roots);
		System.out.println(Roots.root_one);
		System.out.println(Roots.root_two);
		
		System.out.println("E1");
		Roots.calculate_roots(10, 5, 9);
		System.out.println(Roots.num_roots);
		System.out.println(Roots.root_one);
		System.out.println(Roots.root_two);
	}

}
