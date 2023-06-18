package lucasnscr.services.organizationservice.client;

import lucasnscr.services.organizationservice.model.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "department")
public interface DepartmentClient {

    @GetMapping("/organization/{organizationId}")
    List<Department> findByOrganization(@PathVariable("organizationId") String organizationId);

    @GetMapping("/organization/{organizationId}/with-employees")
    List<Department> findByOrganizationWithEmployees(@PathVariable("organizationId") String organizationId);

}
