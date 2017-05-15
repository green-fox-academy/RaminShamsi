package hu.greenfox.ramin.models;


import org.springframework.stereotype.Component;

@Component
public class Yondu {

  private float distance;
  private float time;
  private float speed;

  public float speed(float distance, float time) {
    return speed = distance / time;
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
