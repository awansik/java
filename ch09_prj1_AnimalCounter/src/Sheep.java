
public class Sheep extends Animal implements Cloneable {
	private String name;
	
	public Sheep(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void incrementCount() {
		setCt(getCount()+1);
	}
	
	@Override
	public int getCount() {
		return getCt();
	}
	
	@Override
	public void resetCount() {
		setCt(0);
	}
	
	@Override
	public String getCountString() {
		return getCt() +" " +name +"...";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}