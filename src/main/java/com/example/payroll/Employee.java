package com.example.payroll;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Employee {

  @Id
  @GeneratedValue
  @Getter
  @Setter
  private Long id;
  @Getter
  @Setter
  private String name;
  @Getter
  @Setter
  private String role;

  Employee() {}

  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (!(o instanceof Employee)) {
      return false;
    }
    Employee emp = (Employee) o;
    return Objects.equals(this.id, emp.id) && Objects.equals(this.name, emp.name)
        && Objects.equals(this.role, emp.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.role);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role
        + '\'' + '}';
  }
}
