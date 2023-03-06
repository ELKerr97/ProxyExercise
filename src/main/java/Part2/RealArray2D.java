package Part2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RealSubject implements Array2D{

  private int[][] array;
  private String fileName;

  public RealSubject(int numRows, int numCol) {
    this.array = new int[numRows][numCol];
  }

  public RealSubject(String fileName) {
    this.fileName = fileName;
  }

  private void writeArrayToFile(){
    try{
      FileOutputStream fos = new FileOutputStream(fileName);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(array);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private void readArrayFromFile(){
    try {
      FileInputStream fis = new FileInputStream(fileName);
      ObjectInputStream iis = new ObjectInputStream(fis);
      newTwoD = (int[][]) iis.readObject();
    } catch (Exception ex){
      ex.printStackTrace();
    }
  }

  @Override
  public void set(int row, int col, int value) {

  }

  @Override
  public void get(int row, int col) {

  }
}
