package be.iminds.workshop.experimenter.client.cli;

import java.util.HashMap;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import be.iminds.workshop.experimenter.api.Experimenter;
import be.iminds.workshop.experimenter.api.Result;

@Component(
	service={Object.class},
	property = {
		"osgi.command.scope=experiment",
		"osgi.command.function=run"
	})
public class CLIClient {

	@Reference
	private Experimenter experimenter;
	
	public void run(int id){
		Result r = experimenter.runExperiment(id, new HashMap<>());
		System.out.println("Experiment "+id+" done in "+(r.timeEnded-r.timeStarted)/1000+" s: "+r.result);
	}
	
}
