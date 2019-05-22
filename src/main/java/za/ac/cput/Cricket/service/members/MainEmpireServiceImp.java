package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.members.MainEmpire;
import za.ac.cput.Cricket.repos.members.MainEpireRepoImp;
import za.ac.cput.Cricket.repos.interfaces.MainEmpireRepo;
import za.ac.cput.Cricket.service.serviceInterface.MainEmpireService;

import java.util.Set;

public class MainEmpireServiceImp implements MainEmpireService {
    private MainEmpireServiceImp service = null;
    private MainEmpireRepo repository;

    private MainEmpireServiceImp() {
        this.repository = MainEpireRepoImp.getRepository();
    }

    public MainEmpireService getService() {
        if (service == null) service = new MainEmpireServiceImp();
        return service;
    }

    public Set<MainEmpire> getAll () {
        return this.repository.getAll();
    }

    @Override
    public MainEmpire create(MainEmpire mainEmpire) {
        return this.repository.create(mainEmpire);
    }

    @Override
    public MainEmpire update(MainEmpire mainEmpire) {
        return this.repository.update(mainEmpire);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public MainEmpire read(String s) {
        return this.repository.read(s);
    }
}
