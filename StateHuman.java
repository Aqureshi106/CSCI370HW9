public class StateHuman implements State {
  @Override
  public void communicate() {
    System.out.println("Hello");
  }
  @Override
  public void move() {
    System.out.println("-walking-");
  }
  @Override
  public void personality() {
    System.out.println("I arrive in peace; by no means in aggression.");
  }
  @Override
  public void transform(Character character) {
    System.out.println("-Wolf Transformation-");
      character.setState(new StateWolf());
  }
}
