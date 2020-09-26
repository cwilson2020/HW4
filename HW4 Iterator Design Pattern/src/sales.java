import java.util.ArrayList;

public class sales {

	ArrayList<SalesPeople> peopleList;

	public sales() {
		peopleList = new ArrayList<SalesPeople>();

	}

	public void addPeople(String employeeName, String team, int salesTotal ) {
		SalesPeople sp = new SalesPeople(employeeName,team, salesTotal);
	  peopleList.add(sp);	
	}
}
