package project10_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyCustom {
	private Integer move_type = 0;
	private Boolean isAttack = false;
	
	public void move(String key) {
		if(key=="w") move_type=1;
		else if(key=="s") move_type=2;
		else if(key=="a") move_type=3;
		else if(key=="d") move_type=4;
		else move_type=5;
	}
	public void attack(String key) {
		if(key==" ") isAttack= true;
		else isAttack = false;
	}
	public void sortItem(Item[] itemList) {
		Arrays.sort(itemList);
	}
	public Integer getMoveType() {
		return move_type;
	}
	public Boolean getIsAttack() {
		return isAttack;
	}
}