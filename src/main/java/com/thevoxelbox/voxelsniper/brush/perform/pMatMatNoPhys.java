/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thevoxelbox.voxelsniper.brush.perform;

import com.thevoxelbox.voxelsniper.vMessage;
import org.bukkit.block.Block;

/**
 *
 * @author Voxel
 */
public class pMatMatNoPhys extends vPerformer {

    private int i;
    private int r;

    public pMatMatNoPhys() {
        name = "Mat-Mat No-Physics";
    }

    @Override
    public void init(com.thevoxelbox.voxelsniper.vData v) {
        w = v.getWorld();
        i = v.voxelId;
        r = v.replaceId;
    }

    @Override
    public void info(vMessage vm) {
        vm.performerName(name);
        vm.voxel();
        vm.replace();
    }

    @Override
    public void perform(Block b) {
        if (b.getTypeId() == r) {
            h.put(b);
            b.setTypeId(i, false);
        }
    }
}
