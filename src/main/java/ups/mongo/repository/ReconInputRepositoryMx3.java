package ups.mongo.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import ups.mongo.model.ReconInputMx3;

public interface ReconInputRepositoryMx3 extends MongoRepository<ReconInputMx3, Long> {
	
	public List<ReconInputMx3> findByReportId(String reportId);
	public List<ReconInputMx3> findByReportIdAndReportingDate(String reportId, Date reportingDate);
	
}
 