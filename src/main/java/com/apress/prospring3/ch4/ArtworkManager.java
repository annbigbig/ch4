package com.apress.prospring3.ch4;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ArtworkManager {
	private List<ArtworkSender> list;
	
	public static void main(String[] args) {
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();  

		ArtworkManager manager = (ArtworkManager) ctx.getBean("artworkManager");
		manager.printList();
	}

	public List<ArtworkSender> getList() {
		return list;
	}

	public void setList(List<ArtworkSender> list) {
		this.list = list;
	}

	public void printList(){
		System.out.println("------output from " + this.getClass().getName() + "--------\n");
		for(ArtworkSender sender : list){
			System.out.print( sender.getClass().getName() + "\t\t");
			System.out.print( sender.getFriendlyName() + "\t\t");
			System.out.println( sender.getShortName());
		}
	}
}
