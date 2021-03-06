package com.luxfacta;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.InvalidPathException;

public class PathTest {

    @Test
    public void rootWithBarOnStartTest() {
        Path path = new Path();
        Assert.assertTrue(path.rootMatches("/a/b/c"));
    }

    @Test
    public void rootWithNotBarOnStartTest() {
        Path path = new Path();
        Assert.assertFalse(path.rootMatches("a/b/c"));
    }

    @Test
    public void rootWithBarOnEndTest() {
        Path path = new Path();
        Assert.assertTrue(path.rootMatches("/a/b/c/"));
    }

    @Test
    public void rootWithEspecialCharacteresPathTest() {
        try {
            new Path("/a/?");
            Assert.fail("Espera-se uma InvalidPathException");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof InvalidPathException);
        }
    }

    @Test(expected = InvalidPathException.class)
    public void rootWithEmptyPathTest() {
        new Path("");
    }

    @Test
    public void toAddDirectoryTest() {
        Path path = new Path("/a/b");
        Assert.assertTrue(path.addDirectoryMatches("/c/d"));
    }

    @Test
    public void toFatherDirectoryTest() {
        Path path = new Path("/a/b/");
        Assert.assertTrue(path.toFatherMatches("../"));
        Assert.assertTrue(path.toFatherMatches("../../"));
        Assert.assertTrue(path.toFatherMatches("../../x/y"));
    }

    @Test
    public void addPathTest() {
        Path path = new Path("/a/b/c");
        String dir = path.cd("e/f");
        Assert.assertEquals("/a/b/c/e/f", dir);
    }

    @Test
    public void gotoFatherPathTest() {
        Path path = new Path("/a/b/c/d/e/f");
        String dir = path.cd("../m");
        Assert.assertEquals("/a/b/c/d/e/m", dir);
        dir = path.cd("../../n");
        Assert.assertEquals("/a/b/c/d/n", dir);
    }

    @Test
    public void changeDirectoryWithInvalidCharactereTest() {
        try {
            Path path = new Path("/a/b/c/d/e/f");
            path.cd("/o/?");
            Assert.fail("Espera-se uma InvalidPathException");
        } catch (Exception e) {
            Assert.assertTrue(e instanceof InvalidPathException);
        }
    }
}
