package Part1;

public class RealSubject implements Subject{

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int sub(int num1, int num2) {
    return num1 - num2;
  }

  @Override
  public int multiply(int num1, int num2) {
    return num1 + num2;
  }
}
