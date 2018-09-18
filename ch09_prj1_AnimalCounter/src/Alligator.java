
public class Alligator extends Animal {
	public Alligator() {
	}
	
	@Override
	public void incrementCount() {
		setCt(getCount()+1);
	}
	
	@Override
	public void resetCount() {
		
		setCt(0);
	}
	
	@Override
	public int getCount() {
		
		return getCt();
	}
	
	@Override
	public String getCountString() {
		
		return getCount() + " " + "alligator...";
	}

}
