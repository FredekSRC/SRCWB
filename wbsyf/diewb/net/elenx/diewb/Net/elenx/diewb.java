package diewb.net.elenx.diewb.Net.elenx;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class diewb extends JavaPlugin implements CommandExecutor
{
    private static final Location ALLATORIxDEMO;
    
    public boolean onCommand(CommandSender a, final Command a, final String a, final String[] a) {
        a = a;
        if (a.getName().equalsIgnoreCase(ALLATORIxDEMO("z)o3iql>"))) {
            final CommandSender commandSender = a;
            ((Player)commandSender).sendMessage(ChatColor.WHITE + ALLATORIxDEMO("\u0007") + ChatColor.DARK_PURPLE + ALLATORIxDEMO("\u0018r9") + ChatColor.GRAY + ALLATORIxDEMO("S\u001f") + ChatColor.WHITE + ALLATORIxDEMO("\u0001") + ChatColor.GOLD + ALLATORIxDEMO("|6|O9u|k0n;r2;2z,r/z2b|a3h(z0;,i&~&!|I)y%B\b8h\"l,|t.z&;l),w=b9i\u007f(k\"e"));
            ((Player)commandSender).sendMessage(ChatColor.GREEN + ALLATORIxDEMO("A=p)k5h&;;t|l?s3\u007f&\u011e?;(n(z6!|s(o,hf4s\u007f/xr|;4.n>b?t.k3"));
        }
        if (a.getName().equalsIgnoreCase(ALLATORIxDEMO("l>"))) {
            if (((Player)a).hasPermission(ALLATORIxDEMO("\u007f5~+yrl>"))) {
                ((Player)a).openWorkbench(diewb.ALLATORIxDEMO, true);
            }
            ((Player)a).sendMessage(ChatColor.WHITE + ALLATORIxDEMO("\u0007") + ChatColor.DARK_PURPLE + ALLATORIxDEMO("\u0018r9") + ChatColor.GRAY + ALLATORIxDEMO("S\u001f") + ChatColor.WHITE + ALLATORIxDEMO("\u0001") + ChatColor.GOLD + ALLATORIxDEMO(";q;\u0013o+z.o3;\u001fi=}(r2|}"));
        }
        if (a.getName().equalsIgnoreCase(ALLATORIxDEMO("~?"))) {
            if (((Player)a).hasPermission(ALLATORIxDEMO("\u007f5~+yr~2\u007f9i?s9h("))) {
                final CommandSender commandSender2 = a;
                ((Player)commandSender2).openInventory(((Player)commandSender2).getEnderChest());
            }
            ((Player)a).sendMessage(ChatColor.WHITE + ALLATORIxDEMO("\u0007") + ChatColor.DARK_PURPLE + ALLATORIxDEMO("\u0018r9") + ChatColor.GRAY + ALLATORIxDEMO("S\u001f") + ChatColor.WHITE + ALLATORIxDEMO("\u0001") + ChatColor.GOLD + ALLATORIxDEMO("|6|T(l=i(t|^2\u007f9i\u001fs9h(z}"));
        }
        if (a.getName().equalsIgnoreCase(ALLATORIxDEMO("9u?s=u(")) && ((Player)a).hasPermission(ALLATORIxDEMO("\u007f5~+yr~2x4"))) {
            ((Player)a).openEnchanting(diewb.ALLATORIxDEMO, true);
            ((Player)a).sendMessage(ChatColor.WHITE + ALLATORIxDEMO("\u0007") + ChatColor.DARK_PURPLE + ALLATORIxDEMO("\u0018r9") + ChatColor.GRAY + ALLATORIxDEMO("S\u001f") + ChatColor.WHITE + ALLATORIxDEMO("\u0001") + ChatColor.GOLD + ALLATORIxDEMO(";q;\u0013o+z.o3;\u0019u?s=u(r2|}"));
        }
        return false;
    }
    
    static {
        ALLATORIxDEMO = null;
    }
    
    public void onDisable() {
    }
    
    public static String ALLATORIxDEMO(String a) {
        final int n = 5 << 4 ^ (0x3 ^ 0x5) << 1;
        final int n2 = 3;
        final int n3 = n2 << n2 ^ 0x3;
        final int length = (a = a).length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] value = array;
        final char c = (char)n3;
        final int n5 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final String s = a;
            final int index = n4;
            final char char1 = s.charAt(index);
            --n4;
            array2[index] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array3 = value;
            final String s2 = a;
            final int index2 = n4--;
            array3[index2] = (char)(s2.charAt(index2) ^ c);
            i = n4;
        }
        return new String(value);
    }
    
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.WHITE + ALLATORIxDEMO("\u0007") + ChatColor.DARK_PURPLE + ALLATORIxDEMO("\u0018r9") + ChatColor.GRAY + ALLATORIxDEMO("S\u001f") + ChatColor.WHITE + ALLATORIxDEMO("\u0001") + ChatColor.GOLD + ALLATORIxDEMO("|6|O9u|k0n;r2;2z,r/z2b|a3h(z0;,i&~&!|I)y%B\b8h\"l,|t.z&;l),w=b9i\u007f(k\"e"));
    }
}
