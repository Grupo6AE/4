package com.servicios;


import jakarta.ejb.Remote;

import java.util.List;

@Remote
public interface UsuarioBeanRemote {

    void actualizar(Usuario usuario) ;
    void borrar(int idUsuario) ;
    List<Usuario> obtenerTodos() ;
    Usuario buscar(int idUsuario) ;
    List<Usuario> obtenerTodos(String filtro) ;
    void crear(Usuario usuario) ;
    boolean login(String email, String clave);
}
