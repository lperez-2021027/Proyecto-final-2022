
package org.in5bm.luisperez.models.dao;

/**
 *
 * @author Luis Carlos Pérez
 * @date 26/09/2022
 * @time 11:46:00
 * 
 *Código técnico: IN5BM
 *
 */

import java.util.List;
import org.in5bm.luisperez.models.domain.Materia;
import org.in5bm.luisperez.models.idao.IMateriaDAO;
import org.in5bm.luisperez.db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class MateriasDaoImpl implements IMateriaDAO{
    
    // Sentencias SQL
    
    private static final String SQL_SELECT = "select id_materia, nombre_materia, "
            + "ciclo_escolar, horario_inicio, horario_final, catedratico, salon, "
            + "cupo_maximo, cupo_minimo, nota from materias";
    /*private static final String SQL_SELECT;
    private static final String SQL_SELECT;
    private static final String SQL_SELECT;
    private static final String SQL_SELECT;
    */
    
    private Connection con = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private Materia materia = null;
    private List<Materia> listaMaterias = new ArrayList<>();

    @Override
    public List<Materia> getAll() {
        try {
            pstmt = Conexion.getInstance().getConexion().prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                materia = new Materia(rs.getInt("id_materia"));
                listaMaterias.add(materia);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
        }
        return listaMaterias;
    }

    @Override
    public int add(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Materia materia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
