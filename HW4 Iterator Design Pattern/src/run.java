
public class run {

	public run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SalesPeople person1 = new SalesPeople("Teresa", "Widgets", 200);
		SalesPeople person2 = new SalesPeople("Frank", "Widgets", 250);
		SalesPeople person3 = new SalesPeople("Chris", "Gifts", 10);
		SalesPeople person4 = new SalesPeople("Angie", "Appliances", 675);
		SalesPeople person5 = new SalesPeople("Hillary", "Gifts", 2500);
		SalesPeople person6 = new SalesPeople("Ralph", "Appliances", 0);
		
		peopleHolder ph = new peopleHolder(6);
		
		ph.add(person1);
		ph.add(person2);
		ph.add(person3);
		ph.add(person4);
		ph.add(person5);
		ph.add(person6);
		
		peopleIter pi = new peopleIter(ph.getPeople());
		
		while (pi.hasNext()) {
		SalesPeople tempPerson = pi.next();
		System.out.println("Name:" + tempPerson.getName() + " \t Team:" +  tempPerson.getTeam() + "\t\tSales Totals:" + String.valueOf(tempPerson.getSalesTotals()));
		}
	}

}
