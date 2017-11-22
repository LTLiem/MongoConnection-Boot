package ups.mongo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.ReconInputMx2;
import ups.mongo.repository.ReconInputRepositoryMx2;
import ups.mongo.service.ReconInputServiceMx2;

@Service("ReconInputServiceMx2")
public class ReconInputServiceMx2Impl implements ReconInputServiceMx2 {
	
	@Autowired
	private ReconInputRepositoryMx2 reconInputRepositoryMx2;

	@Override
	public List<ReconInputMx2> getByReportId(String reportId) {	
		return reconInputRepositoryMx2.findByReportId(reportId);
	}

	@Override
	public List<ReconInputMx2> getByReportIdAndReportingDate(String reportId, Date reportingDate) {
		return reconInputRepositoryMx2.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	@Override
	public void saveToMongoDB(ReconInputMx2 reconInputMx2) {
		reconInputRepositoryMx2.save(reconInputMx2);
	}
	
}
