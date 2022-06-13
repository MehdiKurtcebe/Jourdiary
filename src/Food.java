
public class Food {
	private String name;
	private Integer cal;

	public Food(String name, Integer cal) {
		this.name = name;
		this.cal = cal;
	}

	public String getNameOfFood() {
		return name;
	}

	public void setNameOfFoods(String name) {
		this.name = name;
	}

	public void setCalOfFood(Integer cal){
		this.cal = cal;
	}

	public Integer getCalOfFood(){
		return cal;
	}
}
