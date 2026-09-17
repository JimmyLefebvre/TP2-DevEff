package sLists;

public class SinglyListClass {
	private Node header;
	private long size;

	public SinglyListClass() {
		header = null;
		size = 0;
		}

	
//	public SinglyListClass(Node header) {
//		this()
//		this.header = header;
//		size = 1;
//	}
	
//	public SinglyListClass(Node header, long size) {
//		this.header = header;
//		this.size = size;
//	}
	
	public void addLast(Integer element) {
		Node newNode = new Node(element);
		
		if (header == null) {
			header = newNode;
		} else {

			Node current = header;
			while (current.getNext() != null) {
				current = current.getNext();
			}

			current.setNext(newNode);
		}
		size++;
	}
	
	public Node getHeader() {
		return header;
	}


	public void setHeader(Node header) {
		this.header = header;
	}


	public long getSize() {
		return size;
	}


	public void setSize(long size) {
		this.size = size;
	}

	private static class Node {

		private Integer element;
		private Node next;

		public Node(Integer element) {

			this.element = element;
		}

		public Node(Integer element, Node next) {

			this.element = element;
			this.next = next;
		}

		public String toString() {
			return element.toString();
		}

		public Integer getElement() {
			return element;
		}

		public void setElement(Integer element) {
			this.element = element;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public String toString() {
		if (header==null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder(header.toString());
		Node current = header;
		while(current.getNext() != null) {
			current = current.getNext();
			sb.append("-" + current.toString());
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SinglyListClass maListe = new SinglyListClass();
		System.out.println("test1 ('null') : " + maListe);
		maListe.addLast(5);
		System.out.println("test2 (5) : " + maListe);
		maListe.addLast(2);
		maListe.addLast(7);
		System.out.println("test3 (5-2-7) : " + maListe);
		// TODO Auto-generated method stub

	}

}
