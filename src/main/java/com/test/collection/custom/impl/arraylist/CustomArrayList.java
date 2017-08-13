package com.test.collection.custom.impl.arraylist;

import java.util.Arrays;

/**
 * 
 * @author aayushraj
 *
 * @param <E>
 */
public class CustomArrayList<E> {

	private static final int INITIAL_CAPACITY = 10;
	private Object elements[] = {};
	private int size = 0;

	/**
	 * constructor.
	 */
	public CustomArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}

	/**
	 * method adds elements in ArrayListCustom.
	 */
	public void add(E e) {
		if (size == elements.length) {
			ensureCapacity(); // increase current capacity of list, make it
								// double.
		}
		elements[size++] = e;
	}

	/**
	 * method returns element on specific index.
	 */
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < 0 || index >= size) { // if index is negative or greater
											// than size of size, we throw
											// Exception.
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elements[index]; // return value on index.
	}

	/**
	 * method returns removedElement on specific index. else it throws
	 * IndexOutOfBoundException if index is negative or greater than size of
	 * size.
	 */
	public Object remove(int index) {
		if (index < 0 || index >= size) { // if index is negative or greater
											// than size of size, we throw
											// Exception.
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}

		Object removedElement = elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--; // reduce size of ArrayListCustom after removal of element.

		return removedElement;
	}

	/**
	 * method increases capacity of list by making it double.
	 */
	private void ensureCapacity() {
		int newIncreasedCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newIncreasedCapacity);
	}

	/**
	 * method displays all the elements in list.
	 */
	public void display() {
		System.out.print("Displaying list : ");
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
	}
	
	
}
