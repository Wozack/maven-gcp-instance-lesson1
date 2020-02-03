import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.tutorial.Interaction;

public class InteractionTest {


   @Test
     public void greetingTest() {
	   Interaction interaction = new Interaction();
	   assertEquals("Hi Friendo!", interaction.greeting());
	   
   }
   
   @Test
   public void insultTest() {
	   Interaction interaction2 = new Interaction();
	   assertEquals("is trash!", interaction2.insult());
	   
   }
}
