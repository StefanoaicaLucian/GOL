
package ro.uvt.gol;

import com.jogamp.opengl.util.texture.Texture;

public class GraphicObject {

  private int vertexArrayObjectID;
  private Material material;
  private Texture texture;
  private int totalElements;

  public GraphicObject(int vertexArrayObjectID, int totalElements, Texture texture, Material material) {
    this.vertexArrayObjectID = vertexArrayObjectID;
    this.totalElements = totalElements;
    this.texture = texture;
    this.material = material;
  }

  public int getVertexArrayObjectID() {
    return vertexArrayObjectID;
  }

  public void setVertexArrayObjectID(int vertexArrayObjectID) {
    this.vertexArrayObjectID = vertexArrayObjectID;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public Texture getTexture() {
    return texture;
  }

  public void setTexture(Texture texture) {
    this.texture = texture;
  }

  public int getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(int totalElements) {
    this.totalElements = totalElements;
  }
}
