import org.junit.Test;
import static org.junit.Assert.*;

public class CardTests {

		@Test
		public void NewCardContainsSuit() {
			Card card = new Card();
			assertEquals("New Card does not have value Suit initialised", null,card.getSuit());
		}
		
		@Test
		public void NewCardContainsValue() {
			Card card = new Card();
			assertEquals("New Card does not have value Value initialised",null,card.getValue());
		}
}
