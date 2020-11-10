package com.b1l1.aplication;

public class TestInteger {

	public static void main(String[] args) {
		MyLinkedList <Integer> list= new MyLinkedList<>();
		list.addFirst(-2);
		list.addLast(3);
		list.addAfter(list.getHead(),4);
		System.err.println(list);
	System.out.println("tong so chan la:" +TestInteger.countEven(list));

	}

	public static int countEven(MyLinkedList<Integer> list) {
		int count = 0;
		Node<Integer> tmp = list.getHead();
		System.err.println(tmp.getData());
		while (tmp.getNext() != null) {
			if (tmp.getData() % 2 == 0) {
				count++;
			}
			tmp = tmp.getNext();
		}
		return count;
	}
}
