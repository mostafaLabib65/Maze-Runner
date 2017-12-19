package mazeRunner.themes.theme0;

import mazeRunner.model.GameSetting;
import mazeRunner.model.mapCells.Gifts;
import mazeRunner.model.mapCells.MapCell;
import mazeRunner.themes.theme1.ashes;

public class CustomHealthGift extends Gifts{
	private MapCell afterUpdate = null;
	private final String standardImageLink =GameSetting.getGameSetting().getCustomMapCellImageLink("CustomHealthGift");;


	private final String destroySound = "file:mazeRunner.themes.theme1.media.soundEffects.giftdestroy";
	private final String hittingSound = "file:mazeRunner.themes.theme1.media.soundEffects.healthhit";
	private  int health = 1;
	private final int giftDamage = 0;
	

	@Override
	public String getDestroyingSound() {
		return this.destroySound;
	}

	@Override
	public String getHittingSound() {
		return this.hittingSound;
	}

	@Override
	public int getHealth() {
		return this.health;
	}




	@Override
	public boolean update(int fullDamage) {
		this.health -= fullDamage;
		if(this.getHealth()<=0){
			this.afterUpdate = new ashes();
			return true;
		}
		return false;
	}

	@Override
	public MapCell getUpdateResult() {
		return this.afterUpdate;
	}

	@Override
	public String getImageLink() {
		return this.standardImageLink;
	}

	@Override
	public int getDamage() {
		return this.giftDamage;
	}

	@Override
	public boolean isCauseDamage() {
		return false;
	}

}
