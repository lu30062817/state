package state;

public class FishTankState {

	public static void main(String[] args) {
		Fishtank fishtank = new Fishtank();
		
		System.out.println(fishtank);
		
		//bought State
		fishtank.buyFishtank();
		fishtank.oxygenFishtank();
		fishtank.waterFishtank();
		fishtank.fishFishtank();
		fishtank.buyFishtank();
		System.out.println(fishtank);
		//wash state
		fishtank.buyFishtank();
		fishtank.waterFishtank();
		fishtank.fishFishtank();
		fishtank.oxygenFishtank();
		System.out.println(fishtank);
		//serving state
		fishtank.buyFishtank();
		fishtank.fishFishtank();
		fishtank.waterFishtank();
		fishtank.oxygenFishtank();
		

	}

}
