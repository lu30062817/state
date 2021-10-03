package state;

public class OxygenState implements State {
	Fishtank fishtank;
	public OxygenState(Fishtank fishtank) {
		this.fishtank = fishtank;
	}

	@Override
	public void buyFishtank() {
		System.out.println("buying fishtank ");
		fishtank.setState(fishtank.getBuyState());
	}

	@Override
	public void oxygenFishtank() {
		System.out.println("oxygen level low");

	}

	@Override
	public void fishFishtank() {
		System.out.println("fish tank cannot accomodate more fishes");

	}

	@Override
	public void waterFishtank() {
		System.out.println("dirty water cannot be used");

	}
	public String toString() {
		return " water need to be changed";
	}
}
