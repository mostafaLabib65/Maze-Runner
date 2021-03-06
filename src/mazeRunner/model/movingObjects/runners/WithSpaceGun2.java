package mazeRunner.model.movingObjects.runners;

import java.util.List;

import mazeRunner.model.weapons.Weapon;
import mazeRunner.model.weapons.WeaponFactory;

public class WithSpaceGun2 extends RunnerDecorator {

	public WithSpaceGun2(IRunner runner, int ammo, int oneBulletDamage) {
		super(runner);
		Weapon newWeapon = new WeaponFactory().getWeapon("spaceGun2", ammo, oneBulletDamage);
		List<Weapon> supportedWeapons = super.getSupportedWeapons();
		supportedWeapons.add(newWeapon);
		super.setSupportedWeapons(supportedWeapons);
		super.setCurrentWeapon(newWeapon);
	}

}
