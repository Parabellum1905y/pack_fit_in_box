package me.luger.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author luger. Created on 2/18/20.
 */
public final class Dimension {
    public final int x;
    public final int y;
    public final int z;


    public Dimension(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Dimension sorted(){
        List<Integer> l = Arrays.asList(x, y, z);
        l.sort(Integer::compareTo);
        return new Dimension (l.get(0), l.get(1), l.get(2));
    }

    @Override
    public String toString() {
        return String.format("[%d %d %d]", x, y, z);
    }
}
