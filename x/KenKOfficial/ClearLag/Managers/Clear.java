package x.KenKOfficial.ClearLag.Managers;

import org.bukkit.*;
import org.bukkit.entity.*;
import java.util.*;

public class Clear
{
    private static final /* synthetic */ int[] llIl;
    
    private static boolean lllIl(final int IIIlIIIIlllllll, final int lllIIIIIlllllll) {
        return IIIlIIIIlllllll < lllIIIIIlllllll;
    }
    
    private static boolean lIIll(final int llIIIIIIlllllll) {
        return llIIIIIIlllllll == 0;
    }
    
    static {
        IllIl();
    }
    
    private static void IllIl() {
        (llIl = new int[1])[0] = ((2 + 46 + 69 + 56 ^ 177 + 162 - 264 + 116) & (0x31 ^ 0x51 ^ (0x66 ^ 0x14) ^ -" ".length()));
    }
    
    public static void clear() {
        final World[] llIIlIIIlllllll = Bukkit.getServer().getWorlds().toArray(new World[Clear.llIl[0]]);
        final World[] IlIIlIIIlllllll;
        final int lIlIlIIIlllllll = (IlIIlIIIlllllll = llIIlIIIlllllll).length;
        int IIlIlIIIlllllll = Clear.llIl[0];
        while (lllIl(IIlIlIIIlllllll, lIlIlIIIlllllll)) {
            final World IllIlIIIlllllll = IlIIlIIIlllllll[IIlIlIIIlllllll];
            final double IIllIIIIlllllll = (double)IllIlIIIlllllll.getEntities().iterator();
            while (IIIll(((Iterator)IIllIIIIlllllll).hasNext() ? 1 : 0)) {
                final Entity lllIlIIIlllllll = ((Iterator<Entity>)IIllIIIIlllllll).next();
                if (lIIll((lllIlIIIlllllll instanceof Item) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Boat) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Minecart) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof ExperienceOrb) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Painting) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Snowball) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Fireball) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Projectile) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof Arrow) ? 1 : 0) && lIIll((lllIlIIIlllllll instanceof TNTPrimed) ? 1 : 0)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
                else {
                    lllIlIIIlllllll.remove();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
            }
            ++IIlIlIIIlllllll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static boolean IIIll(final int lIlIIIIIlllllll) {
        return lIlIIIIIlllllll != 0;
    }
}
