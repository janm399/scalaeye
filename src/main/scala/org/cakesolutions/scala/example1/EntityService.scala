package org.cakesolutions.scala.example1

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

/**
 * @author janmachacek
 */
@Service
class EntityService @Autowired() (private val repository: Repository) {

  def getEntityById(id: Long) = repository.getEntityById(id)

}