
public abstract class Command {
	public abstract void execute();
}

class operationOne extends Command{
	
	@Override
	public void execute(){
		System.out.println("Performs Operation One.");
	}
	
}

class operationTwo extends Command{
	
	@Override
	public void execute() {
		System.out.println("Performs operation Two ");
	}
}