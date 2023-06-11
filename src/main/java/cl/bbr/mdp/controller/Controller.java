package cl.bbr.mdp.controller;

import cl.bbr.mdp.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/desafio/mdp/")
public class Controller {

	 	@Autowired
	    private Service service;
	 	
	    @PostMapping("/create")
	    @ResponseBody
	    public ResponseEntity<?> createRamdonTrx() {
	    	ResponseEntity<?> result = new ResponseEntity<Object>(service.createRamdonTrx(), HttpStatus.OK);
	    	return result;
	    }

		@GetMapping(value = "/search")
		@ResponseBody
		public ResponseEntity<?> getTrx(@RequestParam(name = "type", required = false)  String type) {
			ResponseEntity<?> result = service.getTrx(type);
			return result;
		}

}
