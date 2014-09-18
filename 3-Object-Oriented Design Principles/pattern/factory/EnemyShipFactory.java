package pattern.factory;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String type) {
		if(type.equals("U")) {
			return new UFOEnemyShip();
		}else if(type.equals("R")) {
			return new RocketEnemyShip();
		}else return null;
	}
	
}
