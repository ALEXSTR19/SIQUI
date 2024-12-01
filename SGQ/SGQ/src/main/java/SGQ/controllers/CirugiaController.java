package SGQ.controllers;

import SGQ.Entities.CirugiaEntity;
import SGQ.Entities.PacienteEntity;
import SGQ.services.CirugiaService;
import SGQ.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class CirugiaController {

    @Autowired
    private CirugiaService cirugiaService;

    @GetMapping(value="/cirugia")
    public ResponseEntity<Object> get(){
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            List<CirugiaEntity> list = cirugiaService.findAll();
            return new ResponseEntity<Object>(list, HttpStatus.OK);
        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return  new ResponseEntity<>(map,  HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping(value="cirugia/{Id}")
    public  ResponseEntity<Object> getById(@PathVariable Long Id){
        try {
            CirugiaEntity data = cirugiaService.findById(Id);
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        }
        catch (Exception e){
            Map<String, Object> map = new HashMap<String , Object>();
            map.put("message", e.getMessage());
            return new  ResponseEntity<>(map,  HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping(value= "/cirugia")

    public ResponseEntity<Object> create(@RequestBody CirugiaEntity cirugia){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            CirugiaEntity res =  cirugiaService.save(cirugia);
            return new ResponseEntity<Object>(res, HttpStatus.OK);
        }
        catch(Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @PutMapping("/cirugia/{Id}")
    public ResponseEntity<Object> update(@RequestBody CirugiaEntity cirugia, @PathVariable Long Id){
        Map<String, Object> map = new HashMap<String, Object>();
        try{
            CirugiaEntity cirugiaActual = cirugiaService.findById(Id);

            cirugiaActual.setFecha(cirugia.getFecha());
            cirugiaActual.setNumcirugia(cirugia.getNumcirugia());
            cirugiaActual.setNumquirofano(cirugia.getNumquirofano());
            cirugiaActual.setNumexpediente(cirugia.getNumexpediente());
            cirugiaActual.setPaciente(cirugia.getPaciente());
            cirugiaActual.setPaterno(cirugia.getPaterno());
            cirugiaActual.setMaterno(cirugia.getMaterno());
            cirugiaActual.setInianestesia(cirugia.getInianestesia());
            cirugiaActual.setTeranestesia(cirugia.getTeranestesia());
            cirugiaActual.setMedicamento(cirugia.getMedicamento());
            cirugiaActual.setSuturas(cirugia.getSuturas());
            cirugiaActual.setMaterial(cirugia.getMaterial());
            cirugiaActual.setAnestesiologo(cirugia.getAnestesiologo());
            cirugiaActual.setEnfermera_Circulante(cirugia.getEnfermera_Circulante());
            cirugiaActual.setEnfermera_Instrumentista(cirugia.getEnfermera_Instrumentista());
            cirugiaActual.setInterno(cirugia.getInterno());
            cirugiaActual.setMedico_ayudante(cirugia.getMedico_ayudante());
            cirugiaActual.setTipo_cirugia(cirugia.getTipo_cirugia());
            cirugiaActual.setAnestesia(cirugia.getAnestesia());
            cirugiaActual.setApoyoexterno(cirugia.getApoyoexterno());
            cirugiaActual.setNombrecirugia(cirugia.getNombrecirugia());
            cirugiaActual.setStatus(cirugia.getStatus());


            CirugiaEntity res = cirugiaService.save(cirugia);

            return new ResponseEntity<Object>(res, HttpStatus.OK);
        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
    @DeleteMapping("/cirugia/{Id}")
    public  ResponseEntity<Object> delete(@PathVariable Long Id){
        Map<String, Object> map = new HashMap<String, Object>();

        try {
            CirugiaEntity pacienteActual = cirugiaService.findById(Id);
            cirugiaService.delete(pacienteActual);
            map.put("Borrado", true);
            return new ResponseEntity<Object>(map, HttpStatus.OK);

        }
        catch (Exception e){
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
