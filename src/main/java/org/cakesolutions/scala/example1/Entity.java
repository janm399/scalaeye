package org.cakesolutions.scala.example1;

/**
 * @author janmachacek
 */
// This would probably be JPA annotated
public class Entity {
	private Long id;
	private int version;
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
