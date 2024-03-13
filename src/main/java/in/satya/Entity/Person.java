package in.satya.Entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	private String pName;
	private Double pSalary;
	
	@OneToMany(mappedBy = "person",
			cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private  List<address1> address;



	public Integer getpId() {
		return pId;
	}



	public void setpId(Integer pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public Double getpSalary() {
		return pSalary;
	}



	public void setpSalary(Double pSalary) {
		this.pSalary = pSalary;
	}



	public List<address1> getAddress() {
		return address;
	}



	public void setAddress(List<address1> address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pSalary=" + pSalary + ", address=" + address + "]";
	}
	
	



	
	
	

}
