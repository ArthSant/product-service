package stock.product.service.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import stock.product.service.models.dto.department.DepartmentDTO;
import stock.product.service.models.entity.Department;
import stock.product.service.repository.DepartmentRepository;
import stock.product.service.util.Mapper;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    private final Mapper mapper;

    @Transactional
    public void createDepartment(DepartmentDTO dto) {
        Department department = mapper.map(dto, Department.class);
        departmentRepository.save(department);
   }

   public List<DepartmentDTO> getAllDepartments() {
        List<Department> departmentList = departmentRepository.findAll();
       return mapper.mapList(departmentList, DepartmentDTO.class);
   }
}
