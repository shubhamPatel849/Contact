package in.ashokit.rest;


import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.contact;
import in.ashokit.service.contactService;

@RestController
public class contactRestController {

	@Autowired
	 private contactService service;
	
	@PostMapping("/contact")
	public ResponseEntity<String> getMsg(@RequestBody contact Contact){
		String upsert = service.upsert(Contact);
		return new ResponseEntity<String>(upsert,HttpStatus.OK);
	}
	@GetMapping("/contacts")
	public ResponseEntity<Integer> getAllMSg(){
		
	  List<contact> list = service.getAllcontact();
	  if(list.isEmpty()) {
		  return null;
	  }
	return  null;
	  
	  
	}
	@DeleteMapping("/contact/{cid}")
	public ResponseEntity<String> Deleteid(int cid){
		String deleteId = service.deleteId(cid);
		return new ResponseEntity<String>(deleteId,HttpStatus.OK);
	}
	
	
}
