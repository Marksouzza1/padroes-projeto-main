package src.repositories;

import java.util.ArrayList;
import java.util.List;

import src.entities.DisciplinaEntity;

public class DisciplinaRepository {

    private static DisciplinaRepository instance;

    private List<DisciplinaEntity> disciplinas;

    private DisciplinaRepository() {
        this.disciplinas = new ArrayList<>();
    }

    public static DisciplinaRepository getInstance() {
        if (instance == null) {
            instance = new DisciplinaRepository();
        }
        return instance;
    }

    public boolean insert(DisciplinaEntity disciplina) {
        return this.disciplinas.add(disciplina);
    }

    public DisciplinaEntity getByID(int id) {
        for (DisciplinaEntity disciplina : this.disciplinas) {
            if (disciplina.getId() == id) {
                return disciplina;
            }
        }
        return null;
    }

    public boolean update(DisciplinaEntity disciplina) {
        int index = this.disciplinas.indexOf(disciplina);
        if (index >= 0) {
            this.disciplinas.set(index, disciplina);
            return true;
        }
        return false;
    }

    public boolean delete(DisciplinaEntity disciplina) {
        return this.disciplinas.remove(disciplina);
    }
}
