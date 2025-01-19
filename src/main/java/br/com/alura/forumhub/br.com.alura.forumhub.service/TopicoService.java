package br.com.alura.ForumHub.service;

import br.com.alura.ForumHub.model.Topico;
import br.com.alura.ForumHub.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository repository;

    public List<Topico> listarTodos() {
        return repository.findAll();
    }

    public Optional<Topico> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Topico salvar(Topico topico) {
        return repository.save(topico);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
