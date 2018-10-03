package com.charley.gooch;

public class Entity {
	public String eName;
	public String eResource;
	public int eHealth;
	public int eResourceCount;
	
	public Entity(String eName, int eHealth, String eResource, int eResourceCount) {
		this.eName = eName;	
		this.eHealth = eHealth;
		this.eResource = eResource;
		this.eResourceCount = eResourceCount;
	}
	//ENTITY
	//GETTERS  
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
}
