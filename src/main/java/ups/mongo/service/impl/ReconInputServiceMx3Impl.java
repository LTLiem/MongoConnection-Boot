package ups.mongo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.ReconInputMx3;
import ups.mongo.repository.ReconInputRepositoryMx3;
import ups.mongo.service.ReconInputServiceMx3;

@Service("ReconInputServiceMx3")
public class ReconInputServiceMx3Impl implements ReconInputServiceMx3 {
	
	@Autowired
	private ReconInputRepositoryMx3 reconInputRepositoryMx3;

	@Override
	public List<ReconInputMx3> getByReportId(String reportId) {
		return reconInputRepositoryMx3.findByReportId(reportId);
	}

	@Override
	public List<ReconInputMx3> getByReportIdAndReportingDate(String reportId, Date reportingDate) {
		return reconInputRepositoryMx3.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	@Override
	public void saveToMongoDB(ReconInputMx3 reconInputMx3) {
		reconInputRepositoryMx3.save(reconInputMx3);
	}
	
}
