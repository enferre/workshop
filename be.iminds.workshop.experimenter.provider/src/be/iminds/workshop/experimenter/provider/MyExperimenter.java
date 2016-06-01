package be.iminds.workshop.experimenter.provider;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

import be.iminds.workshop.experimenter.api.Experimenter;
import be.iminds.workshop.experimenter.api.Result;

@Component
public class MyExperimenter implements Experimenter {

	@Override
	public Result runExperiment(int id, Map<String, Object> parameters) {
		System.out.println("Running experiment "+id);
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		return new Result(start, end, "I slept 5 seconds...");
	}

}
