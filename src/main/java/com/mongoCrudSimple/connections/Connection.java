package com.mongoCrudSimple.connections;

import java.net.UnknownHostException;

import com.mongodb.MongoClient;

public class Connection {
	
	private MongoClient mongo;
	
	public Connection() {
		try {
			if(this.mongo == null){
				this.mongo = new MongoClient("192.168.100.242",27017);
			}
			this.mongo.getDatabaseNames().forEach(e->System.out.println("Nome do banco: "+e));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
