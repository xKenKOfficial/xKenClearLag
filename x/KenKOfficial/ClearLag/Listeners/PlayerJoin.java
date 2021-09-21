package x.KenKOfficial.ClearLag.Listeners;

import java.nio.charset.*;
import java.util.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.event.player.*;
import x.KenKOfficial.ClearLag.Main.*;
import x.KenKOfficial.ClearLag.Utils.*;
import org.bukkit.entity.*;
import org.bukkit.event.*;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ int[] lll;
    private static final /* synthetic */ String[] Ill;
    
    private static String Illl(String IIlIIIlIlllllll, final String llIIIIlIlllllll) {
        IIlIIIlIlllllll = (long)new String(Base64.getDecoder().decode(((String)IIlIIIlIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIIIlIlllllll = new StringBuilder();
        final char[] IllIIIlIlllllll = llIIIIlIlllllll.toCharArray();
        int lIlIIIlIlllllll = PlayerJoin.lll[0];
        final float llllllIIlllllll = (Object)((String)IIlIIIlIlllllll).toCharArray();
        final byte IlllllIIlllllll = (byte)llllllIIlllllll.length;
        byte lIllllIIlllllll = (byte)PlayerJoin.lll[0];
        while (lIlIl(lIllllIIlllllll, IlllllIIlllllll)) {
            final char IlIlIIlIlllllll = llllllIIlllllll[lIllllIIlllllll];
            lllIIIlIlllllll.append((char)(IlIlIIlIlllllll ^ IllIIIlIlllllll[lIlIIIlIlllllll % IllIIIlIlllllll.length]));
            "".length();
            ++lIlIIIlIlllllll;
            ++lIllllIIlllllll;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllIIIlIlllllll);
    }
    
    private static boolean llIIl(final int IIllIlIIlllllll, final int llIlIlIIlllllll) {
        return IIllIlIIlllllll == llIlIlIIlllllll;
    }
    
    private static void IlIIl() {
        (lll = new int[14])[0] = ((86 + 98 - 3 + 32 ^ 21 + 74 - 68 + 125) & (0xC5 ^ 0xA4 ^ (0xEA ^ 0xC6) ^ -" ".length()));
        PlayerJoin.lll[1] = " ".length();
        PlayerJoin.lll[2] = "  ".length();
        PlayerJoin.lll[3] = "   ".length();
        PlayerJoin.lll[4] = (0xBD ^ 0xB9);
        PlayerJoin.lll[5] = (0xA7 ^ 0xA2);
        PlayerJoin.lll[6] = (0x15 ^ 0x13);
        PlayerJoin.lll[7] = (" ".length() ^ (0x1B ^ 0x1D));
        PlayerJoin.lll[8] = (0x68 ^ 0x60);
        PlayerJoin.lll[9] = (0x95 ^ 0x9C);
        PlayerJoin.lll[10] = (0x53 ^ 0x59);
        PlayerJoin.lll[11] = (0x8B ^ 0x80);
        PlayerJoin.lll[12] = (0x7F ^ 0x73);
        PlayerJoin.lll[13] = (0x37 ^ 0x3A);
    }
    
    private static String IIIIl(final String lllIlIlIlllllll, final String IIIllIlIlllllll) {
        try {
            final SecretKeySpec IIlllIlIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIllIlIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lll[8]), "DES");
            final Cipher llIllIlIlllllll = Cipher.getInstance("DES");
            llIllIlIlllllll.init(PlayerJoin.lll[2], IIlllIlIlllllll);
            return new String(llIllIlIlllllll.doFinal(Base64.getDecoder().decode(lllIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIllIlIlllllll) {
            IlIllIlIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean IIlIl(final int lIlIIlIIlllllll) {
        return lIlIIlIIlllllll != 0;
    }
    
    private static void lIIIl() {
        (Ill = new String[PlayerJoin.lll[13]])[PlayerJoin.lll[0]] = Illl("NAg7BiMqOycPLCs=", "DdNaJ");
        PlayerJoin.Ill[PlayerJoin.lll[1]] = Illl("KjMGBwg+PQIbBzM/TQgPPzEN", "RXcik");
        PlayerJoin.Ill[PlayerJoin.lll[2]] = llll("SH92HQhn18X3p3gpdzdsul7cA7cPiuE95mX6j8Hg1uiOiexUWw1aZnF4kGQNwV/i", "qRJdV");
        PlayerJoin.Ill[PlayerJoin.lll[3]] = IIIIl("SoJeMWhPI0Y=", "VOfCc");
        PlayerJoin.Ill[PlayerJoin.lll[4]] = Illl("WEpnPjQKHzkHP15Uakh3Gl1+WHw6CSQJ", "xlPhQ");
        PlayerJoin.Ill[PlayerJoin.lll[5]] = IIIIl("BCG5btb8ORs=", "oRGyu");
        PlayerJoin.Ill[PlayerJoin.lll[6]] = llll("gWpweu5Q4n9oD4/Ygfz26N4zPqRF39L69qUuPyLn4tE=", "LtXEU");
        PlayerJoin.Ill[PlayerJoin.lll[7]] = IIIIl("W+yMxwnX34Y=", "oZvul");
        PlayerJoin.Ill[PlayerJoin.lll[8]] = Illl("UGJRAT4DJwk3M1Z8XGVxEiwSMScDfklqMxk3BSolFGoBInhCDCIwDQIBIBEw", "pDfEW");
        PlayerJoin.Ill[PlayerJoin.lll[9]] = Illl("", "EGtEq");
        PlayerJoin.Ill[PlayerJoin.lll[10]] = Illl("eWx1IxkqPmI6CD0rNgpeYXBiSRpre2xfQXd4cl1JK2RiAFg+JSYVVnl7dlVIaA==", "YJBox");
        PlayerJoin.Ill[PlayerJoin.lll[11]] = llll("VF3WtI5ao4M=", "lxlFn");
        PlayerJoin.Ill[PlayerJoin.lll[12]] = Illl("c19qBVJoWnFUUmhacVQ0c1RqBRceAiIqAzAGPiUOMkF0TwMIWnFUUmhacVRSaA==", "UgLio");
    }
    
    static {
        IlIIl();
        lIIIl();
    }
    
    private static String llll(final String IIlIllIIlllllll, final String llIIllIIlllllll) {
        try {
            final SecretKeySpec lllIllIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIllIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IllIllIIlllllll = Cipher.getInstance("Blowfish");
            IllIllIIlllllll.init(PlayerJoin.lll[2], lllIllIIlllllll);
            return new String(IllIllIIlllllll.doFinal(Base64.getDecoder().decode(IIlIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIIlllllll) {
            lIlIllIIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIl(final int IIIlIlIIlllllll, final int lllIIlIIlllllll) {
        return IIIlIlIIlllllll < lllIIlIIlllllll;
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IIlIIllIlllllll) {
        final Player llIIIllIlllllll = IIlIIllIlllllll.getPlayer();
        if (llIIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.Ill[PlayerJoin.lll[0]]) ? 1 : 0, PlayerJoin.lll[1]) && IIlIl(llIIIllIlllllll.hasPermission(PlayerJoin.Ill[PlayerJoin.lll[1]]) ? 1 : 0)) {
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[2]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[3]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[4]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[5]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[6]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[7]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[8]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[9]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[10]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[11]]));
            llIIIllIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.Ill[PlayerJoin.lll[12]]));
        }
    }
}
