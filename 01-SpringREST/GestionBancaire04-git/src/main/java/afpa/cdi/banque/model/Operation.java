/**
 * 
 */
package afpa.cdi.banque.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author 1603599
 *
 */
@SuppressWarnings("serial")
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPERATION", discriminatorType=DiscriminatorType.STRING, length=1)
public abstract class Operation implements Serializable {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numero;
	
	private Date date;
	private double montant;
	
	@ManyToOne
	@JoinColumn(name="CODE_COMPTE", nullable=false)
	private Compte compte;
	
	

	/**
	 * <b>CONSTRUCTEUR SANS ARGUMENTS</b>
	 */
	public Operation() { super(); }
	
	/**
	 * <b>CONSTRUCTEUR AVEC ARGUMENTS</b>
	 * 
	 * @param pDate
	 * @param pMontant
	 */
	public Operation(Date pDate, double pMontant) {
		super();
		this.date = pDate;
		this.montant = pMontant;
	}



	/**
	 * @return the numero
	 */
	public Long getNumero() { return this.numero; }
	
	/**
	 * @return the date
	 */
	public Date getDate() { return this.date; }
	
	/**
	 * @return the montant
	 */
	public double getMontant() { return this.montant; }
	
	/**
	 * @return the compte
	 */
	public Compte getCompte() { return this.compte; }

	
	
	
	
	

	/**
	 * @param pNumero the numero to set
	 */
	public void setNumero(Long pNumero) { this.numero = pNumero; }
	
	/**
	 * @param pDate the date to set
	 */
	public void setDate(Date pDate) { this.date = pDate; }
	
	/**
	 * @param pMontant the montant to set
	 */
	public void setMontant(double pMontant) { this.montant = pMontant; }
	
	/**
	 * @param pCompte the compte to set
	 */
	public void setCompte(Compte pCompte) { this.compte = pCompte; }
}
