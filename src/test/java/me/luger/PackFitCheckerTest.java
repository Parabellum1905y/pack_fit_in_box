package me.luger;

import me.luger.model.Box;
import me.luger.model.Dimension;
import me.luger.model.Package;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * @author luger. Created on 2/19/20.
 */
public class PackFitCheckerTest {

    @Test
    public void isPackageFitInBox() {
        Box b1 = new Box(new Dimension(4, 12, 14));
        Package p1 = new Package(new Dimension(4, 14, 22));
        assertTrue(new PackFitChecker().isPackageFitInBox(p1, b1));
    }

    @Test
    public void isPackageFitInBox2() {
        Box b1 = new Box(new Dimension(4, 12, 14));
        Package p1 = new Package(new Dimension(4, 13, 14));
        assertTrue(new PackFitChecker().isPackageFitInBox(p1, b1));
    }

    @Test
    public void isPackageDoesntFitInBox() {
        Box b1 = new Box(new Dimension(4, 12, 14));
        Package p1 = new Package(new Dimension(3, 14, 14));
        assertFalse(new PackFitChecker().isPackageFitInBox(p1, b1));
    }
}