package logical;

public class Designer {
	protected String id;
	protected String name;
	protected String last_name;
	protected String address;
	protected String gender;
	protected int age;
	protected float salary;
	protected String project_name;
	protected String calification;
	
	public Designer(String id, String name, String last_name, String address, String gender, int age, float salary, String project_name, String calification) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.project_name = project_name;
		this.calification = calification;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getCalification() {
		return calification;
	}

	public void setCalification(String calification) {
		this.calification = calification;
	}
}
