package finalss;

import java.util.LinkedList;

public class ApplicatonList {
private LinkedList<Application> AppList;
	
	public ApplicatonList(){
		AppList = new LinkedList<Application>();
	}
	public LinkedList<Application> getAppList(){
		return AppList;
	}
	public void addApplication(Application X) {
		AppList.add(X);
	}
	public void removeApplication(String x) {
		for (int i=0;i<AppList.size();i++) {
			if (AppList.get(i).getName()==(x)) {
				AppList.remove(i);
				System.out.println("Application "+x+" was removed!");
			}
		}
		}
	public String isInTheList(Application b) {
		for (Application e: AppList) {
			if (b.isEqual(e)) {
				return b.toString();
	}
		}
		return "Appplication "+b.toString()+"does not exist";
}
	public LinkedList<Application> getFreeApplicationList(){
		LinkedList<Application> app2 = new LinkedList<Application>();
		for (Application e: AppList) {
		if (e.getPrice()==0) {
			app2.add(e);
		}
		}
		return app2;
	}	
	public String toString() {
		String x = "";
		for(int i=0;i<AppList.size();i++) {
			if (i!=AppList.size()-1)
				x+=AppList.get(i).toString()+"\n";
			else x += AppList.get(i).toString();
		}
		return "*** My Application List ***\n"+x;
	}
}

