package x.KenKOfficial.ClearLag.Main;

import org.bukkit.plugin.java.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import x.KenKOfficial.ClearLag.Tasks.*;
import org.bukkit.plugin.*;
import org.bukkit.*;
import x.KenKOfficial.ClearLag.Listeners.*;
import org.bukkit.event.*;
import java.util.*;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String[] l;
    private static /* synthetic */ Main plugin;
    
    private static boolean lIll(final int IIIIlllIlllllll, final int llllIllIlllllll) {
        return IIIIlllIlllllll < llllIllIlllllll;
    }
    
    static {
        lIIl();
        lll();
    }
    
    private static void lll() {
        (l = new String[Main.ll[15]])[Main.ll[0]] = l("QWp6c1dBanpzV0FqenNXQWp6c1dBanpzV0FqenNXQWp6c1dBanpzV0FqenNXQWp6c1dBanpzV0FqenM=", "bIYPt");
        Main.l[Main.ll[1]] = Il("x6zqMfX3sx+h+yBZoqSMZw==", "iLCiX");
        Main.l[Main.ll[2]] = l("ICMeCSAZKFZaeFh2QTgsAic=", "vFlzI");
        Main.l[Main.ll[3]] = Il("S7bUIqlmacB5lSl3xUOiQg==", "StLSN");
        Main.l[Main.ll[4]] = l("NRo4bw8QHTUmJBNUICEuVD0vKTgdGiYqJxEaNW8lElQCIDoNBigoIgBUbG8aJjsJBgg9IAQLaw==", "ttAOJ");
        Main.l[Main.ll[5]] = Il("kc3r1et7jJmRzevV63uMmZHN69Xre4yZkc3r1et7jJmRzevV63uMmZHN69Xre4yZkc3r1et7jJkTHPLxR88a2g==", "CNwPu");
        Main.l[Main.ll[6]] = lIl("D3ZPRYJzQ+YPdk9FgnND5g92T0WCc0PmD3ZPRYJzQ+YPdk9FgnND5g92T0WCc0PmD3ZPRYJzQ+Z+HBn9f7885g==", "BWENj");
        Main.l[Main.ll[7]] = l("KhEyCyA+PzYXLzM9", "RZWec");
        Main.l[Main.ll[8]] = Il("ZWnXLizkqdIBGj6GP2yONlL1e4KUXcLf", "rUerD");
        Main.l[Main.ll[9]] = Il("TQx7y9L07XQ=", "PRvfZ");
        Main.l[Main.ll[10]] = lIl("Vlsq5ceqqht4XKkSGIW0pQojFX6erjN7FpjhnWgjCzpQJ2k+nbf5qhrQRBWNCer+oc3x6v15+rc=", "CUmPo");
        Main.l[Main.ll[11]] = l("dlJkV1J2UmRXUnZSZFdSdlJkV1J2UmRXUnZSZFdSdlJkV1J2UmRXUnZSZFdSdlJkV1J2UmRXUnZSZFc=", "UqGtq");
        Main.l[Main.ll[12]] = Il("tzAFdpBQwmD74gTJ7q3KIetUwsMgB0OHSIkOZP1V9fHOkvH1lcGGxO3YFPZMzr6Y", "DchgD");
        Main.l[Main.ll[13]] = lIl("+fF2F1aebeNJ6iIO/4NO+NB8T6w7kds3A4pu9hfiCRgRAZ2nUXVQ643Ul9t/fDYz", "ROeuy");
        Main.l[Main.ll[14]] = l("MTwcMTUNJBA9IiA=", "RPyPG");
    }
    
    private static String Il(final String llIllIIllllllll, final String IlIllIIllllllll) {
        try {
            final SecretKeySpec IIIIIlIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IlIllIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllIIllllllll = Cipher.getInstance("Blowfish");
            lllllIIllllllll.init(Main.ll[2], IIIIIlIllllllll);
            return new String(lllllIIllllllll.doFinal(Base64.getDecoder().decode(llIllIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllllIIllllllll) {
            IllllIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIl() {
        (ll = new int[16])[0] = ((0xA8 ^ 0xA5 ^ (0x5D ^ 0x40)) & (14 + 162 - 147 + 137 ^ 41 + 110 + 17 + 14 ^ -" ".length()));
        Main.ll[1] = " ".length();
        Main.ll[2] = "  ".length();
        Main.ll[3] = "   ".length();
        Main.ll[4] = (0xC1 ^ 0xC5);
        Main.ll[5] = (79 + 117 - 160 + 122 ^ 71 + 130 - 81 + 35);
        Main.ll[6] = (0xF1 ^ 0xBC ^ (0xDA ^ 0x91));
        Main.ll[7] = (169 + 130 - 226 + 114 ^ 123 + 105 - 58 + 18);
        Main.ll[8] = (0x1 ^ 0x9);
        Main.ll[9] = (0x26 ^ 0x65 ^ (0x4C ^ 0x6));
        Main.ll[10] = (24 + 43 + 90 + 10 ^ 36 + 84 - 30 + 83);
        Main.ll[11] = (0x5B ^ 0x50);
        Main.ll[12] = (0x29 ^ 0x25);
        Main.ll[13] = (0x4D ^ 0x40);
        Main.ll[14] = (0x9A ^ 0x8D ^ (0xDB ^ 0xC2));
        Main.ll[15] = (0x85 ^ 0x8A);
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerListeners();
        this.registerTasks();
        System.out.println(Main.l[Main.ll[0]]);
        System.out.println(Main.l[Main.ll[1]]);
        System.out.println(Main.l[Main.ll[2]]);
        System.out.println(Main.l[Main.ll[3]]);
        System.out.println(Main.l[Main.ll[4]]);
        System.out.println(Main.l[Main.ll[5]]);
    }
    
    public void registerTasks() {
        this.getLogger().info(Main.l[Main.ll[13]]);
        new ClearTask().runTaskTimer((Plugin)this, 0L, 20L * getPlugin().getConfig().getInt(Main.l[Main.ll[14]]));
        "".length();
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.l[Main.ll[6]]);
        System.out.println(Main.l[Main.ll[7]]);
        System.out.println(Main.l[Main.ll[8]]);
        System.out.println(Main.l[Main.ll[9]]);
        System.out.println(Main.l[Main.ll[10]]);
        System.out.println(Main.l[Main.ll[11]]);
    }
    
    private static String l(String IIIlIIIllllllll, final String lllIIIIllllllll) {
        IIIlIIIllllllll = (float)new String(Base64.getDecoder().decode(((String)IIIlIIIllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIlIIIllllllll = new StringBuilder();
        final char[] IlIlIIIllllllll = lllIIIIllllllll.toCharArray();
        int lIIlIIIllllllll = Main.ll[0];
        final byte llIIIIIllllllll = (Object)((String)IIIlIIIllllllll).toCharArray();
        final long IlIIIIIllllllll = llIIIIIllllllll.length;
        String lIIIIIIllllllll = (String)Main.ll[0];
        while (lIll((int)lIIIIIIllllllll, (int)IlIIIIIllllllll)) {
            final char IlllIIIllllllll = llIIIIIllllllll[lIIIIIIllllllll];
            llIlIIIllllllll.append((char)(IlllIIIllllllll ^ IlIlIIIllllllll[lIIlIIIllllllll % IlIlIIIllllllll.length]));
            "".length();
            ++lIIlIIIllllllll;
            ++lIIIIIIllllllll;
            "".length();
            if (((0xCC ^ 0x8C) & ~(0xF8 ^ 0xB8)) > 0) {
                return null;
            }
        }
        return String.valueOf(llIlIIIllllllll);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    public void registerListeners() {
        this.getLogger().info(Main.l[Main.ll[12]]);
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static String lIl(final String IllIlllIlllllll, final String lIlIlllIlllllll) {
        try {
            final SecretKeySpec llIllllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIlllllll.getBytes(StandardCharsets.UTF_8)), Main.ll[8]), "DES");
            final Cipher IlIllllIlllllll = Cipher.getInstance("DES");
            IlIllllIlllllll.init(Main.ll[2], llIllllIlllllll);
            return new String(IlIllllIlllllll.doFinal(Base64.getDecoder().decode(IllIlllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllllIlllllll) {
            lIIllllIlllllll.printStackTrace();
            return null;
        }
    }
}
