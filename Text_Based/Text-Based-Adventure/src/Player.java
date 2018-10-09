public class Player extends Entity {
	private String pClass;
	private String pMainhand;
	private String pOffhand;
	private String pHelmet;
	private String pChestpiece;
	private String pLeggings;
	
	public Player(String pClass, String eName) {
		super(eName);
		this.pClass = pClass;
	}
	public void printAll() {
		System.out.println(pClass);
		System.out.println(pHelmet);
		System.out.println(pChestpiece);
		System.out.println(pLeggings);
		System.out.println(pMainhand);
		System.out.println(pOffhand);
		System.out.println(getHealth());
		System.out.println(getResource());
		System.out.println(getResourceCount());
		System.out.println(getSTR());
		System.out.println(getCON());
		System.out.println(getAGI());
		System.out.println(getINT());
		System.out.println(getCHA());
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

