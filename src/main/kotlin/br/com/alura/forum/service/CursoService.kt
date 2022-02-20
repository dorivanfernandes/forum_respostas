package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.repository.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoService (private var cursoRepository: CursoRepository) {

    fun buscaPorId(id: Long): Curso{
        return cursoRepository.getById(id)
    }

}
