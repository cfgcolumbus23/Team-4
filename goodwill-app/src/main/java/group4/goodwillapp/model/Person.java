package group4.goodwillapp.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
  public Person(){}

  public Person(String name, String email, String phoneNum, int age, String password){
      this.name = name;
      this.email = email;
      this.phoneNum = phoneNum;
      this.age = age;
      this.password = password;
  }
}
