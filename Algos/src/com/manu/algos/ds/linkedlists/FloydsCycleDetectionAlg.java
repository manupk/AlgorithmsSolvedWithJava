package com.manu.algos.ds.linkedlists;


public class FloydsCycleDetectionAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean hasLoop(Node first) {

		if (first == null) // list does not exist..so no loop either.
			return false;

		Node slow, fast; // create two references.

		slow = fast = first; // make both refer to the start of the list.

		while (true) {

			slow = slow.next; // 1 hop.

			if (fast.next != null)
				fast = fast.next.next; // 2 hops.
			else
				return false; // next node null => no loop.

			if (slow == null || fast == null) // if either hits null..no loop.
				return false;

			if (slow == fast || fast.next == slow ) // if the two ever meet...we must have a loop.
				return true;
		}
		
	}
	
	public static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			return this.data;
		}
	}
}
