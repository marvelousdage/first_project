package xyz.marsj.spring.jdbc;

public class Employee {
	private Long id;
   private String name;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
