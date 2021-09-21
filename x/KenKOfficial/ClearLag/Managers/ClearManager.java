package x.KenKOfficial.ClearLag.Managers;

import org.bukkit.scheduler.*;
import x.KenKOfficial.ClearLag.Main.*;
import org.bukkit.*;
import org.bukkit.entity.*;
import x.KenKOfficial.ClearLag.Utils.*;
import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import org.bukkit.plugin.*;
import java.util.*;

public class ClearManager
{
    public static void running() {
        new BukkitRunnable() {
            private static final /* synthetic */ String[] I;
            final /* synthetic */ String prefix = Main.getPlugin().getConfig().getString(ClearManager$1.I[ClearManager$1.Il[0]]);
            private static final /* synthetic */ int[] Il;
            /* synthetic */ int i = Main.getPlugin().getConfig().getInt(ClearManager$1.I[ClearManager$1.Il[1]]);
            
            private static void IIIl() {
                (Il = new int[9])[0] = ((0xBE ^ 0xA9 ^ (0xD8 ^ 0x85)) & (0x9B ^ 0xA2 ^ (0x70 ^ 0x3) ^ -" ".length()));
                ClearManager$1.Il[1] = " ".length();
                ClearManager$1.Il[2] = "  ".length();
                ClearManager$1.Il[3] = "   ".length();
                ClearManager$1.Il[4] = (2 + 114 - 111 + 131 ^ 63 + 129 - 181 + 129);
                ClearManager$1.Il[5] = (128 + 82 - 104 + 78 ^ 62 + 103 - 64 + 88);
                ClearManager$1.Il[6] = (43 + 51 + 32 + 5 ^ 41 + 110 - 135 + 117);
                ClearManager$1.Il[7] = (0x20 ^ 0x27);
                ClearManager$1.Il[8] = (0x15 ^ 0xE ^ (0x6D ^ 0x7E));
            }
            
            private static boolean llIl(final int IIlIllIllllllll) {
                return IIlIllIllllllll != 0;
            }
            
            public void run() {
                if (IlIl(this.i, ClearManager$1.Il[1])) {
                    this.cancel();
                    Clear.clear();
                    final String lllIlllllllllll = Main.getPlugin().getConfig().getString(ClearManager$1.I[ClearManager$1.Il[2]]);
                    final String lIIIlllllllllll = (String)Bukkit.getOnlinePlayers().iterator();
                    while (llIl(((Iterator)lIIIlllllllllll).hasNext() ? 1 : 0)) {
                        final Player IIIllllllllllll = ((Iterator<Player>)lIIIlllllllllll).next();
                        IIIllllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(this.prefix).append(ClearManager$1.I[ClearManager$1.Il[3]]).append(lllIlllllllllll))));
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                    }
                    "".length();
                    if ((0x9F ^ 0x9B) <= 0) {
                        return;
                    }
                }
                else {
                    this.i -= ClearManager$1.Il[1];
                    final String lIlIlllllllllll = Main.getPlugin().getConfig().getString(ClearManager$1.I[ClearManager$1.Il[4]]).replace(ClearManager$1.I[ClearManager$1.Il[5]], String.valueOf(this.i));
                    final String lIIIlllllllllll = (String)Bukkit.getOnlinePlayers().iterator();
                    while (llIl(((Iterator)lIIIlllllllllll).hasNext() ? 1 : 0)) {
                        final Player IllIlllllllllll = ((Iterator<Player>)lIIIlllllllllll).next();
                        IllIlllllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(this.prefix).append(ClearManager$1.I[ClearManager$1.Il[6]]).append(lIlIlllllllllll))));
                        "".length();
                        if (-(0x7E ^ 0x7A) > 0) {
                            return;
                        }
                    }
                }
            }
            
            private static String ll(String IIIIIllllllllll, final String IIlIIllllllllll) {
                IIIIIllllllllll = new String(Base64.getDecoder().decode(IIIIIllllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llIIIllllllllll = new StringBuilder();
                final char[] IlIIIllllllllll = IIlIIllllllllll.toCharArray();
                int lIIIIllllllllll = ClearManager$1.Il[0];
                final double llIllIlllllllll = (Object)IIIIIllllllllll.toCharArray();
                final short IlIllIlllllllll = (short)llIllIlllllllll.length;
                short lIIllIlllllllll = (short)ClearManager$1.Il[0];
                while (IIll(lIIllIlllllllll, IlIllIlllllllll)) {
                    final char IllIIllllllllll = llIllIlllllllll[lIIllIlllllllll];
                    llIIIllllllllll.append((char)(IllIIllllllllll ^ IlIIIllllllllll[lIIIIllllllllll % IlIIIllllllllll.length]));
                    "".length();
                    ++lIIIIllllllllll;
                    ++lIIllIlllllllll;
                    "".length();
                    if (-" ".length() > "   ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llIIIllllllllll);
            }
            
            private static String IIl(final String llIIIIlllllllll, final String IIIIIIlllllllll) {
                try {
                    final SecretKeySpec IllIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), ClearManager$1.Il[8]), "DES");
                    final Cipher lIlIIIlllllllll = Cipher.getInstance("DES");
                    lIlIIIlllllllll.init(ClearManager$1.Il[2], IllIIIlllllllll);
                    return new String(lIlIIIlllllllll.doFinal(Base64.getDecoder().decode(llIIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception IIlIIIlllllllll) {
                    IIlIIIlllllllll.printStackTrace();
                    return null;
                }
            }
            
            static {
                IIIl();
                Ill();
            }
            
            private static void Ill() {
                (I = new String[ClearManager$1.Il[7]])[ClearManager$1.Il[0]] = I("aZMuA+sy8zg=", "vkNtL");
                ClearManager$1.I[ClearManager$1.Il[1]] = I("ENGsCOqwnVt/X6noSiKMrKfRJ/Yjksxg", "qafMw");
                ClearManager$1.I[ClearManager$1.Il[2]] = I("EButQ+XaVOUQ5dG4N9lTWQ==", "utpKH");
                ClearManager$1.I[ClearManager$1.Il[3]] = ll("SQ==", "ijLzm");
                ClearManager$1.I[ClearManager$1.Il[4]] = IIl("+dlfOyzWT53tDRSwCRTFwMSN2anvfXkC", "dLvWA");
                ClearManager$1.I[ClearManager$1.Il[5]] = I("PRmwt9oyB1ncns4XuNPRdw==", "JqoZd");
                ClearManager$1.I[ClearManager$1.Il[6]] = ll("Tw==", "oeVeh");
            }
            
            private static String I(final String IIIIlIlllllllll, final String llllIIlllllllll) {
                try {
                    final SecretKeySpec llIIlIlllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher IlIIlIlllllllll = Cipher.getInstance("Blowfish");
                    IlIIlIlllllllll.init(ClearManager$1.Il[2], llIIlIlllllllll);
                    return new String(IlIIlIlllllllll.doFinal(Base64.getDecoder().decode(IIIIlIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lIIIlIlllllllll) {
                    lIIIlIlllllllll.printStackTrace();
                    return null;
                }
            }
            
            private static boolean IIll(final int lllIllIllllllll, final int IllIllIllllllll) {
                return lllIllIllllllll < IllIllIllllllll;
            }
            
            private static boolean IlIl(final int llIlllIllllllll, final int IlIlllIllllllll) {
                return llIlllIllllllll == IlIlllIllllllll;
            }
        }.runTaskTimer((Plugin)Main.getPlugin(), 0L, 20L);
        "".length();
    }
}
