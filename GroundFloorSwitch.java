package com.realworld.dependencyIn;

import org.springframework.stereotype.Component;

@Component
public class GroundFloorSwitch {
    

	public boolean isStatus() {
		return status;
	}

	public boolean setStatus(boolean status) {
		this.status = true;
		return status;
	}

	public GroundFloorSwitch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroundFloorSwitch(boolean status) {
		super();
		this.status = status;
	}

	boolean status;
}