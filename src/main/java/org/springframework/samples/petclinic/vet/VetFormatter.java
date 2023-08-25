package org.springframework.samples.petclinic.vet;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class VetFormatter implements Formatter<Vet> {

	private final VetRepository vets;

	public VetFormatter(VetRepository vets) {
		this.vets = vets;
	}

	@Override
	public String print(Vet vet, Locale locale) {
		return vet.getFirstName() + " " + vet.getLastName();
	}

	@Override
	public Vet parse(String text, Locale locale) throws ParseException {
		Collection<Vet> findVets = this.vets.findAll();
		for (Vet vet : findVets) {
			if ((vet.getFirstName() + " " + vet.getLastName()).equals(text)) {
				return vet;
			}
		}
		throw new ParseException("type not found: " + text, 0);
	}
}
