package SGQ.controllers;

import SGQ.Entities.PacienteEntity;
import SGQ.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping(value="/pacientes")
    public ResponseEntity<Object> get(){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<PacienteEntity> list = pacienteService.findAll();
            return new ResponseEntity<Object>(list, HttpStatus.OK);
        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return  new ResponseEntity<>(map,  HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(value="pacientes/{Id}")
    public  ResponseEntity<Object> getById(@PathVariable Long Id){
        try {
            PacienteEntity data = pacienteService.findById(Id);
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        }
        catch (Exception e){
            Map<String, Object> map = new HashMap<String , Object>();
            map.put("message", e.getMessage());
            return new  ResponseEntity<>(map,  HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value= "/pacientes")
public ResponseEntity<Object> create(@RequestBody PacienteEntity paciente){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
             PacienteEntity res =  pacienteService.save(paciente);
             return new ResponseEntity<Object>(res, HttpStatus.OK);
        }
        catch(Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
@PutMapping("/pacientes/{Id}")
    public ResponseEntity<Object> update(@RequestBody PacienteEntity paciente, @PathVariable Long Id){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            PacienteEntity pacienteActual = pacienteService.findById(Id);

            pacienteActual.setExpediente(paciente.getExpediente());
            pacienteActual.setPaciente(paciente.getPaciente());
            pacienteActual.setPaterno(paciente.getPaterno());
            pacienteActual.setMaterno(paciente.getMaterno());
            pacienteActual.setSexo(paciente.getSexo());
            pacienteActual.setEdad(paciente.getEdad());
            pacienteActual.setCurp(paciente.getCurp());
            pacienteActual.setDomicilio(paciente.getDomicilio());
            pacienteActual.setTelefono(paciente.getTelefono());
            pacienteActual.setElabora(paciente.getElabora());
            pacienteActual.setFecha(paciente.getFecha());
            pacienteActual.setUbicacion(paciente.getUbicacion());

            PacienteEntity res = pacienteService.save(paciente);

            return new ResponseEntity<Object>(res, HttpStatus.OK);
        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);

        }
}
        @DeleteMapping("/pacientes/{Id}")
        public  ResponseEntity<Object> delete(@PathVariable Long Id){
        Map<String, Object> map = new HashMap<String, Object>();

        try {
            PacienteEntity pacienteActual = pacienteService.findById(Id);
            pacienteService.delete(pacienteActual);
            map.put("Borrado", true);
            return new ResponseEntity<Object>(map, HttpStatus.OK);

        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        }
}
