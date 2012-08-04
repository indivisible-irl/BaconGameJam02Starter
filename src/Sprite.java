/*
 * Reddit BaconGameJam - Aug 2012
 * Bird Poop!
 * Team maeT
 * Sprite.java
 */

import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;


public class Sprite extends Entity 
{
	private int imageHeight, imageWidth;
	private int tileWidth, tileHeight, numRows, numColumns;
	private Image image;
	private SpriteSheet spriteSheet;
	
	////////////////////////////////////////////////////////////

	/**
	 * Get the height of the source image
	 * @return int
	 */
	public int getImageHeight(){
		return this.imageHeight;
	}
	/**
	 * set the height of the source image
	 * @param int
	 */
	public void setImageHeight(int height){
		this.imageHeight = height;
	}
	/**
	 * get the width of the source image
	 * @return int
	 */
	public int getImageWidth(){
		return this.imageWidth;
	}
	/**
	 * set the width of the source image
	 * @param int
	 */
	public void setImageWidth(int width){
		this.imageWidth = width;
	}
	/**
	 * Gets the individual tile height
	 * @return int
	 */
	public int getTileWidth(){
		return this.tileWidth;
	}
	/**
	 * Sets the width for a single tile
	 * @param int
	 */
	public void setTileWidth(int width){
		this.tileWidth = width;
	}
	/**
	 * Get the height for a single tile
	 * @return int
	 */
	public int getTileHeight(){
		return this.tileHeight;
	}
	/**
	 * Set the height of one tile
	 * @param int
	 */
	public void setTileHeight(int height){
		this.tileHeight = height;
	}
	/**
	 * Get the number of rows in the sprite sheet
	 * @return int
	 */
	public int getNumRows(){
		return this.numRows;
	}
	/**
	 * Set the number of row in the sprie sheet
	 * @param int
	 */
	public void setNumRows(int rows){
		this.numRows = rows;
	}
	/**
	 * Get the number of columns in the sprite sheet
	 * @return int
	 */
	public int getNumColumns(){
		return this.numColumns;
	}
	/**
	 * set the number of columns in the sprite sheet
	 * @param cols
	 */
	public void setNumColumns(int cols){
		this.numColumns = cols;
	}
	/**
	 * Get the source image
	 * @return Image
	 */
	public Image getImage(){
		return this.image;
	}
	/**
	 * set the source image
	 * @param Image
	 */
	public void setImage(Image img){
		this.image = img;
	}
	/**
	 * Get the SpriteSheet object
	 * @return SpriteSheet
	 */
	public SpriteSheet getSpriteSheet(){
		return this.spriteSheet;
	}
	/**
	 * Set the SpriteSheet object
	 * @param SpriteSheet
	 */
	public void setSpriteSheet(SpriteSheet sSheet){
		this.spriteSheet = sSheet;
	}
	
	////////////////////////////////////////////////////////////
	
	public Sprite(Image img, int tWidth, int tHeight, int[] frames, int[] duration)
	{
		super();
		setImage(img);
		setImageHeight(img.getHeight());
		setImageWidth(img.getWidth());
		setTileWidth(tWidth);
		setTileHeight(tHeight);
		setNumRows(getImageWidth() / getTileWidth());
		setNumColumns(getImageHeight() / getTileHeight());
		setSpriteSheet(new SpriteSheet(getImage(), getTileWidth(), getTileHeight()));
		super.addSprites(spriteSheet, frames, duration);
		
	}
	
}
