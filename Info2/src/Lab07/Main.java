package Lab07;

public class Main {

	public static void main(String[] args) {

		String s = "1";
		String t = "2";
		String r = "3";

		StackAsList stack = new StackAsList(s);
		try {
			stack.push(t);
			stack.push(r);
			System.out.println(stack.top());
			stack.pop();
			System.out.println(stack.top());
			stack.pop();
//			System.out.println(stack.top());

		} catch (OverflowException e) {
			e.printStackTrace();
		} catch (UnderflowException e) {
			e.printStackTrace();
		}
		
	}

}
