package telran.java47.person.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable{
	
	private static final long serialVersionUID = -1250554987023825175L;
	
	@Id
	Integer id;
	@Setter
    String name;
    LocalDate birthDate;
    @Setter
    //@Embedded
    Address address;
}
