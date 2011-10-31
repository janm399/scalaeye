package org.cakesolutions.scala.example1;

/**
 * @author janmachacek
 */
@org.springframework.stereotype.Repository
public class Repository {

	public Entity getEntityById(Long id) {
		return new Entity();
	}

}
