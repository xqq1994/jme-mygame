package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

/**
 * @Author xiaoqiangqiang
 * @Description //TODO
 * @Date 13:26 2018/12/13
 * @Param
 * @return
 */
public class Test0 extends SimpleApplication {

    private Geometry geom;

    /**
     * 初始化3D场景，显示一个方块。
     */
    @Override
    public void simpleInitApp() {

        // #1 创建一个方块形状的网格
        Mesh box = new Box(1, 1, 1);

        // #2 加载一个感光材质
        Material mat = new Material(assetManager, "Common/MatDefs/Light/Lighting.j3md");

        // #3 创建一个几何体，应用刚才和网格和材质。
        geom = new Geometry("Box");
        geom.setMesh(box);
        geom.setMaterial(mat);

        // #4 创建一束阳光，并让它斜向下照射，好使我们能够看清那个方块。
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-1, -2, -3));

        // #5 将方块和都添加到场景图中
        rootNode.attachChild(geom);
        rootNode.addLight(sun);

    }

    /**
     * 主循环
     */
    @Override
    public void simpleUpdate(float deltaTime) {
        // 旋转速度：每秒360°
        float speed = FastMath.TWO_PI;
        // 让方块匀速旋转
        geom.rotate(0, deltaTime * speed, 0);
    }

    public static void main(String[] args) {
        // 配置参数
        AppSettings settings = new AppSettings(true);
        settings.setTitle("一个方块");
        settings.setResolution(480, 720);

        // 启动jME3程序
        Test0 app = new Test0();
        app.setSettings(settings);// 应用参数
        app.setShowSettings(false);
        app.start();
    }

}
