package be.iminds.workshop.experimenter.api;

import java.util.Map;

public interface Experimenter {

	Result runExperiment(int id, Map<String, Object> parameters);
	
}
