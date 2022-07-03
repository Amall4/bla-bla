package finalss;

import java.util.LinkedList;

public class ApplicationBSTree {
	private ApplicationBSTNode root;
	
	public ApplicationBSTree() {
		root = null;
	}

	public ApplicationBSTNode getRoot() {
		return root;
	}

	public void setRoot(ApplicationBSTNode root) {
		this.root = root;
	}
	public void add(Application N) {
		root = insetRec(root,N);
	}
	public ApplicationBSTNode insetRec(ApplicationBSTNode root, Application b )
	{
		if (root==null) {
			root = new ApplicationBSTNode(b);
			return root;
		}
		else {
			if(b.compareTo(root.getApp())<0) {
				root.setLeft(insetRec(root.getLeft(),b));
			}
		}
			if (b.compareTo(root.getApp())>0){
			root.setRight(insetRec(root.getRight(),b));
	}
		return root;
	}
	public void  BuildBSTree(ApplicatonList myList) {
		LinkedList<Application> temp = myList.getAppList();
		for(Application i:temp)
			this.add(i);
	}
	public void inorder() {
		inorderRec(root);
	}
	public void inorderRec(ApplicationBSTNode cur) {
		if (cur!=null) {
			inorderRec(cur.getLeft());
			System.out.print(cur+" ");
			inorderRec(cur.getRight());
		}
	}
	public int countNodesOfStars(int s) {
		return countNodesRec(root,s);
	}
	private int countNodesRec(ApplicationBSTNode root2, int s) {
		if (root2 != null && root2.getApp().getStars()==s) {
			return 1 + countNodesRec(root2.getLeft(),s) + countNodesRec(root2.getRight(),s);
		}
		return 0;
	}
	public  double AvgPriceAppsOfStars(int s) {
		return SumOfPiecesOfStars(root,s);
	}
	public double SumOfPiecesOfStars(ApplicationBSTNode root3, int s) {
		if (root3!=null && root.getApp().getStars()==s) {
			return root3.getLeft().getApp().getPrice()+root3.getRight().getApp().getPrice()+SumOfPiecesOfStars(root.getLeft(),s)+SumOfPiecesOfStars(root.getRight(),s);
		}
		return 0;
		
}
}
