package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<E> {
	public void add(int place, E o);
	
	public E remove(int place);
	
	public E get(int place);
	
	public int size();
}
