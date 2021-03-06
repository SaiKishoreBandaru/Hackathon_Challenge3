package misc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;

import clustering.Cluster;

public class Configuration {
	private static HashMap<String, String> config = new HashMap<String, String>();
	private static ArrayList<String> validParameters = new ArrayList<String>();
	public static int validParametersSet = 0;

	private final static Logger LOGGER = Logger.getLogger(Configuration.class);

	static {
		config.put("kmeans.kvalue", "768");
		config.put("kmeans.iteration", "5");
		config.put("imageset.path", "/Users/jagadishpd/Documents/eclipse/JavaWorkspace/image2");
		config.put("arff.path", "/Users/jagadishpd/Desktop/ttt.arff");
		config.put("arff.relation", "results");
		config.put("random.seed","2");
		

		validParameters.add("kmeans.kvalue");
		validParameters.add("kmeans.iteration");
		validParameters.add("imageset.path");
		validParameters.add("arff.path");
		validParameters.add("random.seed");
		System.out.println("Config:"+config);
		System.out.println("In static Valid Parameters:"+validParameters);
		
	}

	public static void addConfiguration(String key, String value) {
		Configuration.config.put(key, value);
		System.out.println("addConfig"+config);
		System.out.println("in add configuation");
	}

	public static String getConfiguration(String key) {
		System.out.println("in get configuration");
		System.out.println("Key"+key);
		return Configuration.config.get(key);
	}

	public static void readFromRunArgs(String[] args) {
		
		/*for (int i = 0; i < args.length; i++) {
			if (Configuration.parameterExists(args[i])) {
				String key = args[i].substring(1);
				String value = args[i + 1];
				Configuration.addConfiguration(key, value);
				Configuration.validParametersSet++;
				System.out.println("In read configuration");
			}
		}*/
	}

	private static boolean parameterExists(String p) {
		for (String s : Configuration.validParameters) {
			System.out.println("In parameterExists");
			if (("-" + s).equals(p))
				return true;
		}
		return false;
	}

	public static void defaultvalues(){
		config.put("kmeans.kvalue", "3");
		config.put("kmeans.iteration", "15");
		config.put("imageset.path", "/Users/jagadishpd/Documents/eclipse/JavaWorkspace/image2");
		config.put("arff.path", "/Users/jagadishpd/Desktop/ttt.arff");
		config.put("arff.relation", "results");
		config.put("random.seed", "2");
		

		validParameters.add("kmeans.kvalue");
		validParameters.add("kmeans.iteration");
		validParameters.add("imageset.path");
		validParameters.add("arff.path");
		validParameters.add("random.seed");
		
	}
	public static void readFromFile(String path) {
		// TODO
	}

	public static void debugParameters() {
		
		System.out.println("In debug Parameter List");
		// TODO
		LOGGER.info("LOADED PARAMETERS DEBUGGING");
		for (String key : Configuration.config.keySet()) {
			LOGGER.info("[" + key + "] = [" + config.get(key) + "]");
		}
		LOGGER.info("Please check if all parameters are correct.");
		LOGGER.info("Press [ENTER] to continue...");
		/*try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
