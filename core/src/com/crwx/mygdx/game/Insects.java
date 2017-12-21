package com.crwx.mygdx.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Insects {
	
	private Vector2 position;
	private int dir;
	private int x;
	private int y;
	private int speed;
	private List<Integer> posy;
	private List<Integer>posx;
	private Rectangle rec;
	public Insects(Integer dir) {
		Random random = new Random();
		posy = new ArrayList();
		posy.add(50);
		posy.add(150);
		posy.add(250);
		posy.add(350);
		posy.add(450);
		posy.add(550);
		posx = posy;
		posx.add(650);
		posx.add(650);
		this.dir = dir;
		if(dir == 0 ) { //right
			x = 1000;
			y = posy.get(random.nextInt(posy.size()));
		}
		else if(dir == 1) { //left
			x = -200;
			y = posy.get(random.nextInt(posy.size()));
		}
		else if(dir == 2) { //top
			y = 800;
			x = posx.get(random.nextInt(posx.size()));
		}
		else if(dir == 3) { //buttom
			y = -200;
			x = posy.get(random.nextInt(posx.size()));
		}
		speed = random.nextInt(5)+10;
		position = new Vector2(x,y);
		rec = new Rectangle(position.x,position.y,100,100);
	}
	public int getDir() {
		return dir;
	}
	public  Rectangle getRec() {
		return rec;
	}
	public Vector2 getPosition(){
		
		return position;}
	
	public void update() {
		if(dir == 0 ) { //right
			position.x-=speed;
		}
		else if(dir == 1) { //left
			position.x+=speed;
		}
		else if(dir == 2) { //top
			position.y-=speed;
			
		}
		else if(dir == 3) { //buttom
			position.y +=speed;
		}
		rec.setPosition(position.x+50,position.y+50);
	}
}