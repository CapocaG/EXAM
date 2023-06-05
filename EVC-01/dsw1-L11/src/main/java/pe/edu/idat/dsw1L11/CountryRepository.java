package pe.edu.idat.dsw1L11;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country lun = new Country();
		lun.setName("LUNES");
		lun.setTraduccion("lunes");

		countries.put(lun.getName(), lun);

		Country mar = new Country();
		mar.setName("MARTES");
		mar.setTraduccion("martes");

		countries.put(mar.getName(), mar);

		Country mie = new Country();
		mie.setName("MIERCOLES");
		mie.setTraduccion("miercoles");

		countries.put(mie.getName(), mie);

		Country jue = new Country();
		jue.setName("JUEVES");
		jue.setTraduccion("jueves");

		countries.put(jue.getName(), jue);

		Country vie = new Country();
		vie.setName("VIERNES");
		vie.setTraduccion("viernes");

		countries.put(vie.getName(), vie);

		Country sa = new Country();
		sa.setName("SABADO");
		sa.setTraduccion("sabado");

		countries.put(sa.getName(), sa);

		Country dom = new Country();
		dom.setName("DOMINGO");
		dom.setTraduccion("domingo");

		countries.put(dom.getName(), dom);

    }
    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
    
}
