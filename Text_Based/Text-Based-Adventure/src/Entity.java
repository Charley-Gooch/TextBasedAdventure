public class Entity {
	private String eName;
	private String eResource;
	private int eHealth;
	private int eResourceCount;
	private int attack;
	private int defence;
	private int spell;
	private int STR;
	private int CON;
	private int AGI;
	private int INT;
	private int CHA;

	public Entity(String eName) {
		this.eName = eName;
	}
	//ENTITY
	//GETTERS
	public int getAttack() {
		return this.attack;
	}
	
	public int getDefence() {
		return this.defence;
	}
	public int getSpell() {
		return this.spell;
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
	public int getSTR() {
		return STR;
	}
	public int getCON() {
		return CON;
	}
	public int getAGI() {
		return AGI;
	}
	public int getINT() {
		return INT;
	}
	public int getCHA() {
		return CHA;
	}
	//SETTERS
	public void setResourceCount(int resource_count) {
		this.eResourceCount = resource_count;
	}

	public void setHealth(int health_count) {
		this.eHealth = health_count;
	}
	public void setResource(String resource) {
		this.eResource = resource;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public void setSepll(int spell) {
		this.spell = spell;
	}
	
	public void setSTR(int sTR) {
		STR = sTR;
	}
	
	public void setCON(int cON) {
		CON = cON;
	}
	
	public void setAGI(int aGI) {
		AGI = aGI;
	}
	
	public void setINT(int iNT) {
		INT = iNT;
	}
	
	public void setCHA(int cHA) {
		CHA = cHA;
	}
}
