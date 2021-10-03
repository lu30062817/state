package state;

public class Fishtank {
	State oxygenState;
	State buyState;
	State fishState;
	State waterState;
	
	State state;
	public Fishtank() {
		oxygenState = new OxygenState(this);
		buyState = new BuyState(this);
		fishState = new FishState(this);
		waterState = new WaterState(this);
		
		state = buyState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getOxygenState() {
		return oxygenState;
	}
	public State getWaterState() {
		return waterState;
	}
	public State getFishState() {
		return fishState;
	}
	public State getBuyState() {
		return buyState;
	}
	public void waterFishtank() {
		state.waterFishtank();
	}
	public void oxygenFishtank() {
		state.oxygenFishtank();
	}
	public void fishFishtank() {
		state.fishFishtank();
	}
	public void buyFishtank() {
		state.buyFishtank();
	}
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("\n\n");
		buffer.append( state + "\n");
		return buffer.toString();
	}

}
