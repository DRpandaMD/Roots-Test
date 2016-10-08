import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest 
{
	Roots root;

	@Test
	public void testPartion5() 
	{
		//(0,1,2)
		Roots.calculate_roots(0, 1, 2);
		
		double num_roots_expected = 0.0;
		double root_one_expected = -1;
		double root_two_expected = -1;
		
		assertEquals(num_roots_expected, Roots.num_roots, .1);
		assertEquals(root_one_expected, Roots.root_one, .1);
		assertEquals(root_two_expected, Roots.root_two, .1);
	}
	
	@Test
	public void testPartion4()
	{
		Roots.calculate_roots(2, 4, 2);
		
		double num_roots_expected = 1;
		double root_one_expected = -1;
		double root_two_expected = -1;
		
		assertEquals(num_roots_expected, Roots.num_roots, .1);
		assertEquals(root_one_expected, Roots.root_one, .1);
		assertEquals(root_two_expected, Roots.root_two, .1);
	}
	
	@Test
	public void testPartion3()
	{
		Roots.calculate_roots(1, 4, 2);
		
		double num_roots_expected = 2;
		double root_one_expected = -0.6;
		double root_two_expected = -3.4;
		
		assertEquals(num_roots_expected, Roots.num_roots, .1);
		assertEquals(root_one_expected, Roots.root_one, .1);
		assertEquals(root_two_expected, Roots.root_two, .1);	
	}
	
	@Test
	public void testPartition2()
	{
		Roots.calculate_roots(3, 6, 3);
		
		double num_roots_expected = 1;
		double root_one_expected = -1.0;
		double root_two_expected = -1.0;
		
		assertEquals(num_roots_expected, Roots.num_roots, .1);
		assertEquals(root_one_expected, Roots.root_one, .1);
		assertEquals(root_two_expected, Roots.root_two, .1);	
	}
	
	@Test
	public void testPartition1()
	{
		Roots.calculate_roots(10, 5, 9);
		
		double num_roots_expected = 0;
		double root_one_expected = -1.0;
		double root_two_expected = -1.0;
		
		assertEquals(num_roots_expected, Roots.num_roots, .1);
		assertEquals(root_one_expected, Roots.root_one, .1);
		assertEquals(root_two_expected, Roots.root_two, .1);	
	}
}
