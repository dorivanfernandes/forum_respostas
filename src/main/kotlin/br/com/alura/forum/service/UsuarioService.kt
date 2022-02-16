package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(private var usuarios: List<Usuario>) {

    init {
        val usuario = Usuario(1, "Ana da Silva", "ana@gmail.com")

        usuarios = listOf(usuario)
    }

    fun buscaPorId(id: Long): Usuario{
        return usuarios.stream().filter({ u -> u.id == id}).findFirst().get()
    }

}
