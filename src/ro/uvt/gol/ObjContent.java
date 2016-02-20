
package ro.uvt.gol;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import com.jogamp.common.nio.Buffers;

public class ObjContent {

  private int vaoID;

  private int vertexBufferID;
  private int textureBufferID;
  private int normalBufferID;
  private int elementBufferID;

  private FloatBuffer vertexBufferData;
  private FloatBuffer textureBufferData;
  private FloatBuffer normalBufferData;
  private IntBuffer elementBufferData;

  private String mtlFileName;

  public int computeVertexBufferSize() {
    return vertexBufferData.capacity() * Buffers.SIZEOF_FLOAT;
  }

  public int computeNormalBufferSize() {
    return normalBufferData.capacity() * Buffers.SIZEOF_FLOAT;
  }

  public int computeTextureBufferSize() {
    return textureBufferData.capacity() * Buffers.SIZEOF_FLOAT;
  }

  public int computeElementBufferSize() {
    return elementBufferData.capacity() * Buffers.SIZEOF_INT;
  }

  public int computeTotalElements() {
    return elementBufferData.capacity();
  }

  // getters & setters
  public int getVaoID() {
    return vaoID;
  }

  public void setVaoID(int vaoID) {
    this.vaoID = vaoID;
  }

  public int getVertexBufferID() {
    return vertexBufferID;
  }

  public void setVertexBufferID(int vertexBufferID) {
    this.vertexBufferID = vertexBufferID;
  }

  public int getTextureBufferID() {
    return textureBufferID;
  }

  public void setTextureBufferID(int textureBufferID) {
    this.textureBufferID = textureBufferID;
  }

  public int getNormalBufferID() {
    return normalBufferID;
  }

  public void setNormalBufferID(int normalBufferID) {
    this.normalBufferID = normalBufferID;
  }

  public int getElementBufferID() {
    return elementBufferID;
  }

  public void setElementBufferID(int elementBufferID) {
    this.elementBufferID = elementBufferID;
  }

  public FloatBuffer getVertexBufferData() {
    return vertexBufferData;
  }

  public void setVertexBufferData(FloatBuffer vertexBufferData) {
    this.vertexBufferData = vertexBufferData;
  }

  public FloatBuffer getTextureBufferData() {
    return textureBufferData;
  }

  public void setTextureBufferData(FloatBuffer textureBufferData) {
    this.textureBufferData = textureBufferData;
  }

  public FloatBuffer getNormalBufferData() {
    return normalBufferData;
  }

  public void setNormalBufferData(FloatBuffer normalBufferData) {
    this.normalBufferData = normalBufferData;
  }

  public IntBuffer getElementBufferData() {
    return elementBufferData;
  }

  public void setElementBufferData(IntBuffer elementBufferData) {
    this.elementBufferData = elementBufferData;
  }

  public String getMtlFileName() {
    return mtlFileName;
  }

  public void setMtlFileName(String mtlFileName) {
    this.mtlFileName = mtlFileName;
  }
}
