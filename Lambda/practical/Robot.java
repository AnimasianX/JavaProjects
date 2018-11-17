package Lambda.practical;

public class Robot {

	String type;
	int age;
	public Robot(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Robot [type=" + type + ", age=" + age + "]";
	}
	
	
}
