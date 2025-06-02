package petshop;

import java.util.Set;
import java.util.Collections;
import java.util.EnumSet;

// Selected_Service options selected by the client.

public class Selected_Services {
	private EnumSet<ServiceType> services;
	
	public Selected_Services() {
		services = EnumSet.noneOf(ServiceType.class);
	}
	
	public void addService(ServiceType service) {
		services.add(service);
	}
	
	public void removeService(ServiceType service) {
		services.remove(service);
	}
	
	public boolean hasService(ServiceType service) {
		return services.contains(service);
	}
	
	public Set<ServiceType> getServices() {
		return Collections.unmodifiableSet(services);
	}

}
