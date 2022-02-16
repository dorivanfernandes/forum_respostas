package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import org.springframework.stereotype.Service

@Service
class CursoService (private var cursos: List<Curso>) {

    init {
        val curso = Curso(1, "Kotlin", "Programacao")

        cursos = listOf(curso)
    }

    fun buscaPorId(id: Long): Curso{
        return cursos.stream().filter({c -> c.id == id}).findFirst().get()
    }

}
