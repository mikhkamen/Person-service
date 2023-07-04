package telran.java47.person.service;

import telran.java47.person.dto.AddressDto;
import telran.java47.person.dto.ChildDto;
import telran.java47.person.dto.CityPopulationDto;
import telran.java47.person.dto.EmployeeDto;
import telran.java47.person.dto.PersonDto;

public interface PersonService {
	Boolean addPerson(PersonDto personDto);

	PersonDto findPersonById(Integer id);
	
	PersonDto removePerson(Integer id);
	
	PersonDto updatePersonName(Integer id, String name);
	
	PersonDto updatePersonAddress(Integer id, AddressDto addressDto);
	
	Iterable<PersonDto> findPersonsByCity(String city);
	
	Iterable<PersonDto> findPersonsByName(String name);
	
	Iterable<PersonDto> findPersonsBetweenAge(Integer minAge, Integer maxAge);
	
	Iterable<CityPopulationDto> getCitiesPopulation();

	Iterable<ChildDto> findAllChildren();

	Iterable<EmployeeDto> findEmployeeBySalary(Integer minSalary, Integer maxSalary);

}
