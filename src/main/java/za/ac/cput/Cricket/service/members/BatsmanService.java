package za.ac.cput.Cricket.service.members;

import za.ac.cput.Cricket.domain.members.Batsman;
import za.ac.cput.Cricket.service.Servic;

import java.util.Set;

public interface BatsmanService extends Servic<Batsman,String> {
    Set<Batsman> getAll();
}
