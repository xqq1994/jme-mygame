package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;

/**
 * @Author xiaoqiangqiang
 * @Description //TODO
 * @Date 13:26 2018/12/13
 * @Param
 * @return
 */
public class Test4 extends SimpleApplication {

    private Geometry geom;

    /**
     * 初始化3D场景，显示一个方块。
     */
    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(100);
        Geometry geometry = new Geometry("球体", new Sphere(16, 10, 2));
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        material.getAdditionalRenderState().setWireframe(true);
        geometry.setMaterial(material);

        rootNode.attachChild(geometry);

    }


    public static void main(String[] args) {
        // 配置参数

        // 启动jME3程序
        Test4 app = new Test4();
        app.setShowSettings(false);
        app.start();
    }

}
