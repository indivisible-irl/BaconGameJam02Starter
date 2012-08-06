
public class CollisionReturn {
	Entity entity;
	boolean collision;
	boolean exitGame;
	
	public CollisionReturn(){
		this.exitGame = false;
		this.collision = false;
		this.entity = null;
	}
	
	public void setExit(boolean exit){
		this.exitGame = exit;
	}
	public boolean getExit(){
		return this.exitGame;
	}
	public Entity getEntity(){
		return this.entity;
	}
	public void setEntity(Entity entity){
		this.collision = true;
		this.entity = entity;
	}
	public boolean getCollision(){
		return this.collision;
	}
}
