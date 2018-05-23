import java.util.ArrayList;
import java.util.Collections;

public class RandomATron {

    private ArrayList<String> students;

    public RandomATron() {
        students = new ArrayList<>();
        Collections.addAll(students, "PAUL", "ANDREW", "PATRICK", "DANIEL", "SARAH", "KELSIE", "LIAM", "ED", "SCOTT", "LYLE", "STUART", "CONNOR", "FRASER", "CALLUM", "CHRIS", "RUARIDH", "NIKHIL", "ROBERTO", "BRIAN");
        Collections.sort(students);
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public String randomName() {
        Collections.shuffle(students);
        return students.get(0);
    }

    public ArrayList<String> randomPair() {
        ArrayList<String> randomPair = new ArrayList<>();
        Collections.shuffle(students);
        randomPair.add(students.get(0));
        randomPair.add(students.get(1));
        return randomPair;
    }

    public void addStudent(String name) {
        this.students.add(name.toUpperCase());
    }

    public void removeStudent(String name) {
        if (students.contains(name.toUpperCase())) {
        this.students.remove(name);}
    }

    public void updateName(String name, String newName) {
        int index = this.students.indexOf(name);
        this.students.set(index, newName);
    }
}
