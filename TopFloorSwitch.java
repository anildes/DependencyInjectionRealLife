package com.realworld.dependencyIn;

import org.springframework.stereotype.Component;

@Component
public class TopFloorSwitch {
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        this.status = status;
        return status;
    }
    
    
    public TopFloorSwitch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TopFloorSwitch(boolean status) {
		super();
		this.status = status;
	}
}
