/**
 * 
 */
package afpa.cdi.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import afpa.cdi.banque.metier.IClientMetier;
import afpa.cdi.banque.model.Client;

/**
 * @author 1603599
 * <b>SERVICE REST QUI EXPOSE LES TRAITEMENTS METIER RELATIFS A L'ENTITE 'CLIENT'</b>
 */
@RestController
public class ClientRestService {
	
	@Autowired
	private IClientMetier clientMetier;

	/**
	 * @param pClient
	 * @return
	 * @see afpa.cdi.banque.metier.IClientMetier#addClient(afpa.cdi.banque.model.Client)
	 */
	@RequestMapping(value="/clients", method=RequestMethod.POST)
	@ResponseBody
	public Client addClient(@RequestBody Client pClient) {
		return clientMetier.addClient(pClient);
	}

	/**
	 * @return
	 * @see afpa.cdi.banque.metier.IClientMetier#findAllClient()
	 */
	@RequestMapping(value="/clients", method=RequestMethod.GET)
	public List<Client> findAllClient() {
		return clientMetier.findAllClient();
	}

	/**
	 * @param pCriteria
	 * @return
	 * @see afpa.cdi.banque.metier.IClientMetier#findClientByCriteria(java.lang.String)
	 */
	public List<Client> findClientByCriteria(String pCriteria) {
		return clientMetier.findClientByCriteria(pCriteria);
	}
	
}
