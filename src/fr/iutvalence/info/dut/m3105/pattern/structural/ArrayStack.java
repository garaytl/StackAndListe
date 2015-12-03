package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack <E> implements Stack<E>
{
	
	private int taille;
	
	private E[] stack;
	
	public ArrayStack() {
		super();
		this.taille = 0;
		this.stack = (E[])new Object[10];
	}

	public void push(E o)
	{
		this.stack[this.taille] = o;
		this.taille ++;
	}

	@Override
	public E peek() {
		return this.stack[this.taille - 1];
	}

	@Override
	public E pop() {
		E object = this.stack[this.taille - 1];
		this.taille = this.taille - 1;
		return object;
				
	}

	@Override
	public int size() {
		return this.taille;
	}


}
