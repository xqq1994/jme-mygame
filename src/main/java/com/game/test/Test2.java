package com.game.test;

import com.jme3.app.SimpleApplication;
import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Spatial;
import com.jme3.scene.VertexBuffer;
import com.jme3.util.BufferUtils;

/**
 * @Author xiaoqiangqiang
 * @Description //TODO
 * @Date 13:26 2018/12/13
 * @Param
 * @return
 */
public class Test2 extends SimpleApplication {

    @Override
    public void simpleInitApp() {
        // 六个顶点
        float[] vertex = {
                2.5f, 4f, 0f, // 零
                1f, 3.26f, 0f, // 壹
                1f, 1.74f, 0f, // 贰
                2.5f, 1f, 0f, // 叁
                4f, 1.74f, 0f, // 肆
                4f, 3.26f, 0f// 伍
        };

        // 四个三角形
        int[] indices = new int[] {
                0, 1, 2, // 三角形0
                2, 3, 4, // 三角形1
                4, 5, 0, // 三角形2
                0, 2, 4 // 三角形3
        };
        Mesh mesh = new Mesh();
        mesh.setBuffer(VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(vertex));
        mesh.setBuffer(VertexBuffer.Type.Index, 1, BufferUtils.createIntBuffer(indices));
        mesh.updateBound();//更新边界
        mesh.setStatic();//设为静态模型
        // 创建材质，使我们可以看见这个六边形
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
//        mat.setColor("red",ColorRGBA.Red);
        // 使用网格和材质创建一个物体
        Geometry geom = new Geometry("六边形");
        geom.setMesh(mesh);
        geom.setMaterial(mat);
        geom.center();
        rootNode.attachChild(geom);


    }

    public static void main(String[] args) {

        Test2 test1 = new Test2();
        test1.setShowSettings(false);
        test1.start();
    }
}
