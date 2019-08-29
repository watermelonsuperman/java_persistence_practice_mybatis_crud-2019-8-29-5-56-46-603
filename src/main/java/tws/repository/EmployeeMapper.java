package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();
    void insert (@Param(value = "employee")Employee employee);
    void delete (@Param(value = "id")int id);
    void update (@Param(value = "id")int id,@Param(value = "employee")Employee employee);
}
