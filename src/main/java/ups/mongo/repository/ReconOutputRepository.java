package ups.mongo.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import ups.mongo.model.ReconOutput;

public interface ReconOutputRepository extends MongoRepository<ReconOutput, Long> {
	
	public List<ReconOutput> findByReportId(String reportId);
	public List<ReconOutput> findByReportIdAndReportingDate(String reportId, Date reportingDate);
	
}
