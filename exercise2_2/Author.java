package exercise2_2;

public class Author {
	private String name, email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		this.email = email;
	}
	public char getGender() {
		if(gender == 'm' || gender == 'f') {
			return this.gender = gender;
		}else {
		System.out.println("Invalid gender. Use 'm' for male or 'f'for female");
	      return 1;
		}
    }
	public String toString() {
		return "Author[name="+ name +" ,email="+email+" ,gender="+gender+"]";
	}
}
