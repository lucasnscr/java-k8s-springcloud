package lucasnscr.services.organizationservice.repository;

import lucasnscr.services.organizationservice.model.Organization;
import org.springframework.data.repository.CrudRepository;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}
