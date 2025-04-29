package BirdsOOPS;

public class Creature {
	protected String speciesName;
	protected String skinColor;
	protected int mass;

	public String getSpeciesName() {
		return speciesName;
	}
	public String getSkinColor() {
		return skinColor;
	}
	public int getMass() {
		return mass;
	}
	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}
	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}
}