package com.event.form;
/**
 * Form class for TODO
 * @author Anish
 *
 */
public class EventForm {
	
	private Long eventId;
    private String eventCode;
    private String eventName;
    private String description;
    private String startDate;
    private String endDate;
    private Double fees;
    private Integer seatsFilled;
    private String logo;
    
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Integer getSeatsFilled() {
		return seatsFilled;
	}
	public void setSeatsFilled(Integer seatsFilled) {
		this.seatsFilled = seatsFilled;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
    
    
	
    
 

}
