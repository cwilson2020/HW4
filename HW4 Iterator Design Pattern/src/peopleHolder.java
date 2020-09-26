
public class peopleHolder {

	SalesPeople array[];
	int index = 0;
	
	public peopleHolder(int size) {
		super();
		array = new SalesPeople[size];
	}


	public void add(SalesPeople person) {
		array[index++] = person;
	}
	
	public SalesPeople[] getPeople(){
		return array;
	}
}
