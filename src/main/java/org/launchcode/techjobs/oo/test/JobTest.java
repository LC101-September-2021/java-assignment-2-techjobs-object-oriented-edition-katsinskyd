package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;

    @Before
    public void createJobs() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job3 = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        job4 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer());
        assertEquals("Desert", job1.getLocation());
        assertEquals("Quality control", job1.getPositionType());
        assertEquals("Persistence", job1.getCoreCompetency());
        assertTrue(job1 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringMethod() {
        assertEquals("\nID: " + job1.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence\n", job1.toString());
    }

    @Test
    public void testEmptyFieldsToString() {
        assertEquals("\nID: " + job3.getId() +
                "\nName: Product tester" +
                "\nEmployer: Data not available" +
                "\nLocation: Data not available" +
                "\nPosition Type: Data not available" +
                "\nCore Competency: Data not available\n", job3.toString());
    }

    @Test
    public void testEmptyJobToString() {
        assertEquals("OOPS! This job does not seem to exist.", job4.toString());
    }
}