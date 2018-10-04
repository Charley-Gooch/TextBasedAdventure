public class Player extends Entity {
	public String pClass;
	public String pMainhand;
	public String pOffhand;
	public String pHelmet;
	public String pChestpiece;
	public String pLeggings;
	public Player(String pClass, String eName, int eHealth, String eResourse, int eResourseCount) {
		super(eName, eHealth,eResourse, eResourseCount);
	}
	//GETTERS
	public String getPClass() {
		return pClass;
	}

	public String getPMainhand() {
		return pMainhand;
	}

	public String getPOffhand() {
		return pOffhand;
	}

	public String getPHelmet() {
		return pHelmet;
	}

	public String getPChestpiece() {
		return pChestpiece;
	}

	public String getPLeggings() {
		return pLeggings;
	}
	//SETTERS
	public void setPClass(String pClass) {
		this.pClass = pClass;
	}

	public void setPMainhand(String pMainhand) {
		this.pMainhand = pMainhand;
	}

	public void setPOffhand(String pOffhand) {
		this.pOffhand = pOffhand;
	}
	public void setPHelmet(String pHelmet) {
		this.pHelmet = pHelmet;
	}
	public void setPChestpiece(String pChestpiece) {
		this.pChestpiece = pChestpiece;
	}
	public void setPLeggings(String pLeggings){
		this.pLeggings = pLeggings;
	}
}

