package org.in5bm.luisperez.models.idao;

/**
 *
 * @author Luis Carlos Pérez+
 * @date 26/09/2022
 * @time 11:45:20
 * 
 *Código técnico: IN5BM
 */

import org.in5bm.luisperez.models.domain.Materia;
import java.util.List;

public interface IMateriaDAO {
    
    // Listar los registros
    public List<Materia> getAll();
    
    // Insertar registro
    public int add(Materia materia);
    
    // Actualizar registro
    public int update(Materia materia);
    
    // Eliminar registro
    public int delete(Materia materia);
    
}
