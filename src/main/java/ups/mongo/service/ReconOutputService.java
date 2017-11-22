package ups.mongo.service;

import java.util.Date;
import java.util.List;
import ups.mongo.model.ReconOutput;

public interface ReconOutputService {
	
    public List<ReconOutput> getByReportId(String reportId);
    
    public List<ReconOutput> getByReportIdAndReportingDate(String reportId, Date reportingDate);
    
    public void saveToMongoDB(ReconOutput reconInputMx3);
}
