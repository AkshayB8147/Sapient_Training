package com.sapient.enums;

public enum Signals {
	GREEN("GO"),
	RED("STOP"), 
	ORANGE("READY");

	private String signalValue;

	private Signals(String signalValue) {
		this.signalValue = signalValue;
	}

	public String getSignalValue() {
		return signalValue;
	}
}
