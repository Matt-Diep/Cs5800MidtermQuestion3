
public class Driver {

	public static void main(String[] args) {
		Command commandOne = new operationOne();
		Command commandTwo = new operationTwo();
		
		commandOne.execute();
		commandTwo.execute();

	}

}
