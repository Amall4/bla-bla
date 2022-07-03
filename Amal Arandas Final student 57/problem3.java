package finalss;

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) throws NotValidPriceException, NotValidStarsException {
		Scanner scan = new Scanner(System.in);
		ApplicatonList apl = null;
		System.out.println("** Application 1 **");
		System.out.println("Please enter the name of Application 1: ");
		String name = scan.next();
		System.out.println("Please enter the price of Application 1:");
		double x = scan.nextDouble();
		System.out.println("Please enter the Star Rating of Applicaton 1:");
		int s = scan.nextInt();
		try {
			Application App1 = new Application(name,x,s);
		} catch (NotValidPriceException e) {
			System.out.println(e);
		} catch (NotValidStarsException e) {
			System.out.println(e);
		}
		System.out.println("** Application 2 **");
		System.out.println("Please enter the name of Application 2: ");
		String name1 = scan.next();
		System.out.println("Please enter the price of Application 2:");
		double x1 = scan.nextDouble();
		System.out.println("Please enter the Star Rating of Applicaton 2:");
		int s1 = scan.nextInt();
		try {
			Application App2 = new Application(name1,x1,s1);
		} catch (NotValidPriceException e) {
			System.err.println(e.getMessage());
		} catch (NotValidStarsException e) {
			System.err.println(e);
		}
		Application app1 = new Application("App1",2.50,3);
		Application app2 = new Application("App2",3.00,2);
		Application app3 = new Application("App2",3.00,2);
		Application app4 = new Application("App3",1.75,5);
		Application app5 = new Application("App4",1.25,5);
		Application app6 = new Application("App5",0.00,5);
		Application app7 = new Application("App2",0.00,3);
		apl = new ApplicatonList();
		apl.addApplication(app1);
		apl.addApplication(app2);
		apl.addApplication(app3);
		apl.addApplication(app4);
		apl.addApplication(app5);
		apl.addApplication(app6);
		apl.addApplication(app7);
		System.out.println(apl.toString());
		System.out.println("The free of charge applications are: ");
		System.out.println(apl.getFreeApplicationList());
		System.out.println("Remove App2....");
		apl.removeApplication("App2");
		System.out.println(apl.toString());
		System.out.println("Building the tree using my AppList");
		System.out.println("Display the tree - InOrder (left-root-right)");
		ApplicationBSTNode aplbst = new ApplicationBSTNode();
		ApplicationBSTree aplbsttr = new ApplicationBSTree();
		ApplicationBSTree tree = new ApplicationBSTree();
		tree.BuildBSTree(apl);
		System.out.println(tree.toString());
		System.out.println("Number of Applications with 5 stars = "+tree.countNodesOfStars(5));
		System.out.println("Average price of Applications with 5 stars = "+tree.AvgPriceAppsOfStars(5));
		
		
		
		
		
		
	}

}
