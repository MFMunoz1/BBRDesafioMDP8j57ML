package cl.bbr.mdp.service;

import cl.bbr.mdp.entity.EntityTransaction;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface Service {
	
	EntityTransaction createRamdonTrx ( );

	ResponseEntity<List<EntityTransaction>> getTrx(String type);
}
