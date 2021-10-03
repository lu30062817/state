package state;

public class BuyState implements State {
	Fishtank fishtank;
	public BuyState(Fishtank fishtank) {
		this.fishtank = fishtank;
	}

	@Override
	public void buyFishtank() {
		System.out.println("Fishes to be brought");
		
	}

	@Override
	public void oxygenFishtank() {
		System.out.println("oxygen levels are low ");
		fishtank.setState(fishtank.getOxygenState());
		
	}

	@Override
	public void fishFishtank() {
		System.out.println("fishes are more");
		fishtank.setState(fishtank.getFishState());
		
	}

	@Override
	public void waterFishtank() {
		System.out.println("Water should be changed");
		fishtank.setState(fishtank.getWaterState());

	}
	public String toString() {
		return "new fishtank";
	}

}
