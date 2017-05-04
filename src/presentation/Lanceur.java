package presentation;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import metier.Compte;

public class Lanceur {

	public static void main(String[] args) throws Exception {
		System.out.println("Initialisation du Context JAXB");
		JAXBContext context = JAXBContext.newInstance(Compte.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		System.out.println("Transformation XML => OBJET");
		Compte cp = (Compte) unmarshaller.unmarshal(new File("comptes.xml"));
		
		System.out.println(cp);
	}

}
