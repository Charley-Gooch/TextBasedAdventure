public class Entity {
	private String eName;
	private String eResource;
	private int eHealth;
	private int eResourceCount;
	private int attack;
	private int defence;

	public Entity(String eName, int eHealth, String eResource, int eResourceCount) {
		this.eName = eName;	
		this.eHealth = eHealth;
		this.eResource = eResource;
		this.eResourceCount = eResourceCount;
	}
	//ENTITY
	//GETTERS
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefence() {
		return this.defence;
	}
	
	public String getName() {
		return this.eName;
	}

	public int getHealth() {
		return this.eHealth;
	}

	public String getResource() {
		return this.eResource;
	}

	public int getResourceCount() {
		return this.eResourceCount;
	}
	//SETTERS
	public void setResourceCount(int resource_count) {
		this.eResourceCount = resource_count;
	}

	public void setHealth(int health_count) {
		this.eHealth = health_count;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
}
