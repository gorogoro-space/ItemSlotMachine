package com.darkblade12.itemslotmachine.coin;

import com.darkblade12.itemslotmachine.util.SafeLocation;
import org.bukkit.Location;

public class ShopInfo {
    private SafeLocation location;
    private int coins;
    // 最後に受け取った、切り替え先のスロットと、その時刻
    private int heldSlot;
    private long heldAt;

    public ShopInfo(SafeLocation location, int coins) {
        this.location = location;
        this.coins = coins;
    }

    public SafeLocation getLocation() {
        return location;
    }

    public Location getBukkitLocation() {
        return location.toBukkitLocation();
    }

    public int getCoins() {
        return coins;
    }

    public void setLocation(SafeLocation location) {
        this.location = location;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getHeldSlot() {
        return heldSlot;
    }

    public long getHeldAt() {
        return heldAt;
    }

    public void setHeld(int slot, long time) {
        heldSlot = slot;
        heldAt = time;
    }
}
