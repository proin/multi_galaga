package org.gdg.suwon.galaga.model;

import com.google.appengine.api.datastore.Entity;


public class Player extends EntityData {
	
	private String id;
	
	private PlayerState state = PlayerState.IDLE;
	
	private Long score = (long)0;
	
	public Player(String id_){
		super(Player.class.getSimpleName(), id_);
		id = id_;
		
	}
	
	public Player(Entity entity_){
		super(entity_);
		id = (String)entity.getProperty("ID");
	}
}
