
package ro.uvt.gol;

public class VertexIndices {

  private int positionIndex;
  private int textureIndex;
  private int normalIndex;

  public VertexIndices(int positionIndex, int textureIndex, int normalIndex) {
    this.positionIndex = positionIndex;
    this.textureIndex = textureIndex;
    this.normalIndex = normalIndex;
  }
  
  // getters & setters
  public int getPositionIndex() {
    return positionIndex;
  }

  public void setPositionIndex(int positionIndex) {
    this.positionIndex = positionIndex;
  }

  public int getTextureIndex() {
    return textureIndex;
  }

  public void setTextureIndex(int textureIndex) {
    this.textureIndex = textureIndex;
  }

  public int getNormalIndex() {
    return normalIndex;
  }

  public void setNormalIndex(int normalIndex) {
    this.normalIndex = normalIndex;
  }
}