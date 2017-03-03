/**
 * 
 */
package afpa.cdi.banque.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afpa.cdi.banque.dao.IClientRepository;
import afpa.cdi.banque.model.Client;

/**
 * @author 1603599
 *
 * <b>CLASSE QUI IMPLEMENTE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES DES SERVICES POUR L'ENTITE 'CLIENT'.</b>
 */
@Service
public class ClientMetierImpl implements IClientMetier {

	@Autowired
	private IClientRepository clientRepository;
	

	/* (non-Javadoc)
	 * @see com.example.service.IClientService#addClient(com.example.model.Client)
	 */
	@Override
	public Client addClient(Client pClient) {
		Client clientCreated = this.clientRepository.save(pClient);
		return clientCreated;
	}

	/* (non-Javadoc)
	 * @see com.example.service.IClientService#findAllClient()
	 */
	@Override
	public List<Client> findAllClient() {
		List<Client> clientsFound = this.clientRepository.findAll();
		return clientsFound;
	}

	/* (non-Javadoc)
	 * @see com.example.service.IClientService#findClientByCriteria(java.lang.String)
	 */
	@Override
	public List<Client> findClientByCriteria(String pCriteria) {
		List<Client> clientsFound = this.clientRepository.findByNom(pCriteria);
		return clientsFound;
	}

}
