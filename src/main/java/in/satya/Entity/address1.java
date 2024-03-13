package in.satya.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class address1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aId;
	private String  aVillage;
	private String  aMandal;
	private String  aState;
	
	@ManyToOne
	@JoinColumn(name="add_id")
	private Person person;


	public Integer getaId() {
		return aId;
	}


	public void setaId(Integer aId) {
		this.aId = aId;
	}


	public String getaVillage() {
		return aVillage;
	}


	public void setaVillage(String aVillage) {
		this.aVillage = aVillage;
	}


	public String getaMandal() {
		return aMandal;
	}


	public void setaMandal(String aMandal) {
		this.aMandal = aMandal;
	}


	public String getaState() {
		return aState;
	}


	public void setaState(String aState) {
		this.aState = aState;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	@Override
	public String toString() {
		return "address1 [aId=" + aId + ", aVillage=" + aVillage + ", aMandal=" + aMandal + ", aState=" + aState + "]";
	}
	
	
	

}
