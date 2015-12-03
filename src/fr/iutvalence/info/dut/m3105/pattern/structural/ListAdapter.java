package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<E> implements Stack<E>
{
	public List<E> list;

	@Override
	public void push(E object) 
	{
		list.add(list.size(),object);
	}

	@Override
	public E peek() {
		return list.get(list.size());
	}
	@Override
	public E pop() {
		return list.remove(list.size());
	}

	@Override
	public int size() {
		return list.size();
	}
	
	
}
