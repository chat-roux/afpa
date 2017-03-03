/**
 * 
 */
package afpa.cdi.banque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import afpa.cdi.banque.model.Client;

/**
 * @author 1603599
 * 
 * <b>INTERFACE QUI EXPOSE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES PUBLIQUES DE PERSISTANCE POUR L'ENTITE 'CLIENT'.</b>
 */
public interface IClientRepository extends JpaRepository<Client, Long> {

	@Query("select c from Client c where c.nom like :x")
	public List<Client> findByNom(@Param("x")String pNom);
	
}
