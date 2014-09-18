package pattern.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		
		Scanner userImput = new Scanner(System.in);
		System.out.println("Qual tipo de nave? (U / R)");
		String enemyShipOption = null;
		
		if(userImput.hasNextLine()) {
			enemyShipOption = userImput.nextLine();
		}
		
		EnemyShip enemyShip = enemyShipFactory.makeEnemyShip(enemyShipOption);
		doStuffEnemy(enemyShip);
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enenmyShipShooting();
	}

}
