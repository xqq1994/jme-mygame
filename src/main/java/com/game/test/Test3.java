package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class Test3 extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.start();
    }
}
