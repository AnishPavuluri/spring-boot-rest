package com.event.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.event.dto.EventDto;
/**
 * Repository class
 * @author Anish
 */
@Repository
public interface EventRepository extends CrudRepository<EventDto, Long> {

   

}
