package cl.bbr.mdp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import cl.bbr.mdp.entity.EntityTransaction;
import cl.bbr.mdp.repository.TrxRepository;

@Service
public class ServiceImpl implements cl.bbr.mdp.service.Service {

	@Value("${custom.global.user}")
	private String user;

	@Value("${custom.global.commerce}")
	private String commerce;

	enum Type
	{
	    DEBITO, CREDITO, CHEQUE, EFECTIVO;
	}
	
	@Autowired
	private TrxRepository trxRepository;

	public EntityTransaction createRamdonTrx () {
		
		EntityTransaction entTrx = new EntityTransaction ();
		Random ran = new Random();
		int amount = ran.nextInt(6000) + 5000;
		entTrx.setType( Type.values()[new Random().nextInt(Type.values().length)].toString());
		entTrx.setAmount(amount);
		entTrx.setUser(user);
		entTrx.setCommerce(commerce);
		LocalDateTime dateTime = LocalDateTime.now();
		entTrx.setDatetrx(dateTime);
		trxRepository.save( entTrx );
		return entTrx;
	}

	public ResponseEntity<List<EntityTransaction>> getTrx(String type) {
		if (Objects.isNull(type)) {
			return new ResponseEntity<>(trxRepository.findAll(), HttpStatus.OK);
		}
		try {
			Type.valueOf(type);
			return new ResponseEntity<>(trxRepository.findAllByType(type), HttpStatus.OK);
		} catch (IllegalArgumentException e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
}
