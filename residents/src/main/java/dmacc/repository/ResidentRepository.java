/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 24, 2024 
*/ 
package dmacc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Long> {
	

}
