package cfranc.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeddyTest {

	@Test
	public void test1() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String res = m.generateText(p, 10);
		assertNotNull(res);
		System.out.println(res);
	}
        @Test
	public void test2() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = Markov.randomElement(m.couples.keySet());
		String test = m.generateText(p, 0);
		String vide = "";
	}
        @Test
	public void test3() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = new Couple("il","il" );
                System.out.println(equals(p));      
	}
        
        @Test
	public void test4() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
		Couple p = new Couple("est","il" );
                System.out.println(equals(p));      
	}
        
        @Test ///HashCode
	public void test5() {
		Markov m = new Markov();
		m.readFile("cosette.txt");
                
		Couple a = new Couple ("il", "était");
                Couple b = new Couple ("il", "était");
                
                System.out.println(a.hashCode()); 
                System.out.println(b.hashCode()); 
	}       
}