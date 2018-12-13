package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
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
        flyCam.setMoveSpeed(50);
        Spatial model = assetManager.loadModel("model/ashe/95.obj");
        model.scale(1f);
        model.center();
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-1, -2, -3));
        AmbientLight ambient = new AmbientLight();
        ColorRGBA colorRGBA = new ColorRGBA();
        sun.setColor(colorRGBA.mult(0.6f));
        ambient.setColor(colorRGBA.mult(0.4f));
        rootNode.attachChild(model);
        rootNode.center();
        rootNode.addLight(sun);
        rootNode.addLight(ambient);
    }

    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.start();
    }
}
