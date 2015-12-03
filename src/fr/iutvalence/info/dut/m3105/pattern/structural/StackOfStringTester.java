package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	public Stack<String> stack;

	public StackOfStringTester(Stack<String> stack) {
		super();
		this.stack = stack;
	}




	public void testStack()
	{
		/*logs (i.e. prints on standard output) the size of the stack
		pushes "a" string on top of the stack, and logs it is done
		logs the size of the stack
		pushes "b" string on top of the stack, and logs it is done
		logs the size of the stack
		peeks the top of the stack, and logs its value
		logs the size of the stack
		pops the top of the stack, and logs its value
		logs the size of the stack
		pops the top of the stack, and logs its value
		logs the size of the stack;*/
		
		System.out.println(stack.size());
		stack.push("a");
		System.out.println(stack.size());
		stack.push("b");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}
}
