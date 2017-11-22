package ups.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ups.mongo.service.ReconInputServiceMx2;
import ups.mongo.service.ReconOutputService;

@SpringBootApplication
public class MongoConnectionBootApplication implements ApplicationRunner  {
	
	@Autowired
	ReconInputServiceMx2 reconInputServiceMx2;
	
	@Autowired
	ReconOutputService reconOutputService;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoConnectionBootApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		
		System.out.println(reconInputServiceMx2.getByReportId("R315").size());
		
		System.out.println(reconOutputService.getByReportId("FXD10").size());
	}
}
