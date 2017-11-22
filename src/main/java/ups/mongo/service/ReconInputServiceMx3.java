package ups.mongo.service;

import java.util.Date;
import java.util.List;
import ups.mongo.model.ReconInputMx3;

public interface ReconInputServiceMx3 {
	
    public List<ReconInputMx3> getByReportId(String reportId);
    
    public List<ReconInputMx3> getByReportIdAndReportingDate(String reportId, Date reportingDate);
    
    public void saveToMongoDB(ReconInputMx3 reconInputMx3);
}
