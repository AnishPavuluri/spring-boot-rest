package com.event.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.dao.EventRepository;
import com.event.dto.EventDto;
import com.event.form.EventForm;
import com.utils.StringConstants;
/**
 * Controller class
 * @author Anish
 *
 */
@RestController
public class EventsController {
	
	@Autowired
	EventRepository eventRepository;
	/**
	 * The method to return All TODOS 
	 * @return
	 */
	@RequestMapping(value="/events", method=RequestMethod.GET)
	@ResponseBody
    public List<EventForm> getAllTodos() {
    	Iterable<EventDto> eventsDtoList = eventRepository.findAll();
    	List<EventForm> toDoForms = new ArrayList<EventForm>();
    	BeanUtils.copyProperties(eventsDtoList, toDoForms);
    	eventsDtoList.forEach(eventDto -> {
    		EventForm eventForm = new EventForm();
    		BeanUtils.copyProperties(eventDto, eventForm);
    		
    		toDoForms.add(eventForm);
    	});
    	return toDoForms;
    }
	/**
	 * The method to save the Todo
	 */
    @RequestMapping(value="/events", method=RequestMethod.POST)
    public String createEvent(@RequestBody EventForm eventForm) {
    	EventDto event= new EventDto();
    	BeanUtils.copyProperties(eventForm, event);
    	eventRepository.save(event);
        return StringConstants.SUCCESS;
    }
    /**
     * The method to get the TODO based on id
     * @param id
     * @return
     */
    @RequestMapping(value="/events/{id}", method=RequestMethod.GET)
    @ResponseBody
    public EventForm findEventById(@PathVariable("id") String id) {
    	EventDto event = eventRepository.findOne(Long.parseLong(id));
    	EventForm eventForm = new EventForm();
    	BeanUtils.copyProperties(event, eventForm);
    	return eventForm;
    	
    }
    
    /**
     * The method to update the TODO based on Id
     * @param id
     * @param eventForm
     * @return
     */
    @RequestMapping(value="/events/{id}", method=RequestMethod.POST)
    public String updateEvent(@PathVariable("id") String id,
                                           @RequestBody EventForm eventForm) {
    	EventDto event = eventRepository.findOne(Long.parseLong(id));
    	BeanUtils.copyProperties(eventForm, event);
    	eventRepository.save(event);
    	return StringConstants.SUCCESS;
    }
    /**
     * The method to delete the TODO
     * @param id
     * @return
     */
    @RequestMapping(value="/events/{id}", method=RequestMethod.DELETE)
    public String deleteEvent(@PathVariable("id") String id) {
    	eventRepository.delete(Long.parseLong(id));
    	return StringConstants.SUCCESS;
    }
	
	

}
