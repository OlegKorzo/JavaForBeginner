package korzo.Beans;


public abstract class Tree {
	private String treeType;
	private int age;
	
	Tree(){
		this.treeType = "some tree";
		this.age = 0;		
	};
	
	Tree(String treeType){
		this.treeType = treeType;
		this.age = 0;
	}
	
	Tree(int age){
		this.treeType = "some tree";
		this.age = age;
	}
	
	Tree(String treeType, int age){
		this.treeType = treeType;
		this.age = age;
	}
	
	
	public void whatTree(){
		System.out.println(treeType + " is " + Integer.toString(age) + " years old");
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	
	public String getTreeType() {
		return treeType;
	}

	public void setTreeType(String treeType) {
		this.treeType = treeType;
	}
}
