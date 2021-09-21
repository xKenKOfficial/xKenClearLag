package x.KenKOfficial.ClearLag.Utils;

import java.nio.charset.*;
import javax.crypto.spec.*;
import javax.crypto.*;
import java.security.*;
import java.util.*;

public class ChatUtil
{
    private static final /* synthetic */ int[] lIll;
    private static final /* synthetic */ String[] IIll;
    
    static {
        Illll();
        lIlll();
    }
    
    private static void Illll() {
        (lIll = new int[9])[0] = ((0x54 ^ 0x49) & ~(0x7 ^ 0x1A));
        ChatUtil.lIll[1] = " ".length();
        ChatUtil.lIll[2] = "  ".length();
        ChatUtil.lIll[3] = "   ".length();
        ChatUtil.lIll[4] = (0x37 ^ 0x44 ^ (0x45 ^ 0x32));
        ChatUtil.lIll[5] = (0x34 ^ 0x31);
        ChatUtil.lIll[6] = (0xA0 ^ 0xAC ^ (0x89 ^ 0x83));
        ChatUtil.lIll[7] = (0xE2 ^ 0xBE ^ (0xF9 ^ 0xA2));
        ChatUtil.lIll[8] = (0x63 ^ 0x6B);
    }
    
    private static String llIll(String llIIlIllIllllll, final String IlIIlIllIllllll) {
        llIIlIllIllllll = (int)new String(Base64.getDecoder().decode(((String)llIIlIllIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IllIlIllIllllll = new StringBuilder();
        final char[] lIlIlIllIllllll = IlIIlIllIllllll.toCharArray();
        int IIlIlIllIllllll = ChatUtil.lIll[0];
        final boolean IlllIIllIllllll = (Object)((String)llIIlIllIllllll).toCharArray();
        final Exception lIllIIllIllllll = (Exception)IlllIIllIllllll.length;
        int IIllIIllIllllll = ChatUtil.lIll[0];
        while (lllll(IIllIIllIllllll, (int)lIllIIllIllllll)) {
            final char lIIllIllIllllll = IlllIIllIllllll[IIllIIllIllllll];
            IllIlIllIllllll.append((char)(lIIllIllIllllll ^ lIlIlIllIllllll[IIlIlIllIllllll % lIlIlIllIllllll.length]));
            "".length();
            ++IIlIlIllIllllll;
            ++IIllIIllIllllll;
            "".length();
            if (((0x8C ^ 0x85) & ~(0x6E ^ 0x67)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(IllIlIllIllllll);
    }
    
    private static boolean lllll(final int IIIlIIllIllllll, final int lllIIIllIllllll) {
        return IIIlIIllIllllll < lllIIIllIllllll;
    }
    
    private static String IIlll(final String IllIIlllIllllll, final String lIlIIlllIllllll) {
        try {
            final SecretKeySpec llIlIlllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIlllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIlllIllllll = Cipher.getInstance("Blowfish");
            IlIlIlllIllllll.init(ChatUtil.lIll[2], llIlIlllIllllll);
            return new String(IlIlIlllIllllll.doFinal(Base64.getDecoder().decode(IllIIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIlllIllllll) {
            lIIlIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    public static String fixColor(final String lIllllllIllllll) {
        return lIllllllIllllll.replaceAll(ChatUtil.IIll[ChatUtil.lIll[0]], ChatUtil.IIll[ChatUtil.lIll[1]]).replace(ChatUtil.IIll[ChatUtil.lIll[2]], ChatUtil.IIll[ChatUtil.lIll[3]]).replace(ChatUtil.IIll[ChatUtil.lIll[4]], ChatUtil.IIll[ChatUtil.lIll[5]]).replace(ChatUtil.IIll[ChatUtil.lIll[6]], ChatUtil.IIll[ChatUtil.lIll[7]]);
    }
    
    private static void lIlll() {
        (IIll = new String[ChatUtil.lIll[8]])[ChatUtil.lIll[0]] = IlIll("tBY9YqVRnDQ=", "fFxic");
        ChatUtil.IIll[ChatUtil.lIll[1]] = llIll("w64=", "ItNXv");
        ChatUtil.IIll[ChatUtil.lIll[2]] = IlIll("i2Nbu+wfIv8=", "AueiB");
        ChatUtil.IIll[ChatUtil.lIll[3]] = IlIll("KhOzBoTNBkQ=", "XKMYr");
        ChatUtil.IIll[ChatUtil.lIll[4]] = llIll("U1E=", "omqJq");
        ChatUtil.IIll[ChatUtil.lIll[5]] = IIlll("9GgFDKlSjKI=", "ZnZsY");
        ChatUtil.IIll[ChatUtil.lIll[6]] = llIll("Hgoy", "eDOiA");
        ChatUtil.IIll[ChatUtil.lIll[7]] = llIll("bw==", "eTGrh");
    }
    
    private static String IlIll(final String lIlIllllIllllll, final String IlIIllllIllllll) {
        try {
            final SecretKeySpec IIIlllllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IlIIllllIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lIll[8]), "DES");
            final Cipher lllIllllIllllll = Cipher.getInstance("DES");
            lllIllllIllllll.init(ChatUtil.lIll[2], IIIlllllIllllll);
            return new String(lllIllllIllllll.doFinal(Base64.getDecoder().decode(lIlIllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IllIllllIllllll) {
            IllIllllIllllll.printStackTrace();
            return null;
        }
    }
}
