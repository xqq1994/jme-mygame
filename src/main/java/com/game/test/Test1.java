package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

/**
 * @Author xiaoqiangqiang
 * @Description //TODO
 * @Date 13:26 2018/12/13
 * @Param
 * @return
 */
public class Test1 extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        Spatial model = assetManager.loadModel("model/ashe/MR96.obj");
        model.scale(0.03f);
        model.center();
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-1, -2, -3));
        AmbientLight ambient = new AmbientLight();
        ColorRGBA colorRGBA = new ColorRGBA();
        sun.setColor(colorRGBA.mult(0.6f));
        ambient.setColor(colorRGBA.mult(0.4f));
        rootNode.attachChild(model);
        rootNode.addLight(sun);
        rootNode.addLight(ambient);
        cam.setLocation(new Vector3f(2.1817982f, 1.7846144f, 7.425623f));
        cam.setRotation(new Quaternion(-0.0047826148f, 0.99400157f, -0.048573785f, -0.09787029f));
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.setShowSettings(false);
        test1.start();
    }
}
