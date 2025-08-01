public class Character {
  private State state;
  public Character() {
    this.state = new StateHuman();
  }
  public void setState(State state) {
    this.state = state;
  }
  public void communicate() {
    state.communicate();
  }
  public void move() {
    state.move();
  }
  public void personality() {
    state.personality();
  }
  public void transform() {
    state.transform(this);
  }
}
