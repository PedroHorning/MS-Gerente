package br.net.gerente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gerente")
public class GerenteController {
	@Autowired
    private GerenteRepository gerenteRepository;

    @CrossOrigin(origins= "*")
    @GetMapping
    public List<Gerente> getAllGerentes() {
        return gerenteRepository.findAll();
    }
    

    @CrossOrigin(origins= "*")
    @PostMapping
    public Gerente createGerentes(@RequestBody Gerente gerente) { 
    	Gerente savedGerente = gerenteRepository.save(gerente);
        
        return savedGerente;
    }

    @CrossOrigin(origins= "*")
    @PutMapping("/{id}")
    public Gerente Gerente(@PathVariable Integer id, @RequestBody Gerente gerenteData) {
    	Gerente gerente = gerenteRepository.findById(id).orElse(null);
        if (gerente != null) {
        	gerente.setName(gerenteData.getName());
        	gerente.setEmail(gerenteData.getEmail());
        	gerente.setCpf(gerenteData.getCpf());
        	gerente.setCellphone(gerenteData.getCellphone());

            return gerenteRepository.save(gerente);
        }
        return null;
    }


    @CrossOrigin(origins= "*")
    @DeleteMapping("/{id}")
    public void deleteGerente(@PathVariable Integer id) {
    	gerenteRepository.deleteById(id);
    }
}
