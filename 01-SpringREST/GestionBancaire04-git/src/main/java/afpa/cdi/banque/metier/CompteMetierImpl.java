/**
 * 
 */
package afpa.cdi.banque.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afpa.cdi.banque.dao.ICompteRepository;
import afpa.cdi.banque.model.Compte;

/**
 * @author 1603599
 *
 * <b>CLASSE QUI IMPLEMENTE LES FONCTIONNALITES SUIVANTES : </b>
 * <br/><b>LES FONCTIONNALITES DES SERVICES POUR L'ENTITE 'COMPTE'.</b>
 */
@Service
public class CompteMetierImpl implements ICompteMetier {

	@Autowired
	private ICompteRepository compteRepository;
	

	@Override
	public Compte addCompte(Compte pCompte) {
		pCompte.setDateCreation(new Date());
		Compte compteCreated = null;
		try {
			compteCreated = this.compteRepository.save(pCompte);
			
		} catch (Exception e) {
			System.out.println("CLASS : CompteMetierImpl -- METHOD : addCompte -- Exception : " + e.getMessage());
		}
		return compteCreated;
	}
	
	@Override
	public Compte getCompte(String pCode) {
		Compte compteFound = compteRepository.findOne(pCode);
		return compteFound;
	}



	/* (non-Javadoc)
	 * @see com.example.service.ICompteService#findAllCompte()
	 */
	@Override
	public List<Compte> findAllCompte() {
		List<Compte> comptesFound = this.compteRepository.findAll();
		return comptesFound;
	}

	@Override
	public List<Compte> findCompteByCriteria(String pCriteria) {
		List<Compte> comptesFound = this.compteRepository.findByCode(pCriteria);
		return comptesFound;
	}
}
