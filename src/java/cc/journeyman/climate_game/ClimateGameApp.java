package cc.journeyman.climate_game;

import aaronperkins.planeteg.PlanetMeshGen;
import com.jme3.app.SimpleApplication;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.material.Material;
import com.jme3.light.DirectionalLight;

/**
 * Replacement for Aaron Perkins PlanetApp, doing stuff I need/want. Intended
 * to be replaced by the same functionality in Clojure, but I haven't yet made
 * that work.
 */
public class ClimateGameApp extends SimpleApplication {
    Geometry planet;

    @Override
    public void simpleInitApp() {
                
        // Setup camera
        this.getCamera().setLocation(new Vector3f(0,0,1000));
        this.getFlyByCamera().setMoveSpeed(200.0f);
        
        // Add sun
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-0.1f, -0.7f, -1.0f));
        rootNode.addLight(sun);
        
        // Add planet
        planet = new Geometry("Planet");
        
        PlanetMeshGen planetMeshGen = new PlanetMeshGen();
        planetMeshGen.generateHeightmap();
        planet.setMesh(planetMeshGen.generateMesh());
        
        Material mat = new Material(this.getAssetManager(), "Common/MatDefs/Light/Lighting.j3md");
        mat.setBoolean("UseVertexColor", true);
        // Uncommet for wireframe
        //mat.getAdditionalRenderState().setWireframe(true);
        
        planet.setMaterial(mat);
        
        rootNode.attachChild(planet);

    }
    
    @Override
    public void simpleUpdate(float tpf) {
        planet.rotate(0, 0.005f*tpf, 0); 
    }
}