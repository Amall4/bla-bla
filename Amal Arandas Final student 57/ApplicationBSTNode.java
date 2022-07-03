package finalss;

public class ApplicationBSTNode {
	private Application app;
	private ApplicationBSTNode left;
	private ApplicationBSTNode right;
	
	public  ApplicationBSTNode (){
		left = null;
		right = null;
		app = null;
	}
	public  ApplicationBSTNode(Application b) {
		app= b;
		right = null;
		left = null;
	}
	public Application getApp() {
		return app;
	}
	public void setApp(Application app) {
		this.app = app;
	}
	public ApplicationBSTNode getLeft() {
		return left;
	}
	public void setLeft(ApplicationBSTNode left) {
		this.left = left;
	}
	public ApplicationBSTNode getRight() {
		return right;
	}
	public void setRight(ApplicationBSTNode right) {
		this.right = right;
	}
	public String toString() {
		return app.toString();
	}
}
