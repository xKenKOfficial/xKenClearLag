package x.KenKOfficial.ClearLag.Tasks;

import org.bukkit.scheduler.*;
import x.KenKOfficial.ClearLag.Managers.*;

public class ClearTask extends BukkitRunnable
{
    public void run() {
        ClearManager.running();
    }
}
