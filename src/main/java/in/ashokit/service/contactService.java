package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.binding.contact;

@Service
public interface contactService    {

	String upsert(contact Contact);
	List<contact> getAllcontact();
	contact getId(int cid);
	String deleteId(int cid);
	
}
