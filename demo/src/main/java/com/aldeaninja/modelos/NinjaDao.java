package com.aldeaninja.modelos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.w3c.dom.events.Event;

import com.aldeaninja.Conexion;
import com.aldeaninja.Operacion;
import com.aldeaninja.DAO.getById;
import com.aldeaninja.DAO.getallDao;
import com.aldeaninja.Ninja.Ninja;

public class NinjaDao implements getallDao<Ninja>, getById<Ninja> {

    @Override
    public Ninja getById(int id) {
        Operacion.setConnection(Conexion.MySQLConnection());
        String stm = "SELECT * FROM ninja where id = 2;";
                try (PreparedStatement ps = Operacion.getConnection().prepareStatement(stm)) {
            ps.setLong(1, id);
                 ResultSet rs = Operacion.query_db(ps);
                 if (rs.next()) {

                 
                    ninjaBuilder eventBuilder = new ninjaConcreteBuil();

                    Ninja sqlnuevo = eventBuilder.id(rs.getInt("id"))
                    .nombreNinja(rs.getString("nombreNinja"))
                    .rangoNinja(rs.getInt("rangoNinja"))
                    .aldea(rs.getString("aldea"))
                    .build();

                    return sqlnuevo;
                 }else{
                        System.out.println("ERROR:el ninja no fue encontrado");
                    }
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }finally{
                     Operacion.closeConnection();
                    }
         return null;
                

                    

                 }

    @Override
    public List<Ninja> getAll() {
        return null;
 
    }

}
