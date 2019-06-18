package tw.idv.cwchen.patterns.state;

public class Client {
	
	public static void main(String args[]) {
			Context context = new Context();
			State state1 = new ConcreteState1();
			State state2 = new ConcreteState2();
			State state3 = new ConcreteState3();
			State state4 = new ConcreteState4();
			State state5 = new ConcreteState5();
			
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print("      ");
			
			context.setState(state4);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state2);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state2);
			context.sampleOperation();
			System.out.print("      ");
			
			context.setState(state1);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state2);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state4);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state5);
			context.sampleOperation();
			System.out.print("      ");
			
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print("      ");
			
			context.setState(state4);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state2);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state2);
			context.sampleOperation();
			System.out.print("      ");
			
			context.setState(state1);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state3);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state5);
			context.sampleOperation();
			System.out.print(" ");
			context.setState(state1);
			context.sampleOperation();
			System.out.print("      ");
	}
}
