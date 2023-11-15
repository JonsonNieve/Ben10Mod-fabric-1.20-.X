package net.jonsonnieve.ben10mod.animations;

import com.tom.cpm.api.ICPMPlugin;
import com.tom.cpm.api.IClientAPI;
import com.tom.cpm.api.ICommonAPI;

public class CPMCompat implements ICPMPlugin {
    public void initClient(IClientAPI api) {
        //Init client
    }

    public void initCommon(ICommonAPI api) {
        //Init common
    }

    public String getOwnerModId() {
        return "ben10mod";
    }
}
