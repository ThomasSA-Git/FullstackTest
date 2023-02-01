package dat3.day1_2.entity;

import jakarta.persistence.*;

@Entity
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  @Column(name="spiller_navn", nullable = false)
  String name;


  public Player() {
  }
  public Player(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
