package in.sushit.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.sushit.DoctorInfo;

public interface doctorRepository extends CrudRepository<DoctorInfo,Integer> {
public List<DoctorInfo> findBydoctorSpecialization(String Specialization);
}
