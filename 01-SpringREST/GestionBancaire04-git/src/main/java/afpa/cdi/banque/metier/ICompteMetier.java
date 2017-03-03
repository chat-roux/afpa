/**
 * 
 */
package afpa.cdi.banque.metier;

import java.util.List;

import afpa.cdi.banque.model.Compte;

/**
 * @author 1603599
 *
 * <b>INTERFACE QUI EXPOSE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES PUBLIQUES DES SERVICES POUR L'ENTITE 'COMPTE'.</b>
 */
public interface ICompteMetier {

	public Compte addCompte(Compte pCompte);
	public Compte getCompte(String pCode);
	public List<Compte> findAllCompte();
	public List<Compte> findCompteByCriteria(String pCriteria);
}
