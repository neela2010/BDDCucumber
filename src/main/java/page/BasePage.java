package page;

import java.util.Random;

public class BasePage {
	
	public int randomGenerator() {
		Random rnd = new Random();
		int rndNum = rnd.nextInt(99);
		return rndNum;

	}

}
