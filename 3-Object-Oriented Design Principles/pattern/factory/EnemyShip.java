package pattern.factory;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmtDamage() {
		return amtDamage;
	}

	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	public void followHeroShip() {
		System.out.println(getName() + " esta seguido o Hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + " mostrando na tela");
	}
	
	public void enenmyShipShooting() {
		System.out.println(getName() + " attack and does " + getAmtDamage());
	}
	
}
