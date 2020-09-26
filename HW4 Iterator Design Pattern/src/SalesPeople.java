
public class SalesPeople {

	public SalesPeople(String name, String team, int salesTotals) {
		super();
		this.name = name;
		this.team = team;
		this.salesTotals = salesTotals;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalesTotals() {
		return salesTotals;
	}
	public void setSalesTotals(int salesTotals) {
		this.salesTotals = salesTotals;
	}
	private String team;
	
	private int salesTotals;
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
}
