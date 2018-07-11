package com.mongoCrudSimple.connections;

import com.mongodb.MongoClient;

public class Connection {

	private MongoClient mongo;

	public Connection() {
		if (this.mongo == null) {
			this.mongo = new MongoClient("192.168.100.242", 27017);
		}
		this.mongo.listDatabaseNames().iterator().forEachRemaining(n -> System.out.println(n));
	}
	
	public MongoClient getConnection(){
		return this.mongo;
	}
}
