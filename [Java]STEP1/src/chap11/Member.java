package chap11;

public class Member {
	private String id, name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id.toString() + ": " + name.toString();
	}
}
