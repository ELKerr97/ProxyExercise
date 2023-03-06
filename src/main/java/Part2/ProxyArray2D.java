package Part2;

public class ProxyArray2D implements Array2D{

  private RealArray2D realArray2D;
  private String fileName;

  public ProxyArray2D(String fileName) {
    this.fileName=fileName;
  }

  @Override
  public void set(int row, int col, int value) {

  }

  @Override
  public void get(int row, int col) {

  }
}
