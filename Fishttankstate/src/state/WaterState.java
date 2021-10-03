package state;

public class WaterState implements State {
	Fishtank fishtank;
	public WaterState(Fishtank fishtank) {
		this.fishtank = fishtank;
	}

	@Override
	public void buyFishtank() {
		System.out.println("new fish is to bought");

	}

	@Override
	public void oxygenFishtank() {
		System.out.println("maintain oxygen level");
		fishtank.setState(fishtank.getOxygenState());
	}

	@Override
	public void fishFishtank() {
		System.out.println("fishes are big");
		fishtank.setState(fishtank.getFishState());

	}

	@Override
	public void waterFishtank() {
		System.out.println("water is dirty !! plz change");

	}
	public String toString() {
		return " being cleaned";
	}
}
