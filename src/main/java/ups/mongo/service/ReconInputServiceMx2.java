package ups.mongo.service;


import java.util.Date;
import java.util.List;

import ups.mongo.model.ReconInputMx2;

public interface ReconInputServiceMx2 {	
	
    public List<ReconInputMx2> getByReportId(String reportId);
    
    public List<ReconInputMx2> getByReportIdAndReportingDate(String reportId, Date reportingDate);
    
    public void saveToMongoDB(ReconInputMx2 reconInputMx2);
    
}
