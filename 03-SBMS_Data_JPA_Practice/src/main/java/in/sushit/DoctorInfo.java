package in.sushit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class DoctorInfo {
	@Id
private Integer doctorId;
private String doctorName;
private String doctorCity;
private String doctorSpecialization;
private double doctorFees;

public DoctorInfo() {
	
}

public DoctorInfo(Integer doctorId, String doctorName, String doctorCity, String doctorSpecialization,
		double doctorFees) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.doctorCity = doctorCity;
	this.doctorSpecialization = doctorSpecialization;
	this.doctorFees = doctorFees;
}

public Integer getDoctorId() {
	return doctorId;
}

public void setDoctorId(Integer doctorId) {
	this.doctorId = doctorId;
}

public String getDoctorName() {
	return doctorName;
}

public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}

public String getDoctorCity() {
	return doctorCity;
}

public void setDoctorCity(String doctorCity) {
	this.doctorCity = doctorCity;
}

public String getDoctorSpecialization() {
	return doctorSpecialization;
}

public void setDoctorSpecialization(String doctorSpecialization) {
	this.doctorSpecialization = doctorSpecialization;
}

public double getDoctorFees() {
	return doctorFees;
}

public void setDoctorFees(double doctorFees) {
	this.doctorFees = doctorFees;
}

@Override
public String toString() {
	return "DoctorInfo [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorCity=" + doctorCity
			+ ", doctorSpecialization=" + doctorSpecialization + ", doctorFees=" + doctorFees + "]";
}


}