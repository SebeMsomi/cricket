package za.ac.cput.Cricket.repos.members;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.Cricket.domain.members.Player;
import za.ac.cput.Cricket.factory.members.Playerfactory;
import za.ac.cput.Cricket.repos.members.impl.PlayerRepoImp;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlayerRepoImpTest {
    private PlayerRepo repository;
    private Player player;

    private Player getSavedCourse() {
        Set<Player> savedCourses = this.repository.getAll();
        return savedCourses.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = PlayerRepoImp.getRepository();
        this.player = Playerfactory.getPlayer("Shaun Polock",30);
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll() {
        Set<Player> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }

    @Test
    public void create() {
        Player created = this.repository.create(this.player);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created, this.player);
    }

    @Test
    public void update() {
        String newname = "New Empire update";
        int newage = 25;
        Player player = new Player.Builder().name(newname).build();
        Player player1 = new Player.Builder().age(newage).build();
        System.out.println("In update, about_to_updated = " + player + player1);
        Player updated = this.repository.update(player);
        Player upd = this.repository.update(player1);
        System.out.println("In update, updated = " + updated + upd);
        Assert.assertNull( updated.getName(),updated.getAge());
        getAll();
    }

    @Test
    public void delete() {
        Player savedCourse = getSavedCourse();
        this.repository.delete(savedCourse.getName());
        getAll();
    }

    @Test
    public void read() {
        Player savedCourse = getSavedCourse();
        System.out.println("In read, courseId = "+ savedCourse.getName());
        Player read = this.repository.read(savedCourse.getName());
        System.out.println("In read, read = " + read);
        getAll();
        Assert.assertEquals(savedCourse, read);
    }

}