package com.servicios;

import java.util.List;

public class UsuarioBean implements UsuarioBeanRemote {
    @Override
    public void actualizar(Usuario usuario) {

    }

    @Override
    public void borrar(int idUsuario) {

    }

    @Override
    public List<Usuario> obtenerTodos() {
        return null;
    }

    @Override
    public Usuario buscar(int idUsuario) {
        return null;
    }

    @Override
    public List<Usuario> obtenerTodos(String filtro) {
        return null;
    }

    @Override
    public void crear(Usuario usuario) {

    }

    @Override
    public boolean login(String email, String clave) {
        return false;
    }
}
