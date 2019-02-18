package com.core.algorithm.linkedlist;

public class ReverseMidOfList {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Utility functions */
	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/*
	 * main method
	 */
	public static void main(String args[]) {
		ReverseMidOfList llist = new ReverseMidOfList();
		/* Constructed Linked List is 1->2->3->4->5->null */
		llist.push(15);
		llist.push(14);
		llist.push(13);
		llist.push(12);
		llist.push(11);
		llist.push(10);
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Linked List before moving last to front ");
		llist.printList();
		
		int start = 3;
		int end = 9;
		
		
		llist.reverseList(3,9);
	

	}

	void reverseList(int i, int j) {
		// TODO Auto-generated method stub
		int count = 1 ;
		Node temp = head;
		while(null != temp) {
			count ++;
			if(count == i && i < j) {
				Node temp1 = temp;
				while(null != temp1) {
					Node temp2 = temp1.next;
					temp1.next = temp1.next.next;
				}
			}
			
			temp = temp.next;
		}
		
	}

}
