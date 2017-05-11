package korzo.Structures;

import java.util.Iterator;

public class LinkedList implements PLinkedList/*, Iterable*/{
	
	private static final String Node = null;
	private Node node, last;
	private int size = 0;
	
	
	public LinkedList(Node node) {
		this.node = node;
		
	}
	
	public LinkedList() {
		this.node = new Node();
		this.last = new Node();
		this.size = 0;
	}	

	public void add(Object t){
		Node n = new Node();
		
		n.setValue(t);
		if (this.size == 0){
			this.node = n;
			this.last = this.node;
		} else {
			this.last.setNode(n);
			this.last = last.getNode();
			
		}
		this.size++;
	}
	
	public Object get(int index){
		
		if (size == 0) throw new Error("List is empty");
		if (index < 0) throw new Error("Asked index less then 0");
		if (index > this.size) throw new Error("Asked index greater than List size");
		
		Node tmp = new Node(this.node);
		
		int i = 0;
		while (i < this.size ) {
			if (index == i) {
				return tmp.getValue();

			}
			tmp = tmp.getNode();
			i++;
		}
			
		if (index > this.size) throw new Error("Asked index greater than List size. That was found after checking the whole list.");
		
		return null;
	}
	
	
	public boolean contains(Object t){
		
		return int_contains(t) == -1 ? false : true;
	}
	
	public int int_contains(Object t){

		if (this.size == 0) return -1;
		
		Node tmp = new Node(this.node);
		int i = 0;
		
		while (i < this.size) {
			if (tmp.getValue().equals(t)){
				return i;
			}
			tmp = tmp.getNode();
			i++;
		}
		return -1;
	}
	
	public Object remove(int index){
		
		//if (this.size == 0) return null;
		
		System.out.println("need to remove " + index);
		
		if (index == 0){
			
			Object t = this.node.getValue();
			this.node = this.node.getNode();
			
			size--;
			return t;
		}

		Node cur  = new Node(this.node);
		
		cur = this.node;
		int i = 0;
		
		while (i <= this.size) {
			if (i == index){
				Object t = new Object();
				t = cur.getNode().getValue();
				cur.setNode(cur.getNode().getNode());
				
				size--;
				return t;
			}
			cur = cur.getNode();
			i++;
		}
		
		return null;
	}
	
	
	public int getSize(){
		return this.size;
	}
	
	
	public Iterator iterator() {
		Iterator iter = new Iterator() {
			private int current = -1;
	
			@Override
			public boolean hasNext() {
				return current < getSize()-1;
			}
			
			@Override
			public Object next() {
		        return get(++current);
			}
			
			@Override
			public void remove() {
				Iterator.super.remove();
			}
			
			
		};
		return iter;
	}

	@Override
	public String toString(){
		String s = "";
		Node start = new Node();
		start = node;
		
		int i = 0;
		while (i < this.size) {
			s += start.getValue().toString();
			start = start.getNode();
			i++;
		}
		
		return s;
	}
	
	public static void main(String[] args){
		LinkedList l = new LinkedList();
		Iterator it = l.iterator();
		
		System.out.println("size: " + l.getSize());
		
		l.add("000");
		l.add("111");
		l.add("222");
		l.add("333");
		l.add("444");
		
		System.out.println(l.get(0));
		
		System.out.println("size: " + l.getSize());
		
		while(it.hasNext()){
			System.out.println(it.next().toString());			
		}
		
		//System.out.println(l.contains("444"));
		
/*
		for (int i=0; i<=l.getSize(); i++){
			System.out.println(l.get(i));
		}
*/		
		
		Object del = new Object(); 
		del = l.remove(0);
		
		l.add("000");
		
		System.out.println("contains 111: " + l.contains(new String("111")));
		System.out.println("was deleted " + del);
		System.out.println("size: " + l.getSize() + "\r");
/*		
		for (int i=0; i<=l.getSize(); i++){
			System.out.println(l.get(i));
		}
*/
		
		it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());			
		}

		
		
		
		
	
	}


}

