/**
 * 
 */
package afpa.cdi.banque.metier;

import java.util.List;

import afpa.cdi.banque.model.Client;

/**
 * @author 1603599
 *
 * <b>INTERFACE QUI EXPOSE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES PUBLIQUES DES SERVICES POUR L'ENTITE 'CLIENT'.</b>
 */
public interface IClientMetier {

	public Client addClient(Client pClient);
	public List<Client> findAllClient();
	public List<Client> findClientByCriteria(String pCriteria);
}
