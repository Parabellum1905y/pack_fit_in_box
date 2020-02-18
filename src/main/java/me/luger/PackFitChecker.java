package me.luger;

import me.luger.model.Box;
import me.luger.model.Dimension;
import me.luger.model.Package;

import java.util.Arrays;
import java.util.List;

/**
 * @author luger. Created on 2/18/20.
 */
public class PackFitChecker {
    /**
     * function that returns all variants of box rotation
     * @param d - base dimension of the box
     * @return list of all possible dimensions
     */
    private List<Dimension> rotateAll(Dimension d){
        return Arrays.asList(
                new Dimension(d.x, Math.max(d.y, d.z), Math.min(d.y, d.z)),
                new Dimension(d.y, Math.max(d.x, d.z), Math.min(d.x, d.z)),
                new Dimension(d.z, Math.max(d.x, d.y), Math.min(d.x, d.y))
        );
    }

    public Boolean isPackageFitInBox(Package pack, Box box) {
        Dimension packd = pack.dimension.sorted();
        return rotateAll(box.dimension.sorted()).stream()
                .anyMatch(d ->  rotateAll(packd.sorted()).stream().anyMatch(e -> d.x <=e.x && d.y<=e.y && d.z <= e.z));
    }
}
