/**
 * 
 */
package afpa.cdi.banque.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import afpa.cdi.banque.metier.ICompteMetier;
import afpa.cdi.banque.model.Compte;

/**
 * @author 1603599
 * <b>SERVICE REST QUI EXPOSE LES TRAITEMENTS METIER RELATIFS A L'ENTITE 'COMPTE'</b>
 */
@RestController
public class CompteRestService {

	@Autowired
	private ICompteMetier compteMetier;

	/**
	 * @param pCompte
	 * @return
	 * @see afpa.cdi.banque.metier.ICompteMetier#addCompte(afpa.cdi.banque.model.Compte)
	 */
	@RequestMapping(value="/comptes", method=RequestMethod.POST)
	@ResponseBody
	public Compte addCompte(@RequestBody Compte pCompte) {
		return compteMetier.addCompte(pCompte);
	}

	/**
	 * @param pCode
	 * @return
	 * @see afpa.cdi.banque.metier.ICompteMetier#getCompte(java.lang.String)
	 */
	@RequestMapping(value="/comptes/{pCode}", method=RequestMethod.GET)
	public Compte getCompte(@PathVariable String pCode) {
		return compteMetier.getCompte(pCode);
	}

	/**
	 * @return
	 * @see afpa.cdi.banque.metier.ICompteMetier#findAllCompte()
	 */
	@RequestMapping(value="/comptes", method=RequestMethod.GET)
	public List<Compte> findAllCompte() {
		return compteMetier.findAllCompte();
	}

	/**
	 * @param pCriteria
	 * @return
	 * @see afpa.cdi.banque.metier.ICompteMetier#findCompteByCriteria(java.lang.String)
	 */
	public List<Compte> findCompteByCriteria(String pCriteria) {
		return compteMetier.findCompteByCriteria(pCriteria);
	}
}
