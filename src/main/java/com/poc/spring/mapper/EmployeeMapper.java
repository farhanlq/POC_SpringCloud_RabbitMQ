package com.poc.spring.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import com.poc.spring.model.Employee;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {
	
	@Mappings({
		@Mapping(target = "empId", expression = "java(UUID.randomUUID())"),
		@Mapping(target = "empName", source = "empName")
	})
	Employee empToEmpMapper(Employee employee);

	
}
