package ups.mongo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.mongo.model.ReconOutput;
import ups.mongo.repository.ReconOutputRepository;
import ups.mongo.service.ReconOutputService;

@Service("ReconOutputService")
public class ReconOutputServiceImpl implements ReconOutputService {
	
	@Autowired
	private ReconOutputRepository reconOutputRepository;

	@Override
	public List<ReconOutput> getByReportId(String reportId) {
		return reconOutputRepository.findByReportId(reportId);
	}

	@Override
	public List<ReconOutput> getByReportIdAndReportingDate(String reportId, Date reportingDate) {
		return reconOutputRepository.findByReportIdAndReportingDate(reportId, reportingDate);
	}

	@Override
	public void saveToMongoDB(ReconOutput reconInputMx3) {
		reconOutputRepository.save(reconInputMx3);
	}

}
