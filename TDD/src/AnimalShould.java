import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnimalShould {

	private Animal[] animals;

	@Before
	public void init(){
		animals = new Animal[] {new Dog(), new Cat()};
		
	}
	
	@Test
	public void BarkLikeDog() {
		assertEquals("BOW BOW", animals[0].bark());
	}
	
	@Test
	public void BarkLikeCat() {
		assertEquals("MEOW MEOW", animals[1].bark());
	}

}
