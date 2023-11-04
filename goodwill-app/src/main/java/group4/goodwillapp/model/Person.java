package group4.goodwillapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phoneNum")
  private String phoneNum;

  @JsonProperty("age")
  private int age;

  @JsonProperty("password")
  private String password;

  public Person(){}

  public Person(String name, String email, String phoneNum, int age, String password){
      this.name = name;
      this.email = email;
      this.phoneNum = phoneNum;
      this.age = age;
      this.password = password;
  }
}
