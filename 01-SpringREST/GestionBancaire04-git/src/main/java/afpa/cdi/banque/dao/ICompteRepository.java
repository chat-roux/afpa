/**
 * 
 */
package afpa.cdi.banque.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import afpa.cdi.banque.model.Compte;

/**
 * @author 1603599
 *
 * <b>INTERFACE QUI EXPOSE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES PUBLIQUES DE PERSISTANCE POUR L'ENTITE 'COMPTE'.</b>
*/
public interface ICompteRepository extends JpaRepository<Compte, String> {

	@Query("select c from Compte c where c.code like :x")
	public List<Compte> findByCode(@Param("x")String pCode);
	
	
	//TODO FIND-BY-CLIENT : A IMPLEMENTER
}
