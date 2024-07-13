package stock.product.service.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import stock.product.service.models.dto.department.DepartmentDTO;
import stock.product.service.models.entity.Department;
import stock.product.service.repository.DepartmentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Transactional
    public void createDepartment(DepartmentDTO dto) {
        Department department = new Department(dto);
        departmentRepository.save(department);
   }

   public List<DepartmentDTO> getAllDepartments() {
        List<Department> departmentList = departmentRepository.findAll();
       return departmentList.stream().map(DepartmentDTO::new).toList();
   }
}
