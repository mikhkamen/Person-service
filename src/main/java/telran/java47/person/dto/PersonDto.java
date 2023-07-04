package telran.java47.person.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import lombok.Getter;

@Getter
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
	@Type(name = "child", value = ChildDto.class),
	@Type(name = "employee", value = EmployeeDto.class),
	@Type(name = "person", value = PersonDto.class)
})
public class PersonDto {
	Integer id;
    String name;
    LocalDate birthDate;
    AddressDto address;
}
