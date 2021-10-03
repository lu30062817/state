package state;

public class FishState implements State {
	Fishtank fishtank;
	public FishState(Fishtank fishtank) {
		this.fishtank = fishtank;
	}

	@Override
	public void buyFishtank() {
		System.out.println("big fishtank already bought");

	}

	@Override
	public void oxygenFishtank() {
		System.out.println("arrange oxygen");
		fishtank.setState(fishtank.getOxygenState());

	}

	@Override
	public void fishFishtank() {
		System.out.println("Fishes are placed in new fishtank");

	}

	@Override
	public void waterFishtank() {
		System.out.println("change water in the fishtank");
		fishtank.setState(fishtank.getWaterState());
	}
	public String toString() {
		return " new fishes arrived";
	}
}
