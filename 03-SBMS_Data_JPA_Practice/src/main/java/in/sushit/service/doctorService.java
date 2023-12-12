package in.sushit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.sushit.DoctorInfo;
import in.sushit.Repository.doctorRepository;
@Service
public class doctorService {
	
private doctorRepository docRepository;

public doctorService(doctorRepository docRepository) {
	super();
	this.docRepository = docRepository;
}
public void saveDoctorInfo() {
	DoctorInfo doctorInfo=new DoctorInfo();
	doctorInfo.setDoctorId(102);
	doctorInfo.setDoctorName("Rajesh");
	doctorInfo.setDoctorCity("Pune");
	doctorInfo.setDoctorFees(20000);
	doctorInfo.setDoctorSpecialization("Ear/Nose");
	docRepository.save(doctorInfo);
}
public void saveMultipleDoctors() {
	DoctorInfo doctorInfo=new DoctorInfo();
	doctorInfo.setDoctorId(103);
	doctorInfo.setDoctorName("govind");
	doctorInfo.setDoctorCity("Pune");
	doctorInfo.setDoctorFees(25000);
	doctorInfo.setDoctorSpecialization("Ear/Nose");
	
	DoctorInfo doctorInfo1=new DoctorInfo();
	doctorInfo1.setDoctorId(104);
	doctorInfo1.setDoctorName("Sushant");
	doctorInfo1.setDoctorCity("Nagpur");
	doctorInfo1.setDoctorFees(20000);
	doctorInfo1.setDoctorSpecialization("Cancer");
	List<DoctorInfo> doctorList=Arrays.asList(doctorInfo,doctorInfo1);
	docRepository.saveAll(doctorList);
}
public void getDoctor(Integer Id) {
	Optional<DoctorInfo> info=docRepository.findById(Id);
	if(info.isPresent()) {
		DoctorInfo info1=info.get();
		System.out.println(info1);
	}
}
public void getAllDoctors() {
	Iterable<DoctorInfo> findAll=docRepository.findAll();
	findAll.forEach(System.out::println);
}
public void existById(Integer id) {
	boolean result=docRepository.existsById(id);
	if(result) {
		System.out.println("Record is Exist");
	}else {
		System.out.println("Record is not Exist!!");
	}
}
public void CountOfDoctors() {
	long count=docRepository.count();
	System.out.println(count);
}
public void DeleteById(Integer id) {
	docRepository.deleteById(id);
}
public void deleteAll() {
	docRepository.deleteAll();
}
public void getDoctorInfofindBySpecialization(String Specialization) {
	List<DoctorInfo> doctors=docRepository.findBydoctorSpecialization(Specialization);
	System.out.println(doctors);
}
}
