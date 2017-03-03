/**
 * 
 */
package afpa.cdi.banque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import afpa.cdi.banque.model.Operation;

/**
 * @author 1603599
 *
 * <b>INTERFACE QUI EXPOSE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES PUBLIQUES DE PERSISTANCE POUR L'ENTITE 'OPERATION'.</b>
 */
public interface IOperationRepository extends JpaRepository<Operation, Long> {

}
