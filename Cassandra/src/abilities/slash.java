package abilities;

import java.util.ArrayList;

import utils.utility;
import utils.utility.Classes;

public class slash extends ability{
	
	public slash() {
        this.name			= "Slash";
        this.baseCost		= 10;
        this.baseCooldown	= 0;
        this.power = 20.0;
        
        this.tags = new ArrayList<utility.AbilityTypes>();
       
        
        this.restrictions	= new ArrayList<utility.Classes>();
        this.restrictions.add(Classes.PRIEST);
    }
	
}

