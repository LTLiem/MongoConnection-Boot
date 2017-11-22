package ups.mongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import ups.mongo.model.ReconInputMx2;

public interface ReconInputRepositoryMx2 extends MongoRepository<ReconInputMx2, Long> {
	
	public List<ReconInputMx2> findByReportId(String reportId);
	public List<ReconInputMx2> findByReportIdAndReportingDate(String reportId, Date reportingDate);
	
}
 