package railway.com.example.RailwayAndMeal.controller;

import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import railway.com.example.RailwayAndMeal.Entity.Ticket;
import railway.com.example.RailwayAndMeal.exceptions.TicketBodyInvalidException;
import railway.com.example.RailwayAndMeal.service.RailwayService;

@RestController
@RequestMapping("/railway")
public class Controller {

	@Autowired
	private RailwayService railwayservice;		
	
	@PostMapping("/ticket")
	public void addTicket(@Valid @RequestBody Ticket ticket, BindingResult bindingResult) {
		if (bindingResult.hasErrors()){
			throw new TicketBodyInvalidException("Ticket body is not valid");
		}
		railwayservice.addTicket(ticket);
	}
	
	
	@GetMapping("/tickets")
	public List<Ticket> getAllTickets(){
		return railwayservice.getAllTickets();
	}
	
	@GetMapping("/ticket/{pnr}")
	public Ticket getTicketByPnr(@PathVariable long pnr) {
		return railwayservice.getTicketByPnr(pnr);
	}
	
	@DeleteMapping("/ticket/{pnr}")
	public void deleteTicket(@PathVariable long pnr) {
		railwayservice.deleteTicketByPnr(pnr);
	}


	@PutMapping("/ticket")
	public void updateTicket(@Valid @RequestBody Ticket ticket, BindingResult bindingResult) {
		if (bindingResult.hasErrors()){
			throw new TicketBodyInvalidException("Ticket body is invalid");
		}
		railwayservice.updateTicket(ticket);
	}

}
