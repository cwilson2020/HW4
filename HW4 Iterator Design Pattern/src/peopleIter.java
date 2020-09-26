import java.util.Iterator;

public class peopleIter implements Iterator<SalesPeople>{

	private SalesPeople spArray[];
	private int index = 0;

	public peopleIter(SalesPeople[] peopleList) {
		spArray = peopleList;
	}

	@Override
	public boolean hasNext() {
		boolean ret = true;
		
			 if (index >= spArray.length)
				ret = false;
		
		
		else if (spArray[index] == null)
			ret = false;

	return ret;
	}

	@Override
	public SalesPeople next() {
		return spArray[index++];
	}

}
