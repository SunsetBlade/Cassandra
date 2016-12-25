package abilities;

import java.util.ArrayList;

import utils.utility;
import utils.utility.Classes;
import utils.utility.AbilityTypes;

public class heal extends ability{

	AbilityTypes type = AbilityTypes.HEAL;	
	
	public heal() {
        this.name			= "Heal";
        this.baseCost		= 10;
        this.baseCooldown	= 0;
        this.power			= 10.0;
        this.restrictions	= new ArrayList<utility.Classes>();
        this.restrictions.add(Classes.PRIEST);
    }
	
}
