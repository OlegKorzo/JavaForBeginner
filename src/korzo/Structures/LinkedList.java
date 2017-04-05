package korzo.Structures;

import java.util.Iterator;

public class LinkedList implements PLinkedList/*, Iterable*/{
	
	private static final String Node = null;
	private Node node, last;
	private int size = -1;
	
	
	public LinkedList(Node node) {
		this.node = node;
		
	}
	
	public LinkedList() {
		this.node = new Node();
		this.last = new Node();
		this.size = -1;
		System.out.println("LinkedList()");
	}	

	public void add(Object t){
		Node n = new Node();
		
		n.setValue(t);
		if (this.size == -1){
			this.node = n;
			this.last = this.node;
		} else {
			this.last.setNode(n);
			this.last = last.getNode();
			
		}
		this.size++;
	}
	
	public Object get(int index){
		Node tmp = new Node(this.node);
		
		tmp = this.node;
		
		int i = 0;
		//System.out.println(this.node.getIndex());
		

		while (i <= this.size ) {
			//System.out.println(tmp.getValue());
			if (index == i) {
				return tmp.getValue();

			}
			tmp = tmp.getNode();
			i++;
		}
			
		return new String("error");
	}
	
	
	public boolean contains(Object t){
		Node tmp = new Node();
		
		tmp = this.node;
		
		int i = 0;
		
		
		while (i <= this.size) {
			if (t == tmp.getValue())
				return true;
			tmp = tmp.getNode();
			i++;
		}
		
		return false;
		
	}
	
	public Object remove(int index){
		
		if (this.size < 0) return null;
		
		if (index == 0){
			Object t = new Object();
			t = this.node.getValue();
			
			this.node = this.node.getNode();
			
			size--;
			return t;
		}

		
		
		Node cur  = new Node(this.node);
		
		
		//copy = this.node;
		cur = this.node;
		int i = 0;
		
		while (i <= this.size) {
			
			if (i == index - 1){

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
	
/*	
	public Iterator iterator() {
		Iterator iter = new Iterator() {
			private int current = -1;
	
			
			@Override
			public boolean hasNext() {
				return current < getSize();
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
*/
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
		
		System.out.println("size: " + l.getSize());
		
		l.add("000");
		l.add("111");
		l.add("222");
		l.add("333");
		l.add("444");
		
		System.out.println("size: " + l.getSize());
		
		//System.out.println(l.contains("444"));
		
/*
		for (int i=0; i<=l.getSize(); i++){
			System.out.println(l.get(i));
		}
*/		
		
		Object del = new Object(); 
		del = l.remove(0);
		
		l.add("000");
		
		System.out.println("was deleted " + del);
		System.out.println("size: " + l.getSize() + "\r");
/*		
		for (int i=0; i<=l.getSize(); i++){
			System.out.println(l.get(i));
		}
*/		
/*
		Iterator it = l.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().toString());			
		}
		
		it = l.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next().toString());			
		}
*/		
	
	}


}

