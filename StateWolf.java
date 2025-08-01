public class StateWolf implements State {
  @Override
  public void communicate() {
    System.out.println("-GROWLS-");
  }
  @Override
  public void move() {
    System.out.println("-Runs-");
  }
  @Override
  public void personality() {
    System.out.println("-Approaches in a menacing manner- -GROWLS-");
  }
  @Override
  public void transform(Character character) {
    System.out.println("-Human Transformation-");
      character.setState(new StateHuman());
  }
}
