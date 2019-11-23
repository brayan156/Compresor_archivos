package proyecto.Comprensor;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Comprimidor")
public class Controlador {
    ArrayList<HuffmanCodeSolution> comprimidos= new ArrayList<>();



    @PostMapping(path = "post/descomprimir")
    public Archivo getLibreria(@RequestBody Archivo archivo) {
        for (int i=0; i<comprimidos.size();i++){
            if (comprimidos.get(i).Nombre.equals(archivo.getNombre())){
                comprimidos.get(i).decode(archivo.getDatos());
                archivo.setDatos(comprimidos.get(i).Decoded);
                comprimidos.get(i).Decoded="";
                break;
            }
        }
        return archivo;
    }

    @PostMapping(path ="post/comprimir")
    public Archivo createLibro(@RequestBody Archivo archivo) {
        HuffmanCodeSolution comprensor=new HuffmanCodeSolution();
        comprensor.encode(archivo.getDatos());
        archivo.setDatos(comprensor.Code);
        comprensor.Nombre=archivo.getNombre();
        comprimidos.add(comprensor);
        return archivo;
    }


}
