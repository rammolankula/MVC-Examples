package MvcExampleCurd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="std_Id")
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="PIN")
	private String pin;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="Cost")
	private Double Cost;
	
	
	@Column(name="Discount")
	private Double discount;
	
	@Column(name="Gst")
	private Double gst;

}
