package com.apress.prospring3.ch4;

public class EmailArtworkSender implements ArtworkSender{

	@Override
	public void sendArtwork(String artworkPath, Recipient recipient) {
		// some business logic here ...
		
	}

	@Override
	public String getFriendlyName() {
		return "Email protocal ?";
	}

	@Override
	public String getShortName() {
		return "Email";
	}

}
