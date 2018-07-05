package com.event.dto;

import java.io.Serializable;

import javax.persistence.*;
/**
 * Event Dto
 * @author Anish
 */
@Entity
@Table(name="EVENT")
public class EventDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long eventId;
    private String eventCode;
    private String eventName;
    private String description;
    private String startDate;
    private String endDate;
    private Double fees;
    private Integer seatsFilled;
    private String logo;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EVENT_ID")
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	@Column(name = "EVENT_CODE")
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	@Column(name = "EVENT_NAME")
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name = "START_DATE")
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Column(name = "END_DATE")
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	@Column(name = "FEES")
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	@Column(name = "SEATS_FILLED")
	public Integer getSeatsFilled() {
		return seatsFilled;
	}
	public void setSeatsFilled(Integer seatsFilled) {
		this.seatsFilled = seatsFilled;
	}
	@Column(name = "LOGO")
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
    
    
    
    

   /* @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", initialValue = 1, allocationSize = 1, name = "CUST_SEQ")
    Long id;

    String name;
    String email;

    //@Temporal(TemporalType.DATE)
    @Column(name = "CREATED_DATE")
    Date date;*/

    
}
