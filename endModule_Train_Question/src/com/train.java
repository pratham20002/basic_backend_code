package com;
import java.time.LocalDate;

import Enums.train_type;

public class train {

	private String train_no, dept_time, arrival_time, source, destination;
	private train_type type;
	private int no_of_bogies;
	private LocalDate date_of_journey;
	
	public train(String train_no, int no_of_bogies, String dept_time, String arrival_time, String source, String destination,
			train_type type, LocalDate date_of_journey) {
		super();
		this.train_no = train_no;
		this.dept_time = dept_time;
		this.arrival_time = arrival_time;
		this.source = source;
		this.no_of_bogies = no_of_bogies;
		this.destination = destination;
		this.type = type;
		this.date_of_journey = date_of_journey;
	}

	public String getTrain_no() {
		return train_no;
	}

	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}

	public String getDept_time() {
		return dept_time;
	}

	public void setDept_time(String dept_time) {
		this.dept_time = dept_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public train_type getType() {
		return type;
	}

	public void setType(train_type type) {
		this.type = type;
	}

	public int getNo_of_bogies() {
		return no_of_bogies;
	}

	public void setNo_of_bogies(int no_of_bogies) {
		this.no_of_bogies = no_of_bogies;
	}

	public LocalDate getDate_of_journey() {
		return date_of_journey;
	}

	public void setDate_of_journey(LocalDate date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	
	@Override
	public String toString() {
		return "train [train_no=" + train_no + ", dept_time=" + dept_time + ", arrival_time=" + arrival_time
				+ ", source=" + source + ", destination=" + destination + ", type=" + type + ", no_of_bogies="
				+ no_of_bogies + ", date_of_journey=" + date_of_journey + "]";
	}


	
}
