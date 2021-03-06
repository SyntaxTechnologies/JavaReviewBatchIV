package com.java.review2_2;

public class iPhone extends SmartPhone implements Slack, Weather {

	public iPhone(String version) {
		this.version = version;
	}

	@Override
	public void takePics() {
		System.out.println("Taking pics.");
	}

	@Override
	public void recordVideo() {
		System.out.println("Recording...");
	}

	@Override
	public void sendMsg(String name, String msg) {
		System.out.println("Texting " + name);
	}

	@Override
	public void receiveMsg(String name, String msg) {
		System.out.println("Receiving text from " + name);
	}

	public void facetime(String person) {
		System.out.println("Facetiming " + person);
	}

	@Override
	public void slacking(String group, String msg) {
		System.out.println("Slacking " + msg + " to group " + group);
	}

	@Override
	public void showWeatherDetails() {
		System.out.println("The weather is good tomorrow.");
	}

}
