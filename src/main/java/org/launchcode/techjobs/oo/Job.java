package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        if (name == null || name.equals("")) {
            return "Data not available";
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        if (employer == null || employer.toString().equals("")) {
            return "Data not available";
        } else {
            return employer.toString();
        }
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getLocation() {
        if (location == null || location.toString().equals("")) {
            return "Data not available";
        } else {
            return location.toString();
        }
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPositionType() {
        if (positionType == null || positionType.toString().equals("")) {
            return "Data not available";
        } else {
            return positionType.toString();
        }
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        if (coreCompetency == null || coreCompetency.toString().equals("")) {
            return "Data not available";
        } else {
            return coreCompetency.toString();
        }
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        if (this.getName().equals("Data not available") &&
                this.getEmployer().equals("Data not available") &&
                this.getLocation().equals("Data not available") &&
                this.getPositionType().equals("Data not available") &&
                this.getCoreCompetency().equals("Data not available")) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\nID: " + this.getId() +
                    "\nName: " + this.getName() +
                    "\nEmployer: " + this.getEmployer() +
                    "\nLocation: " + this.getLocation() +
                    "\nPosition Type: " + this.getPositionType() +
                    "\nCore Competency: " + this.getCoreCompetency() +
                    "\n";
        }
    }
}