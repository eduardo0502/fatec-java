package sv.com.farmatec.models.dao;

import org.springframework.data.repository.CrudRepository;
import sv.com.farmatec.models.entities.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {}